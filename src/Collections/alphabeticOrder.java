package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alphabeticOrder {
    public List<String> getSortedEmployeeNames() {
        List<String> employeeNames = new ArrayList<>();
        employeeNames.add("Cha");
        employeeNames.add("Ali");
        employeeNames.add("Bar");
        employeeNames.add("Kar");

        Collections.sort(employeeNames);
        return employeeNames;
    }
}
