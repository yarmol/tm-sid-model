import static Utils.*
import static App.*;

/**
 * Created by vitaly on 01.04.17.
 */
public class CodeGenerator {

    public static boolean createClasses = true;

    public static void processPackageCodeGeneration(p, boolean flag = false) {

        createClasses = flag;

        def packagePathString = p.packageName.replaceAll(/\./, '/');

        def packagePath = currentDir + packagePathString

        println "Creating ${packagePath}"

        def created = new File(packagePath).mkdirs()

        if (p.classes.size() == 0) {
            StringBuilder sb = new StringBuilder();
            File packageFile = new File(packagePath + '/' + p.packageId.replaceAll(/[\W]+/,'') + '.java');
            if (!packageFile.exists()) {
                packageFile.createNewFile()
            } else {
                packageFile.delete()
                packageFile.createNewFile()
            }

            sb.append(getClassHeader(p, p.comment,null))

            packageFile << sb.toString();
        }

        p.classes.each { ClassDescription c ->

            println "      Creating ${c}"
            StringBuilder sb = new StringBuilder();
            File classFile = new File(packagePath + '/' + c.name + '.java');
            if (!classFile.exists()) {
                classFile.createNewFile()
            } else {
                classFile.delete()
                classFile.createNewFile()
            }

            def commentary = c.comment.toString().replaceAll(/<\/br>/, '')

            def classHeader = getClassHeader(p, commentary, c)

            sb.append(classHeader)

            appendClassField(c, sb)


            appendEnumField(c, sb)

            sb.append(classFooter())
            //if (createClasses) {
            classFile << sb.toString();
            println "         file [${classFile.exists()}] = ${classFile.absolutePath}"
            //}
        }
    }

    public static void appendEnumField(ClassDescription c, sb) {
        if (c.stereotype == 'class') {
            c.fields.each { f ->
                sb.append('\n'+fieldHeader(f.comment, f.type, f.name) + '\n\n');
            }
        }
    }

    public static void appendClassField(ClassDescription c, sb) {
        if (c.stereotype == 'enum') {
            c.enumitems.each { f ->
                sb.append('\n' +itemHeader(f.comment, f.name) + '\n\n');
            }
        }
    }

}
