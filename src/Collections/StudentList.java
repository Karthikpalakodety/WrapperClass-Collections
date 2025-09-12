package Collections;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("s1", 20));
        students.add(new Student("s2", 21));
        students.add(new Student("s3", 22));
        System.out.println("First student:");
        System.out.println("Name: " + students.get(0).name + ", Age: " + students.get(0).age);

        System.out.println("\nAll students:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
        System.out.println("\nTotal students: " + students.size());
        students.remove(1);
        System.out.println("\nAfter removing second student:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
    }
}
