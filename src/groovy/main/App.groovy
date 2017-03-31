/**
 * Created by vitaly on 31.03.17.
 */

public class PackageDescription {
    public String packageName;
    public String domain;
    public String packageId;
    public String comment;
    public String packageUrl;
    public List<ClassDescription> classes = new ArrayList<>();

    @Override
    public String toString() {
        return "PackageDescription{" +
                "packageName='" + packageName + '\'' +
                ", packageId='" + packageId + '\'' +
                ", comment='" + comment + '\'' +
                ", packageUrl='" + packageUrl + '\'' +
                ", classes=" + classes +
                '}';
    }
}

public class ClassDescription {
    public String name;
    public String comment;
    public String stereotype;
    public List<FieldDescription> fields = new ArrayList<>();
    public List<EnumItemDescription> enumitems = new ArrayList<>();

    @Override
    public String toString() {
        return "ClassDescription{" +
                "name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", stereotype='" + stereotype + '\'' +
                ", fields=" + fields +
                ", enumitems=" + enumitems +
                '}';
    }
}

public class FieldDescription {
    public String name;
    public String type;
    public String comment;

    @Override
    public String toString() {
        return "FieldDescription{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}


public class EnumItemDescription {
    public String name;
    public String comment;

    @Override
    public String toString() {
        return "EnumItemDescription{" +
                "name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}


public class App {

    public static String rootUrl = 'https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/'

    public static typeMapper = [
            "StringValue": "String"
    ]

    public static typesSet = new HashSet();
    public static absentTypes = new HashSet();
    public static map = new HashMap();
    public static lostClasses = new TreeMap();
    public static classPackage = new TreeMap();
    public static List<PackageDescription> packages = new ArrayList();

    /*public static map = [
            "Test ABE": "https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_CN2.cED6.jE.eS.l.f7G.uC.b7.u.hA-content.html",
    ]*/

    public static void main(String[] args) {


        def getUrlResponce = { String url ->
            URLConnection connection = new URL(url).openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            connection.connect();

            BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString()
        }

        def getAttrTable = { text ->
            def pattern = /(?:<table class="DetailsTable"><tr><td class="DetailsTitle" colspan="\d+"><a name="attributeDetail">)(Attribute Details)(?:<\/a><\/td><\/tr><\/table>)/
            try {
                def resultComment = text =~ pattern
                def attrTableExist = resultComment[0][1]
                if (attrTableExist == 'Attribute Details') {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception e) {
                return false
            }

        }
        def getPackageName = { PackageDescription packageDescription ->

            String name = packageDescription.packageId

            String domain = normalize(packageDescription.domain);

            def prefix = "org.tmforum"

            prefix = prefix + "." + domain;

            if (name.contains(" ABE")) {
                prefix = prefix + ".abe";
            }

            name = normalize(name)

            def result = prefix + '.' + name.split(/\./).reverse().join('.')

            return result;

        }


        def getComment = { String text ->
            try {
                def resultComment = text =~ /(?:<a name="documentationSection"><\\/a>)([\w\W]+?)(?:<\\/p>)/
                def comment = resultComment[0][1]
                return comment
            } catch (Exception e) {
                return null
            }

        }

        def getName = { String text ->
            try {
                def result = text =~ /(?:<span class="ElementTitle">)([\w\s-]+)(?:<\\/span>)/
                def name = result[0][1]
                return name
            } catch (Exception e) {
                return null
            }
        }

        def getDomain = { String text ->
            try {
                def result = text =~ /(?:<span class="PackageFullyQualifiedName">)([\w\W]+?)(?:<\\/span>)/
                def name = result[0][1]
                return name
            } catch (Exception e) {
                return null
            }
        }
        def getRows = { String text, String pattern ->
            def result = text =~ pattern
            return result
        }

        def getText = { String text, String pattern ->
            try {
                def matcher = text =~ pattern
                def result = matcher[0][1]
                return result
            } catch (Exception e) {
                return null;
            }


        }

        def fillMap = {
            def rootPage = getUrlResponce(rootUrl + '3E3F0EC000E9-top-summary.html')
            def packages = rootPage =~ /(?:<area shape="rect" coords="\d+,\d+,\d+,\d+" href=")([\w\W]+?)(?:" alt=")([\w\W]+?)(?:">)/
            packages.each {
                def key = it[2]
                def value = rootUrl + it[1]
                map[key] = value
            }
            return map
        }

        def getScreenType = { text ->
            try {
                def matcher = text =~ /(?:<td class="NavBarMainHighlight">)([\w\W]+?)(?:<\\/td>)/
                def result = matcher[0][1]
                return result
            } catch (Exception e) {
                return null;
            }
        }

        def getAttrType = { text ->
            try {
                def pattern = /(?:<tr><td class="PropertyName"><b>Type<\/b><\/td><td class="PropertyValue"><a href=")([\w\W]+?)">([\w\W]+?)(?:<\/a><\/td><\/tr>)/;
                def matcher = text =~ pattern
                def url = matcher[0][1];
                def name = matcher[0][2];
                return [class: "${name}", url: "${url}"]
            } catch (Exception e) {
                println "ERROR $text"
                return null;
            }
        }

        map = fillMap()
                //.findAll { it.key == 'Agreement ABE' }


        map.each {
            //def text = new URL(it.value).text
            //println text
            def url = it.value
            def resoursePath = it.value.split('/')[-1]
            def urlPath = it.value - resoursePath

            println it.key + " $url"


            def text = getUrlResponce(url)

            //name
            def name = getName(text)

            //domain
            def domain = getDomain(text)

            //comment
            def comment = getComment(text)



            println " * " + it.key
            println " ** " + name
            println " ** @" + domain
            println " // ** " + comment

            println " & ${getScreenType(text)}";    //package

            PackageDescription packageDescription = new PackageDescription();
            packageDescription.packageId = it.key
            packageDescription.packageUrl = url
            packageDescription.domain     = domain
            packageDescription.packageName = getPackageName(packageDescription)
            packageDescription.comment = comment ?: null

            //table of classes
            def tableItemsResult = text =~ /(?:<td class="ClassTableEntryLink"><a title=)([\w\W]+?)(?:<img border=)/

            tableItemsResult.each {

                ClassDescription classDescription = new ClassDescription();



                def tableItem = it[1]
                def className = tableItem.split('::')[-1]
                def linkUrlMtch = tableItem =~ /(?:href=")([\w\W]+?)(?:">)/
                def link = urlPath + linkUrlMtch[0][1]


                def textClass     = getUrlResponce(link).toString();

                def classNameDescr = getName(textClass)
                def classComment = getComment(textClass)

                if (classNameDescr == null) {
                    return
                }

                println " = " + classNameDescr + " [${packageDescription.packageName}] "
                println "   // = " + classComment
                println "   & ${getScreenType(textClass)}";    //elements

                def fillClassDescriptor = {cl,Map map ->
                    def key = map.keySet().iterator().next()
                    classDescription.name = classNameDescr.toString().replaceFirst(key, "").trim();
                    classDescription.comment = classComment ?: null
                    classDescription.stereotype = map[key]
                }

                fillClassDescriptor(classDescription, ["Class" : 'class']);
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

                def rows
                def rowsEnums

                if (classNameDescr.toString().contains("Enumeration")) {
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


                } else {
                    rows = getRows(textClass, /(?:<tr>[\r\n]?<td class="packagedElementType">)([\w\W]+?)(?:<\\/tr>)/)
                    rows.each {


                        def rowItem = it[1]


                        def typePattern = /(?:^)([\w\W]+?)(?:<\\/td>)/
                        def fieldPattern = /(?:<\\/a>[\w\W]+?>)([\w\W]+?)(?:<\\/a>)/
                        def commentPattern = /(?:name="documentationSection"><\/a>)([\w\W]+?)(?:<\/p><\/td>$)/

                        def type = getText(rowItem, typePattern).toString();
                        def field = getText(rowItem, fieldPattern).toString().replaceAll(/_/, '');
                        def fieldComment = getText(rowItem, commentPattern);





                        def normalizeType = { String ic ->
                            if (ic.contains('«') || ic.contains('»')) {
                                def pattern = /(?:^«\w+»)\s+(\w+)/;
                                def matcher = ic =~ pattern
                                return matcher[0][1];
                            }  else {
                                return ic;
                            }
                        }

                        type = normalizeType(type)

                        if (typeMapper.keySet().contains(type)) {
                            type = typeMapper[type]
                        }


                        typesSet.add(type);

                        println "   row = $type : $field // $fieldComment "

                        FieldDescription item = new FieldDescription();
                        item.name = field
                        item.comment = fieldComment ?: null
                        item.type = type
                        classDescription.fields.add(item)

                        //attribute table
                        def isAttributeTable = getAttrTable(textClass)
                        if (isAttributeTable) {
                            def attrType = getAttrType(textClass)
                            if (attrType != null) {
                                def lostClassName = normalizeType(attrType['class'])
                                lostClasses.put(lostClassName, attrType['url'])
                            }

                        }
                    }
                }

                packageDescription.classes.add(classDescription);
            }

            packages.add(packageDescription);
        }



        def currentDir = new File(".").getAbsolutePath() + '/src/java/main/'

        def getPackageDoc = { PackageDescription pck ->

            def packageStringsList = []
            if (pck.comment != null) {
                packageStringsList = pck.comment.toList().collate(70)*.join()
            }

            def result = "/**\n";
            result += "* ${pck.packageId} \n"

            result += "* @see <a href=\"URL#${pck.packageUrl}\">${pck.packageId}</a> \n"

            packageStringsList.each {
                result += "* $it \n"
            }

            result += "* @since SID_R16.5\n";
            result += "*/\n\n";

            return result;
        }


        def classHeader = {
            PackageDescription pck, comment, className, stereotype ->


                def result = getPackageDoc(pck)

                result += "package ${pck.packageName} ;\n\n"

                def commentStringsList = []

                if (comment != null) {
                    commentStringsList = comment.toList().collate(70)*.join()
                }

                result += "/**\n";


                commentStringsList.each {
                    result += "* $it \n"
                }

                result += " @since SID_R16.5\n";
                result += "*/ \n\n";

                result += "public $stereotype $className {\n\n"

                return result;
        }

        def classFooter = { return '}' }

        def fieldHeader = { comment, type, name ->
            def commentStringsList = []
            if (comment != null) {
                commentStringsList = comment.toList().collate(70)*.join()
            }

            def result = "\n/**  \n";
            result += "* Field ${name}"
            commentStringsList.each {
                result += "\n* $it \n"
            }
            result += "\n*/";

            result += "\nprivate $type $name ;\n"

            return result;
        }

        def itemHeader = { comment, name ->
            def commentStringsList = []
            if (comment != null) {
                commentStringsList = comment.toList().collate(70)*.join()
            }
            def result = "\n/**  \n";
            result += "* Field ${name}"
            commentStringsList.each {
                result += "\n* $it \n"
            }
            result += "\n*/";

            result += "$name ,\n"
            return result;
        }



        packages.each { p ->

            final FileTreeBuilder treeBuilder = new FileTreeBuilder(new File(currentDir))

            def packagePathString = p.packageName.replaceAll(/\./, '/');

            def packagePath = currentDir + packagePathString

            def created = new File(packagePath).mkdirs()


            p.classes.each {
                ClassDescription c ->
                    StringBuilder sb = new StringBuilder();
                    File classFile = new File(packagePath + '/' + c.name + '.java');
                    sb.append(classHeader(p, c.comment.toString().replaceAll(/<\/br>/, ''), c.name, c.stereotype))

                    if (c.stereotype == 'enum') {
                        c.enumitems.each { f ->
                            sb.append(itemHeader(f.comment, f.name) + '\n\n');
                        }
                    }



                    if (c.stereotype == 'class') {
                        c.fields.each { f ->
                            //check type
                            if (typesSet.contains(f.type)) {
                                absentTypes.add(f.type)
                            }
                            sb.append(fieldHeader(f.comment, f.type, f.name) + '\n\n');
                        }
                    }
                    sb.append(classFooter())
                    //classFile << sb.toString();
            }


        }

        println "Losted [${lostClasses.size()}]: ${lostClasses}"
        lostClasses.sort().each {
            def textClass = getUrlResponce(rootUrl + it.value).toString();
            println " " + it.key
        }

        def collectedList = lostClasses.collect {
            [it.key]
        }

        println collectedList.class
        println collectedList.iterator().next().class

        List lostClassesNames = new ArrayList<>().addAll(collectedList);

        List absentClasses = new ArrayList<>().addAll(absentTypes);

        println "Absent types [${absentClasses.size()}]: ${absentClasses.sort()}"

        def lostAndFound = lostClassesNames.intersect(absentClasses)

        println "Absent / Lost  [${lostAndFound.size()}] : ${lostAndFound}"


        println "Class and packages:"
        classPackage.sort().each {
            println "${it.key} = ${it.value}"
        }
    }

    private static String normalize(String name) {
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


}
