import static App.*

/**
 *
 *
 * Created by vitaly on 31.03.17.
 *
 */
class Utils {

    public static def normalize(String ic) {

        if (ic == null) {
            return ic;
        }

        if (ic.contains('«') || ic.contains('»')) {
            def pattern = /(?:^«[\w\W]+»)\s+(\w+)/;
            def matcher = ic =~ pattern
            def result = matcher[0][1];
            return result.toString().trim();
        } else if (ic.contains(':')) {
            def result = ic.replaceAll(/[\s:_]/, '');
            return result.trim();
        };
        return ic.trim();

    }

    public static def getPackageDoc(PackageDescription pck) {
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


    public static String getClassHeader(PackageDescription pck,
                                        String comment,
                                        ClassDescription c) {

        //println "class header for ${c.stereotype} ${c.name}"
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

        if (c != null) {
            if (c.inheritsDescription != null && c.inheritsDescription.size() != 0) {
                result += "\nInheritance tree:";
                c.inheritsDescription.each {
                    result += " |- \n ${it}"
                }
            }

            result += " @since SID_R16.5\n";
            result += "*/ \n\n";


            def extendsFrom = ''
            def inheritsFrom = c.inheritsFrom
            if (inheritsFrom != null && inheritsFrom.size() != 0) {
                def collectedList = inheritsFrom.collect {
                    it.replaceAll(/<\/[\w]+>/, '')
                }
                def extendsList = collectedList.join(',')
                extendsFrom = "extends " + extendsList;
            }

            def abstractHeader = ''
            if (c.isAbstract) {
                abstractHeader = 'abstract'
            }

            result += "public ${abstractHeader} ${c.stereotype} ${c.name} ${extendsFrom} {\n\n"
        }
        return result;
    }

    public static def classFooter() { return '}' }

    public static def fieldHeader(comment, type, name) {
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

        result += "\nprotected $type $name ;\n"

        return result;
    }

    public static def itemHeader(def comment, def name) {
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

        result += "\n $name ,\n"
        return result;
    }

    public static String getUrlResponse(String url) {
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

    public static def getPropertiesTable(String text, FieldDescription fieldDescription) {
        def fieldUrl = fieldDescription.getUrl().replaceAll(/^#/, '');
        def fieldName = fieldDescription.getNameOriginal()
        def pattern = /(name="/ + fieldUrl + /">/ + fieldName + /<\\/a><\\/span>[\w\W]+?<\\/table>)/
        try {
            def resultComment = text =~ pattern
            return resultComment[0][1];
        } catch (Exception e) {
            return null;
        }
    }


    public static boolean getAttrTable(String text) {
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

    public static def getPackageName(PackageDescription packageDescription) {

        def prefix = "org.tmforum"

        String name = packageDescription.packageId
                .replaceAll(/ABE/, 'business_entity')
                .toLowerCase()
                .replaceAll(/\s/, '_')
                .replaceAll(/::/, '.')

        String domain = packageDescription.domain
                .replaceAll(/ABE/, 'business_entity')
                .toLowerCase()
                .replaceAll(/\s/, '_')
                .replaceAll(/::/, '.');

        //prefix = prefix + "."

        /*if (name.contains(" ABE")) {
            prefix = prefix + ".abe";
            name = name.replaceAll(/ABE$/, '');
        }*/

        //name =

        def result = [prefix, domain, name].join('.')
        //domain.toLowerCase().replaceAll(/\s/, '.').split(/\./).reverse().join('.') +
        //'.' + normalize(name).toLowerCase().replaceAll(/\s/, '.').split(/\./).reverse().join('.');

        return result;

    }


    public static def getComment(String text) {
        try {
            def resultComment = text =~ /(?:<a name="documentationSection"><\\/a>)([\w\W]+?)(?:<\\/p>)/
            def comment = resultComment[0][1]
            def result = comment.toString().replaceAll(/<\/br>/, '')
            return result;
        } catch (Exception e) {
            return null
        }

    }

    public static def getName(String text) {
        try {
            def result = text =~ /(?:<span class="ElementTitle">)([\w\s-]+)(?:<\\/span>)/
            def name = result[0][1]
            return name
        } catch (Exception e) {
            return null
        }
    }

    public static def getDomain(String text) {
        try {
            def result = text =~ /(?:<span class="PackageFullyQualifiedName">)(?:<\\/span>[\w\W]+?"ElementTitle">)?([\w\W]+?)(?:<\\/span>)/;
            // /(?:<span class="PackageFullyQualifiedName">)([\w\W]+?)(?:<\\/span>)/
            def name = result[0][1]
            return name
        } catch (Exception e) {
            return null
        }
    }

    public static def getRows(String text, String pattern) {
        def result = text =~ pattern
        return result
    }

    public static def getText(String text, String pattern, int index = 1) {
        try {
            def matcher = text =~ pattern
            def result = matcher[0][index]
            return result
        } catch (Exception e) {
            return null;
        }


    }

    public static void fillMap(filter = null) {
        def rootPage = getUrlResponse(rootUrl + '3E3F0EC000E9-top-summary.html')
        def packages = rootPage =~ /(?:<area shape="rect" coords="\d+,\d+,\d+,\d+" href=")([\w\W]+?)(?:" alt=")([\w\W]+?)(?:">)/
        packages.each {
            def key = it[2]               //name
            def value = rootUrl + it[1]   //url

            if (filter != null && filter.contains(key)) {
                println "+ Adding $key"
                Pair pair = new Pair();
                pair.add(key.toString(), value)
                queue.put(pair);
                //queue.addToMap(key, value);
            } else if (filter == null) {
                println "+ Adding $key"
                Pair pair = new Pair();
                pair.add(key.toString(), value)
                queue.put(pair);
                //queue.addToMap(key, value);
            }

            //map[key] = value

        }
        //return map
    }


    public static def getPackageUrl(String elementHtmlPage) {
        try {
            def matcher = elementHtmlPage =~ /(?:class="NavBarMainLink"><a href=")(_[\w\W]+?)(?:">Package<\\/a><\\/td>)/
            def result = matcher[0][1]
            return result
        } catch (Exception e) {
            return null;
        }
    }

    public static def getScreenType(text) {
        try {
            def matcher = text =~ /(?:<td class="NavBarMainHighlight">)([\w\W]+?)(?:<\\/td>)/
            def result = matcher[0][1]
            return result
        } catch (Exception e) {
            return null;
        }
    }

    public static def getMultiplicity(String text) {
        def pattern = /(?:<td class="PropertyName"><b>Multiplicity<\\/b><\\/td><td class="PropertyValue">)([\w\W]+?)(?:<\\/td>)/;
        try {
            def matcher = text =~ pattern
            def mutiplicity = matcher[0][1];
            return mutiplicity
        } catch (Exception e) {
            return null;
        }
    }

    public static def getAbstract(String text) {
        def pattern = /(?:<td class="PropertyName"><b>Is Abstract<\\/b><\\/td><td class="PropertyValue">)([\w\W]+?)(?:<\\/td>)/;
        try {
            def matcher = text =~ pattern
            def abstractValue = matcher[0][1];
            if (abstractValue != null && abstractValue == 'true') {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return null;
        }
    }


    public static def getPropertyType(String text) {
        def pattern = /(?:<td class="PropertyName"><b>Type<\\/b><\\/td><td class="PropertyValue"><a href=")([\w\W]+?)">([\w\W]+?)(?:<\\/a><\\/td>)/;
        try {
            def matcher = text =~ pattern
            def url = matcher[0][1];
            def name = normalize(matcher[0][2]);
            return [class: "${name}", url: "${url}"]
        } catch (Exception e) {
            return null;
        }
    }

    public static def getAttrType(text) {
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
}
