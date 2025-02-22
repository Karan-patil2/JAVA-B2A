public class Student {

    private String id;
    private String name;
    private String dob;
    private String classlist;

    public Student(String id, String name, String dob, String classlist) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classlist = classlist;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", classlist='" + classlist + '\'' +
                '}';
    }
}
