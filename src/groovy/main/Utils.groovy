import static App.*;
import static Invokators.*;

/**
 * Created by vitaly on 31.03.17.
 */
class Utils {

    public static def normalize(String ic) {
        if (ic.contains('«') || ic.contains('»')) {
            def pattern = /(?:^«\w+»)\s+(\w+)/;
            def matcher = ic =~ pattern
            def result = matcher[0][1];
            return result.toString().trim();
        } else if (ic.contains(':')) {
            def result = ic.replaceAll(/[\s:_]/,'');
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
                                     String className,
                                     String stereotype)  {

            println "class header for $stereotype $className"
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

    public static def classFooter() { return '}' }

    public static def fieldHeader ( comment, type, name) {
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

    public static def itemHeader (def comment,def name) {
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

    public static def getPropertiesTable(String text) {
        def pattern = /(?:<table class="PropertiesTable")([\w\W]+?)(?:<\/table>)/
        try {
            def resultComment = text =~ pattern
            return resultComment[0];
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
    public static def getPackageName (PackageDescription packageDescription) {
        def prefix = "org.tmforum"

        String name = packageDescription.packageId
        String domain = normalize(packageDescription.domain);

        prefix = prefix + "." + domain;

        if (name.contains(" ABE")) {
            prefix = prefix + ".abe";
            name = name.replaceAll(/ABE$/,'');
        }

        name = normalize(name).toLowerCase()

        def result = prefix + '.' + name.split(/\./).reverse().join('.')

        return result;

    }


    public static def getComment = { String text ->
        try {
            def resultComment = text =~ /(?:<a name="documentationSection"><\\/a>)([\w\W]+?)(?:<\\/p>)/
            def comment = resultComment[0][1]
            def result = comment.toString()
                    .replaceAll(/<\/br>/,'')
            return result;
        } catch (Exception e) {
            return null
        }

    }

    public static def getName = { String text ->
        try {
            def result = text =~ /(?:<span class="ElementTitle">)([\w\s-]+)(?:<\\/span>)/
            def name = result[0][1]
            return name
        } catch (Exception e) {
            return null
        }
    }

    public static def getDomain = { String text ->
        try {
            def result = text =~ /(?:<span class="PackageFullyQualifiedName">)([\w\W]+?)(?:<\\/span>)/
            def name = result[0][1]
            return name
        } catch (Exception e) {
            return null
        }
    }
    public static def getRows = { String text, String pattern ->
        def result = text =~ pattern
        return result
    }

    public static def getText = { String text, String pattern, int index = 1  ->
        try {
            def matcher = text =~ pattern
            def result = matcher[0][index]
            return result
        } catch (Exception e) {
            return null;
        }


    }

    public static def fillMap = {
        def rootPage = getUrlResponse(rootUrl  + '3E3F0EC000E9-top-summary.html')
        def packages = rootPage =~ /(?:<area shape="rect" coords="\d+,\d+,\d+,\d+" href=")([\w\W]+?)(?:" alt=")([\w\W]+?)(?:">)/
        packages.each {
            def key = it[2]
            def value = rootUrl + it[1]
            map[key] = value
        }
        return map
    }

    public static def getScreenType = { text ->
        try {
            def matcher = text =~ /(?:<td class="NavBarMainHighlight">)([\w\W]+?)(?:<\\/td>)/
            def result = matcher[0][1]
            return result
        } catch (Exception e) {
            return null;
        }
    }

    public static def getPropertyType(String text) {
        println text
        def pattern = /(?:<td class="PropertyName"><b>Type<\\/b><\\/td><td class="PropertyValue"><a href=")([\w\W]+?)">([\w\W]+?)(?:<\\/a><\\/td>)/;
        try {
            def matcher = text =~ pattern
            def url = matcher[0][1];
            def name = matcher[0][2];
            return [class: "${name}", url: "${url}"]
        } catch (Exception e) {
            return null;
        }
    }

    public static def getAttrType = { text ->
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
