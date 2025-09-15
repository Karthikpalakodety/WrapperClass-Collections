package Collections;

import java.util.ArrayList;
class Student {
    String name;
    int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class StudentList {
    private ArrayList<Student> students;
    public StudentList() {
        students = new ArrayList<>();
        students.add(new Student("s1", 20));
        students.add(new Student("s2", 21));
        students.add(new Student("s3", 22));
    }
    public Student getFirstStudent() {
        return students.get(0);
    }
    public ArrayList<Student> getAllStudents() {
        return students;
    }
    public int getTotalStudents() {
        return students.size();
    }
    public void removeSecondStudent() {
        if (students.size() > 1) {
            students.remove(1);
        }
    }
}