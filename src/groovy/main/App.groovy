/**
 * Created by vitaly on 31.03.17.
 */




import org.codehaus.jackson.map.ObjectMapper

import java.util.concurrent.LinkedBlockingQueue

import static Utils.*
import static CodeGenerator.*

public class App {

    public static String rootUrl = 'https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/'

    public static typeMapper = [
            "StringValue": "String"
    ]

    private static Set ncUsedTypes                      = new HashSet();
    private static Set ncExistedClasses                 = new HashSet();
    private static Set ncAbsentTypes                    = new HashSet();
    private static Set ncProcessedPackages              = new HashSet();
    private static Set ncNestedPackages                 = new HashSet();


    public static Set usedTypes                         = Collections.synchronizedSet(ncUsedTypes);
    public static Set existedClasses                    = Collections.synchronizedSet(ncExistedClasses);
    public static Set absentTypes                       = Collections.synchronizedSet(ncAbsentTypes);
    public static Set processedPackages                 = Collections.synchronizedSet(ncProcessedPackages);
    public static Set nestedPackages                    = Collections.synchronizedSet(ncNestedPackages);

    public static Set multiplicities                    = Collections.synchronizedSet((Set)new HashSet());


    public static LinkedBlockingQueue<Pair> queue       = new LinkedBlockingQueue();;
    public static Map attributeTypeClasses              = Collections.synchronizedMap((Map)new TreeMap());
    public static Map propertiesTypeClasses             = Collections.synchronizedMap((Map)new TreeMap());
    public static Map classPackage                      = Collections.synchronizedMap((Map)new TreeMap());
    public static List<PackageDescription> packages     = Collections.synchronizedList((List)new ArrayList());
    public static String currentDir                     = new File(".").getAbsolutePath() + '/src/java/main/'

    public static boolean storeMode = false;

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

        def threadList = [];
        if (storeMode) {

            //def filter = ['Service Problem ABE'];
            //fillMap(filter)

            fillMap();

            println "Packages: ${queue.size()}"

            for (int i = 0; i < 20; ++i) {

                try {
                    println "Thread : ${i.toString()}"
                    Thread th = new Thread(new PackageProcessor())
                    threadList << th
                    th.setName(i.toString())
                    th.start();
                } catch (Exception e) {
                    println e;
                }
            }

            threadList.each { Thread t ->
                if (t.alive) {
                    t.join();
                }
            }

            println "Storing..."

            def setExisted    = new HashSet()
            setExisted.addAll(existedClasses)

            def setUsed       = new HashSet()
            setUsed.addAll(usedTypes)

            def listPackages  = new ArrayList()
            listPackages.addAll(packages)

            def mapAttributes = new HashMap()
            mapAttributes.putAll(attributeTypeClasses)

            def mapProperties = new HashMap()
            mapProperties.putAll(propertiesTypeClasses)

            storeFile('existed', setExisted)
            storeFile('used', setUsed )
            storeFile('packages', listPackages)
            storeFile('attributeTypeClasses', mapAttributes )
            storeFile('propertiesTypeClasses', mapProperties );
            storeJson()

            println "multiplicities=$multiplicities"

        } else {
            Set existedClasses       = restoreFile('existed').collect(processingClosure)
            Set usedTypes            = restoreFile('used').collect {
                return it.toString().trim()
            }
            List packages            = restoreFile("packages");
            Map attributeTypeClasses = restoreFile('attributeTypeClasses',)


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
            packages.each { p ->
                processPackageCodeGeneration(p,false)
            }
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
            jsonOut.createNewFile();
        }

        jsonOut << json;
    }


    public  static <T> T restoreFile(def fileName) {
        def normalizedInitPath = new File(".").getAbsolutePath().normalize().toString()
        File storeFile = new File(normalizedInitPath + '/src/groovy/resources/' + fileName + '.bin')
        if (!storeFile.exists()) {
            return null;
        }

        FileInputStream fileStream = new FileInputStream(storeFile);
        ObjectInputStream ois = new ObjectInputStream(fileStream);
        T object = (T)ois.readObject();
        return object;
    }

    public static List<PackageDescription> restoreFile() {
        def normalizedInitPath = new File(".").getAbsolutePath().normalize().toString()
        File storeFile = new File(normalizedInitPath + '/src/groovy/resources/packages.bin')
        if (!storeFile.exists()) {
            return null;
        }

        FileInputStream fileStream = new FileInputStream(storeFile);
        ObjectInputStream ois = new ObjectInputStream(fileStream);
        Object object = (Object) ois.readObject();
        println object.class
        println object
        return object;
    }


    public static void storeFile(def fileName,def object ) {

        def normalizedInitPath = new File(".").getAbsolutePath().normalize().toString()

        File storeFile = new File(normalizedInitPath + '/src/groovy/resources/' + fileName + '.bin')

        println "Storing...${storeFile.getAbsolutePath()}"
        
        if (!storeFile.exists()) {
            storeFile.createNewFile();
        } else {
            storeFile.delete();
            storeFile.createNewFile();
        }

        FileOutputStream fileStream = new FileOutputStream(storeFile);
        ObjectOutputStream oos = new ObjectOutputStream(fileStream);
        oos.writeObject(object);
    }


}
