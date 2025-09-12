package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alphabeticOrder {
    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>();

        employeeNames.add("Cha");
        employeeNames.add("Ali");
        employeeNames.add("Bar");
        employeeNames.add("Kar");
        Collections.sort(employeeNames);

        System.out.println("Sorted Employee Names :");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}

