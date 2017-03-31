/**
 * Created by vitaly on 31.03.17.
 */
public class App {

    public static void main(String[] args) {

        def getUrlResponce = {String url ->
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

        def getComment = {String text ->
            def resultComment = text =~ /(?:<a name="documentationSection"><\\/a>)([\w\W]+?)(?:<\\/p>)/
            def comment = resultComment[0][1]
            return comment
        }

        def getName = {String text ->
            def result = text =~ /(?:<span class="ElementTitle">)([\w\s-]+)(?:<\\/span>)/
            def name = result[0][1]
            return name
        }

        def map = ["Test ABE": "https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_CN2.cED6.jE.eS.l.f7G.uC.b7.u.hA-content.html"]

        map.each {
            //def text = new URL(it.value).text
            //println text
            def url = it.value
            def resoursePath = it.value.split('/')[-1]
            def urlPath = it.value - resoursePath
            println url
            println url.class


            def text = getUrlResponce(url)

            //name
            def name = getName(text)

            //comment
            def comment = getComment(text)

            //table of classes
            def tableItemsResult = text =~ /(?:<td class="ClassTableEntryLink"><a title=)([\w\W]+?)(?:<img border=)/
            tableItemsResult.each {

                def tableItem = it[1]
                def className = tableItem.split('::')[-1]
                def linkUrlMtch = tableItem =~ /(?:href=")([\w\W]+?)(?:">)/
                def link = urlPath + linkUrlMtch[0][1]

                println " " + className

                def textClass = getUrlResponce(link).toString();

                def classNameDescr = getName(textClass)
                def classComment   = getComment(textClass)

                println "   " + classNameDescr
                println "   " + classComment

            }

        }


    }




}
