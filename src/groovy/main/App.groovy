/**
 * Created by vitaly on 31.03.17.
 */

import org.codehaus.jackson.map.ObjectMapper

import static Utils.*;
import static Invokators.*;
import static CodeGenerator.*;
import groovy.json.*


public class App {

    public static String rootUrl = 'https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/'

    public static typeMapper = [
            "StringValue": "String"
    ]

    public static usedTypes                         = new HashSet();
    public static existedClasses                    = new HashSet();
    public static absentTypes                       = new HashSet();
    public static map                               = new HashMap();
    public static attributeTypeClasses              = new TreeMap();
    public static propertiesTypeClasses             = new TreeMap();
    public static classPackage                      = new TreeMap();
    public static List<PackageDescription> packages = new ArrayList();
    public static String currentDir                 = new File(".").getAbsolutePath() + '/src/java/main/'
    public static boolean storeMode = true;

    public static def processingClosure = { it ->
        if (it.toString().startsWith("Class ")) {
            return (it.toString() - "Class ").trim()
        } else if (it.toString().startsWith("Enumeration ")) {
            return (it.toString() - "Enumeration ").trim()
        } else if (it.toString().startsWith("Primitive Type ")) {
            return (it.toString() - "Primitive Type ").trim()
        } else if (it.toString().startsWith("Data Type ")) {
            return (it.toString() - "Data Type ").trim()
        } else {
            println it.toString().trim()
        }
    }

    @Override
    String toString() {
        return super.toString()
    }

    public static void main(String[] args) {

        if (storeMode) {
//['Usage ABE']
            def filter = ['Party ABE']
            map = fillMap().findAll {filter.contains(it.key)}
            //.findAll { it.key == 'Agreement ABE' }

            println "Packages: ${map.size()}"

            map.each {
                //def text = new URL(it.value).text
                //println text
                def url          = it.value
                def resoursePath = it.value.split('/')[-1]
                def urlPath      = it.value - resoursePath

                println it.key + " $url"

                def htmlPackagePage = getUrlResponse(url)

                fillPackage(htmlPackagePage, it.key, url)
            }

            storeFile('existed',existedClasses)
            storeFile('used',usedTypes)
            storeFile('packages',packages)
            storeFile('attributeTypeClasses',attributeTypeClasses)
            storeFile('propertiesTypeClasses',propertiesTypeClasses);
            storeJson()

            println("peoperties:  ")
            propertiesTypeClasses.each {
                println it
            }

        } else {
            existedClasses = restoreFile('existed').collect(processingClosure)
            usedTypes = restoreFile('used').collect {
                return it.toString().trim()
            }
            packages = restoreFile('packages')
            attributeTypeClasses = restoreFile('attributeTypeClasses',)


            println "existedClasses 1 = ${existedClasses.size()} = " + existedClasses.findAll{it.toString().contains(':')}
            println "usedTypes 1 = ${usedTypes.size()} =" +  usedTypes.findAll{it.toString().contains(':')}

            println "usedTypes = ${usedTypes.size()} =" +  usedTypes.sort()
            println "existedClasses = ${existedClasses.size()} = " + existedClasses.sort()
            println "attributeTypeClasses = ${attributeTypeClasses.size()} = " + attributeTypeClasses.sort()

            Set unionSet = new HashSet<>(usedTypes + existedClasses).unique()
            println "union = ${unionSet.size()}"
            Set intersectSet = new HashSet<>(usedTypes.intersect( existedClasses ))
            println "intersectSet = ${intersectSet.size()}"
            Set diffs = unionSet - intersectSet
            println "diffs = ${diffs.size()}"

            Set diffsIntersetAttrs = diffs.intersect(attributeTypeClasses.keySet());
            println "diffsIntersetAttrs = ${diffsIntersetAttrs.size()}"

            diffs.sort().each {
                println it
            }

            //println "diffs=${diffs.size()}" + diffs.sort()
            //println "packages = " + packages.sort()
            /*packages.each { p ->
                processPackageCodeGeneration(p,false)
            }*/
        }






  /*      println "Losted [${attributeTypeClasses.size()}]: ${attributeTypeClasses}"
        attributeTypeClasses.sort().each {
            def textClass = getUrlResponse(rootUrl + it.value).toString();
            println " " + it.key
        }

        def collectedList = attributeTypeClasses.collect {
            [it.key]
        }

        println collectedList.class
        println collectedList.iterator().next().class

        List lostClassesNames = new ArrayList<>().addAll(collectedList);

        //List absentClasses = new ArrayList<>().addAll(absentTypes);

        //println "Absent types [${absentClasses.size()}]: ${absentClasses.sort()}"

        //def lostAndFound = lostClassesNames.intersect(absentClasses)

        //println "Absent / Lost  [${lostAndFound.size()}] : ${lostAndFound}"


        println "Class and packages:"
        classPackage.sort().each {
            println "${it.key} = ${it.value}"
        }*/
    }

    public static void storeJson() {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.valueToTree(packages).toString()

        File jsonOut = new File(new File(".").getAbsolutePath() + '/src/groovy/resources/out.json')
        if (!jsonOut.exists()) {
            jsonOut.createNewFile();
        } else {
            jsonOut.delete();
        }

        jsonOut << json;
    }


    public  static <T> T restoreFile(def fileName) {
        def file = new File(".").getAbsolutePath() + '/src/groovy/resources/' + fileName + '.bin'
        println file;
        def storeFile = new File(file);
        if (!storeFile.exists()) {
            return null;
        }

        FileInputStream fileStream = new FileInputStream(storeFile);
        ObjectInputStream ois = new ObjectInputStream(fileStream);
        T object = (T)ois.readObject();
        return object;
    }

    public static void storeFile(def fileName,def object ) {
        def file = new File(".").getAbsolutePath() + '/src/groovy/resources/' + fileName + '.bin'
        println file;
        def storeFile = new File(file);

        if (!storeFile.exists()) {
            storeFile.createNewFile();
        } else {
            storeFile.delete();
        }

        FileOutputStream fileStream = new FileOutputStream(storeFile);
        ObjectOutputStream oos = new ObjectOutputStream(fileStream);
        oos.writeObject(object);
    }


}
