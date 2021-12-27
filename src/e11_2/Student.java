package e11_2;

public class Student extends Person {
    public final String grade;

    public Student() {
        grade = "大一";

    }

    public Student(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return super.toString()+"Student grade = " + grade;
    }
}
