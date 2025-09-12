package Collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMapping {
    public static void main(String[] args) {
        Map<Integer,String> StudentMapping = new HashMap<>();
        StudentMapping.put(101, "Alice");
        StudentMapping.put(102, "Bob");
        StudentMapping.put(103, "Charlie");
        System.out.println("Student ID and Name:");

        for (Map.Entry<Integer, String> entry : StudentMapping.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
