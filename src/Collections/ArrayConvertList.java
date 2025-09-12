package Collections;

import java.util.Arrays;
import java.util.List;

class StudentData {
    String name;
    int age;
    StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayConvertList {
    public static void main(String[] args) {
        StudentData[] studentArray = {
                new StudentData("s1", 20),
                new StudentData("s2", 21),
                new StudentData("s3", 22)
        };
        List<StudentData> studentList = Arrays.asList(studentArray);
        System.out.println("Student List:");
        studentList.forEach(s ->
                System.out.println("Name: " + s.name + ", Age: " + s.age)
        );
    }
}
