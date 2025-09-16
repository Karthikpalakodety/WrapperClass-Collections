package Collections;

import java.util.Arrays;
import java.util.List;

class StudentData {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayConvertList {
    List<StudentData> convertArrayToList() {
        StudentData[] studentArray = {
                new StudentData("s1", 20),
                new StudentData("s2", 21),
                new StudentData("s3", 22)
        };
        return  Arrays.asList(studentArray);
    }
}