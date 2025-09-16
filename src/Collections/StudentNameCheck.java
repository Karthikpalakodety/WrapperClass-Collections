package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentNameCheck {
    private List<String> studentList;
    public StudentNameCheck() {
        studentList = new ArrayList<>();
        studentList.add("Student1");
        studentList.add("Student2");
        studentList.add("Student3");
        studentList.add("Student4");
    }
    public boolean isStudentPresent(String name) {
        return studentList.contains(name);
    }
}