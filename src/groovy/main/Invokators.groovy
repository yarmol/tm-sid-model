import static Utils.*
import static App.*;

/**
 * Created by vitaly on 01.04.17.
 */
class Invokators {

    public static String normalize(String name) {
        if (name.contains("&amp;") || name.contains("&")) {
            name = name.replaceAll(/&amp;/, 'And').replaceAll(/&/, 'And')
        }

        if (name.contains(" ABE")) {
            name = (name - "ABE").trim();
        }

        name = name.replaceAll(/\s/, ".");

        name = name.toString().toLowerCase();
        return name;
    }

    public static void classFiller(textClass, classDescription) {
        def rows
        rows = getRows(textClass, /(?:<tr>[\r\n]?<td class="packagedElementType">)([\w\W]+?)(?:<\\/tr>)/)
        rows.each {

            def rowItem = it[1]

            def typePattern    = /(?:^)([\w\W]+?)(?:<\\/td>)/
            def fieldPattern   = /(?:<\/a>[\w\W]+?)(?:href="#)([\w\W]+)>([\w\W]+?)(?:<\/a>)/;
                    // v1 = /(?:<\\/a>[\w\W]+?>)([\w\W]+?)(?:<\\/a>)/
            def commentPattern = /(?:name="documentationSection"><\/a>)([\w\W]+?)(?:<\/p><\/td>$)/

            /* row = Place : place #_3E3F0EC000E93C31124B0337" // null
   row = ContactMedium : contactMedium #_3E3F0EC000E93D813C62019F" // null
   row = String : <a name="documentationSection"> #_3E3F0EC000E93D7D6F530055">partyRoleId</a></td><td><p // Unique identifier for PartyRoles
  ?????
            * */
            def type            = getText(rowItem, typePattern).toString();
            def fieldOriginal   = getText(rowItem, fieldPattern,2).toString();
            def field           = fieldOriginal.replaceAll(/_/, '');
            def fieldUrl        = getText(rowItem, fieldPattern,1).toString();
            def fieldComment    = getText(rowItem, commentPattern);

            type  = normalize(type)
            field = normalize(field)

            if (typeMapper.keySet().contains(type)) {
                type = typeMapper[type]
            }

            usedTypes.add(type);

            println "   row = $type : $field #$fieldUrl // $fieldComment "

            FieldDescription item = new FieldDescription();
            item.name = field
            item.comment = fieldComment ?: null
            item.type = type
            classDescription.fields.add(item)

            //field name finder


            //properties table
            /*def propertiesTables = getPropertiesTable(textClass)
            if (propertiesTables != null) {
               println("properties: ")
               propertiesTables.each {
                   def props = getPropertyType(it.toString());
                   println("property item: ${props == null}")
                   if (props != null) {
                       def attrClassName = normalize(props['class'])
                       propertiesTypeClasses.put(attrClassName, props['url'])
                   }
               }
            }

            //attribute table
            def isAttributeTable = getAttrTable(textClass)
            if (isAttributeTable) {
                def attrType = getAttrType(textClass)
                if (attrType != null) {
                    def attrClassName = normalize(attrType['class'])
                    attributeTypeClasses.put(attrClassName, attrType['url'])
                }

            }*/
        }
    }

    public static void fillPackage(htmlPackagePage, key, url) {

        //name
        def name   = getName(htmlPackagePage)

        //domain
        def domain = getDomain(htmlPackagePage)

        //comment
        def comment = getComment(htmlPackagePage)

        println " * "     + key
        println " ** "    + name
        println " ** @"   + domain
        println " // ** " + comment

        println " & ${getScreenType(htmlPackagePage)}";    //package

        PackageDescription packageDescription = new PackageDescription();
        packageDescription.packageId   = key
        packageDescription.packageUrl  = url
        packageDescription.domain      = domain
        packageDescription.packageName = getPackageName(packageDescription)
        packageDescription.comment     = comment ?: null

        //table of classes
        def tableItemsResult = htmlPackagePage =~ /(?:<td class="ClassTableEntryLink"><a title=)([\w\W]+?)(?:<img border=)/


        println "Package ${key} classes: ${tableItemsResult.size()}"
        tableItemsResult.each {
            def tableItem = it[1]
            classFiller(packageDescription, tableItem)
        }

        packages.add(packageDescription);
    }

    public static void classFiller( PackageDescription packageDescription , def tableItem) {

        //def urlPath
        ClassDescription classDescription = new ClassDescription();

        //def tableItem   = it[1]
        def className   = tableItem.split('::')[-1]
        def linkUrlMtch = tableItem =~ /(?:href=")([\w\W]+?)(?:">)/
        def link        = rootUrl + linkUrlMtch[0][1]



        def htmlClassPage = getUrlResponse(link).toString();

        def classNameDescr  = getName(htmlClassPage)
        def classComment    = getComment(htmlClassPage)

        if (classNameDescr == null) {
            return
        }

        existedClasses.add(classNameDescr)

        println " = " + classNameDescr + " [${packageDescription.packageName}] "
        println "   // = " + classComment
        println "   & ${getScreenType(htmlClassPage)}";    //elements

        def fillClassDescriptor = { cl, Map map ->
            def key = map.keySet().iterator().next()
            if (!classDescription.alreadySet
                    && cl.toString().startsWith(key)) {
                classDescription.name       = normalize(cl.toString().replaceFirst(key, "").trim());
                classDescription.stereotype = map[key]
                classDescription.alreadySet = true;
            }
        }

        classDescription.comment = classComment ?: null

        fillClassDescriptor(classDescription, ["Class": 'class']);
        fillClassDescriptor(classDescription, ["Primitive Type": 'class']);
        fillClassDescriptor(classDescription, ["Data Type": 'class']);
        fillClassDescriptor(classDescription, ["Enumeration": 'enum']);

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



        packageDescription.classes.add(classDescription);
    }



    public static void enumFiller(String textClass, classDescription) {
        def rowsEnums
        rowsEnums = getRows(textClass, /(?:<tr>[\r\n]?<td><a title=)([\w\W]+?)(?:<\\/tr>)/)
        rowsEnums.each {

            def rowItem = it[1]
            def fieldPattern = /(?:<\\/a>[\w\W]+?>)([\w\W]+?)(?:<\\/a>)/
            def commentPattern = /(?:name="documentationSection"><\\/a>)([\w\W]+?)(?:<\\/p>)/

            def field = getText(rowItem, fieldPattern).toString().replaceAll(/\s/, '_');
            def fieldComment = getText(rowItem, commentPattern);

            println "   row =  [$field] // $fieldComment "

            EnumItemDescription item = new EnumItemDescription();
            item.name = field.toUpperCase()
            item.comment = fieldComment ?: null
            classDescription.enumitems.add(item)
        }
    }
}
