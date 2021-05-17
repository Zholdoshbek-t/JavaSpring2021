import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private transient int grade;
    private String gender;

    public Student(String name, int age, int grade, String gender) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                '}';
    }
}
