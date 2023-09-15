package chapter7;

public class Student {
    private String studentID;
    private String name;

    public Student(){};
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public void showStudentInfo() {
        System.out.println(studentID + ',' + name);
    }
}
