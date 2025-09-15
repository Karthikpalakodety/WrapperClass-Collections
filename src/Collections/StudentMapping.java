package Collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMapping {
    public Map<Integer,String>getStudentMap() {
        Map<Integer,String> StudentMapping = new HashMap<>();
        StudentMapping.put(101, "Ali");
        StudentMapping.put(102, "Boo");
        StudentMapping.put(103, "Alpha");
        System.out.println("Student ID and Name:");
        return StudentMapping;
    }
}