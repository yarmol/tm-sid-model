import org.codehaus.jackson.annotate.JsonIgnore
import org.codehaus.jackson.annotate.JsonProperty

public class PackageDescription implements Serializable {

    private static final long serialVersionUID = 8526917591442792901;

    @JsonProperty
    public String packageName;
    @JsonProperty
    public String domain;
    @JsonProperty
    public String packageId;
    @JsonProperty
    public String comment;
    @JsonProperty
    public String packageUrl;

    String getPackageName() {
        return packageName
    }

    void setPackageName(String packageName) {
        this.packageName = packageName
    }

    String getDomain() {
        return domain
    }

    void setDomain(String domain) {
        this.domain = domain
    }

    String getPackageId() {
        return packageId
    }

    void setPackageId(String packageId) {
        this.packageId = packageId
    }

    String getComment() {
        return comment
    }

    void setComment(String comment) {
        this.comment = comment
    }

    String getPackageUrl() {
        return packageUrl
    }

    void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl
    }

    List<ClassDescription> getClasses() {
        return classes
    }

    void setClasses(List<ClassDescription> classes) {
        this.classes = classes
    }
    @JsonProperty
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

public class EnumItemDescription implements Serializable {

    private static final long serialVersionUID = 3832410563237801017;


    @JsonProperty
    public String name;

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getComment() {
        return comment
    }

    void setComment(String comment) {
        this.comment = comment
    }
    @JsonProperty
    public String comment;

    @Override
    public String toString() {
        return "EnumItemDescription{" +
                "name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

public class ClassDescription implements Serializable {

    private static final long serialVersionUID = 4357965578219135681;

    @JsonIgnore
    public transient boolean alreadySet = false;

    @JsonProperty
    public String name;
    @JsonProperty
    public String comment;
    @JsonProperty
    public String stereotype;
    @JsonProperty
    public List<FieldDescription> fields = new ArrayList<>();

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getComment() {
        return comment
    }

    void setComment(String comment) {
        this.comment = comment
    }

    String getStereotype() {
        return stereotype
    }

    void setStereotype(String stereotype) {
        this.stereotype = stereotype
    }

    List<FieldDescription> getFields() {
        return fields
    }

    void setFields(List<FieldDescription> fields) {
        this.fields = fields
    }

    List<EnumItemDescription> getEnumitems() {
        return enumitems
    }

    void setEnumitems(List<EnumItemDescription> enumitems) {
        this.enumitems = enumitems
    }
    @JsonProperty
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

public class FieldDescription implements Serializable {

    private static final long serialVersionUID = 8843494772804892790;

    @JsonProperty
    public String name;
    @JsonProperty
    public String type;

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

    String getComment() {
        return comment
    }

    void setComment(String comment) {
        this.comment = comment
    }
    @JsonProperty
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