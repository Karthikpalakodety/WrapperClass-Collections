package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDup {
    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>();

        employeeNames.add("Student1");
        employeeNames.add("Student2");
        employeeNames.add("Student3");
        employeeNames.add("Student5");
        employeeNames.add("Student5");
        Set<String> uniqueNames = new HashSet<>(employeeNames);
        System.out.println("Unique Employee Names :");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}