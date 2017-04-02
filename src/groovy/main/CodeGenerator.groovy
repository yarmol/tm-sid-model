import static Utils.*
import static App.*;

/**
 * Created by vitaly on 01.04.17.
 */
public class CodeGenerator {

    public static boolean createClasses = false;

    public static void processPackageCodeGeneration(p, boolean flag = false) {

        createClasses = flag;

        def packagePathString = p.packageName.replaceAll(/\./, '/');

        def packagePath       = currentDir + packagePathString

        println "Creating ${packagePath}"

        def created           = new File(packagePath).mkdirs()

        p.classes.each {
            ClassDescription c ->
                StringBuilder sb = new StringBuilder();
                File classFile   = new File(packagePath + '/' + c.name + '.java');
                def commentary = c.comment.toString().replaceAll(/<\/br>/, '')

                def classHeader = getClassHeader(p, commentary, c.name, c.stereotype)

                sb.append(classHeader)

                appendClassField(c, sb)


                appendEnumField(c, sb)

                sb.append(classFooter())
                if (createClasses) {
                    classFile << sb.toString();
                }
        }
    }

    public static void appendEnumField(ClassDescription c, sb) {
        if (c.stereotype == 'class') {
            c.fields.each { f ->
                sb.append(fieldHeader(f.comment, f.type, f.name) + '\n\n');
            }
        }
    }

    public static void appendClassField(ClassDescription c, sb) {
        if (c.stereotype == 'enum') {
            c.enumitems.each { f ->
                sb.append(itemHeader(f.comment, f.name) + '\n\n');
            }
        }
    }

}
