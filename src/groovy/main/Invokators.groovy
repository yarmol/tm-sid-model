import static App.*
import static Utils.*
/**
 * Created by vitaly on 01.04.17.
 */
class Invokators {

    public static String normalizeDomain(String name) {
        if (name.contains("&amp;") || name.contains("&")) {
            name = name.replaceAll(/&amp;/, 'And').replaceAll(/&/, 'And')
        }

        /*if (name.contains(" ABE")) {
            name = (name - "ABE").trim();
        }

        name = name.replaceAll(/\s/, ".");*/

        name = name.toString().toLowerCase();
        return name;
    }

    public static void classFiller(textClass, classDescription) {


        def rows
        rows = getRows(textClass, /(?:<tr>[\r\n]?<td class="packagedElementType">)([\w\W]+?)(?:<\\/tr>)/)
        rows.each {

            def rowItem = it[1]

            def typePattern = /(?:^)([\w\W]+?)(?:<\\/td>)/
            def fieldPattern = /(?:<\\/a>[\w\W]+?)(?:href="#)([\w\W]+)">([\w\W]+?)(?:<\\/a>)/;
            // v1 = /(?:<\\/a>[\w\W]+?>)([\w\W]+?)(?:<\\/a>)/
            def commentPattern = /(?:name="documentationSection"><\/a>)([\w\W]+?)(?:<\/p><\/td>$)/

            def type            = getText(rowItem, typePattern).toString();
            def fieldOriginal   = getText(rowItem, fieldPattern, 2).toString();
            def field           = fieldOriginal.replaceAll(/_/, '');
            def fieldUrl        = getText(rowItem, fieldPattern, 1).toString();
            def fieldComment    = getText(rowItem, commentPattern);

            type  = normalize(type)
            field = normalize(field)

            if (typeMapper.keySet().contains(type)) {
                type = typeMapper[type]
            }

            if (!type) {
                type = "Object";
            }


            usedTypes.add(type);

            //println "   row = $type : $field #$fieldUrl // $fieldComment "

            FieldDescription item = new FieldDescription();
            item.name = field
            item.nameOriginal = fieldOriginal
            item.url = fieldUrl
            item.comment = fieldComment ?: null

             
            def multiplicityCounter = 1;
            def multiplicity = ''

            //properties table
            def propertiesTables = getPropertiesTable(textClass, item)
            if (propertiesTables != null) {
                multiplicity      = getMultiplicity(propertiesTables)
                def propertyTableType = getPropertyType(propertiesTables)
                if (propertyTableType != null) {

                    def className        = propertyTableType['class'];
                    def classUrl         = propertyTableType['url'];
                    def classHtmlRequest = getUrlResponse(rootUrl + classUrl)
                    def pageType         = getScreenType(classHtmlRequest)

                    if (pageType == 'Element') {
                        def packageUrlRequest  = getPackageUrl(classHtmlRequest)
                        def packageHtmlRequest = getUrlResponse(rootUrl + packageUrlRequest)
                        def packageName        = getName(packageHtmlRequest)

                        Pair pair              = new Pair(packageName, rootUrl + packageUrlRequest);

                        if (!nestedPackages.contains(packageName))  {
                            //println "     [${Thread.currentThread().getName()}] >> $packageName"
                            queue.put(pair)
                        }

                        nestedPackages.add(packageName)
                        //println "      [${Thread.currentThread().getName()}] nestedPackages = ${nestedPackages.size()}"
                    }
                }
            }

            multiplicities << multiplicity.toString();
            if (multiplicity == null) {
                item.type = type;
            } else if (['*','2','3','N'].contains(multiplicity.toString().trim())) {
                item.type = "List<${type}>";
            } else {
                item.type = type;
            }
            ///println "     [${Thread.currentThread().getName()}] multiplicity = ${multiplicity.toString()}"
            classDescription.fields.add(item)
        }
    }

    public static void fillPackage(htmlPackagePage, key, url) {

        //name
        def name = getName(htmlPackagePage)

        //domain
        def domain = getDomain(htmlPackagePage)

        //comment
        def comment = getComment(htmlPackagePage)



        PackageDescription packageDescription = new PackageDescription();
        packageDescription.packageId  = key
        packageDescription.packageUrl = url
        packageDescription.domain      = normalizeDomain(domain)
        packageDescription.packageName = getPackageName(packageDescription)
        packageDescription.comment = comment ?: null

        //table of classes
        def tableItemsResult = htmlPackagePage =~ /(?:<td class="ClassTableEntryLink"><a title=)([\w\W]+?)(?:<img border=)/

        //println " * " + key
        //println " ** " + name
        println "     ** [${Thread.currentThread().getName()}]  @ [${packageDescription.packageName}]"
        //println " // ** " + comment

        //println "Package ${key} classes: ${tableItemsResult.size()}"
        tableItemsResult.each {
            def tableItem = it[1]

            classFiller(packageDescription, tableItem)
        }

        packages.add(packageDescription);
    }

    public static void classFiller(PackageDescription packageDescription, def tableItem) {

        //def urlPath
        ClassDescription classDescription = new ClassDescription();

        //def tableItem   = it[1]
        def className = tableItem.split('::')[-1]
        def linkUrlMtch = tableItem =~ /(?:href=")([\w\W]+?)(?:">)/
        def link = rootUrl + linkUrlMtch[0][1]


        def htmlClassPage = getUrlResponse(link).toString();

        def classNameDescr = getName(htmlClassPage)
        def classComment   = getComment(htmlClassPage)

        if (classNameDescr == null) {
            return
        }

        existedClasses.add(classNameDescr)



        def fillClassDescriptor = {ClassDescription classDescr,String name, Map map ->
            def key = map.keySet().iterator().next()
            if (!classDescr.alreadySet && name.startsWith(key)) {
                classDescription.name = normalize(name.toString().replaceFirst(key, "").trim());
                classDescription.stereotype = map[key]
                classDescription.alreadySet = true;
            }
        }

        fillClassDescriptor(classDescription, classNameDescr, ["Class": 'class']);
        fillClassDescriptor(classDescription, classNameDescr, ["Primitive Type": 'class']);
        fillClassDescriptor(classDescription, classNameDescr, ["Data Type": 'class']);
        fillClassDescriptor(classDescription, classNameDescr, ["Enumeration": 'enum']);

        if (!classDescription?.name?.contains('Class Diagram')) {
            
            classDescription.comment = classComment ?: null

            classDescription.url = link

            classDescription.isAbstract = getAbstract(htmlClassPage);

            /*
            println " = " + classNameDescr + " [${packageDescription.packageName}] "
            println "   // = " + classComment
            println "   @ =  " + link
            println "   = ${classDescription}";    //elements   */


            if (classPackage[classNameDescr] == null) {
                classPackage[classNameDescr] = [packageDescription.packageName]
            } else {
                def listPackages = classPackage[classNameDescr];
                listPackages << packageDescription.packageName
                classPackage[classNameDescr] = listPackages
            }


            if (classNameDescr.toString().contains("Enumeration")) {
                enumFiller(htmlClassPage, classDescription)
            } else {
                classFiller(htmlClassPage, classDescription)
            }

            //inheritance
            fillInheritance(htmlClassPage, classDescription);

            packageDescription.classes.add(classDescription);
        }
    }


    public static void fillInheritance(def htmlClassPage,ClassDescription classDescription) {
        try {
            

            // /Attributes inherited from <a title="([A-Za-z\s]+(?:::)?)+(?:" href=")([\w\W]+?)">/;
            //def pattern = /(?:Attributes inherited from <a title="[A-Za-z\s]+::[A-Za-z\s]+::[A-Za-z\s]+::([A-Za-z\s]+)" href=")([\w\W]+?)">/
            def pattern = /Attributes inherited from[\w\W]+?">[\w\W]+?<\\/table>/
            def matcher = htmlClassPage =~ pattern

            matcher.each {
                def inheritanceTable = it
                def inheritanceMatcher = it =~ /&nbsp;([\w\W]+?)<\\/td>(?:[\w\W]+?)<\\/table>/
                def inheritanceObject = inheritanceMatcher[0][1]
                classDescription.getInheritsDescription().add(inheritanceObject)
                classDescription.getInheritsFrom().add(
                        inheritanceObject
                                .toString()
                                .split('::')[-1]
                .replaceAll(/<\/[\w]+>/,''))
            }
            
            /*def className = matcher[0][1]
            def classUrl  = matcher[0][2]


            classDescription.inheritsFrom = className;

            if (queue.size() == 0) {
                println " inheritsFrom ${className}"
            }                               */
            //println "   => inherits $className"
            
         } catch (IndexOutOfBoundsException e) {
         } catch (Exception e) {
            println "Error [${e}]  ${classDescription.name}"
        }
    }

    public static void enumFiller(String textClass, classDescription) {
        def rowsEnums
        rowsEnums = getRows(textClass, /(?:<tr>[\r\n]?<td><a title=)([\w\W]+?)(?:<\\/tr>)/)
        rowsEnums.each {

            def rowItem = it[1]
            def fieldPattern = /(?:<\\/a>[\w\W]+?>)([\w\W]+?)(?:<\\/a>)/
            def commentPattern = /(?:name="documentationSection"><\\/a>)([\w\W]+?)(?:<\\/p>)/

            def field        = getText(rowItem, fieldPattern).toString().replaceAll(/\s/, '_').toUpperCase();
            def fieldComment = getText(rowItem, commentPattern);

            //println "   row =  [$field] // $fieldComment "

            EnumItemDescription item = new EnumItemDescription();
            item.name                = field
            item.comment             = fieldComment == null ? null : fieldComment.toString().replaceAll(/<\/br>/, '')
            classDescription.enumitems.add(item)
        }
    }
}
