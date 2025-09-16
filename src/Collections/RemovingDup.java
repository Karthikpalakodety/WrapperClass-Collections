package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDup {
    public Set<String>getUniqueEmployeeNames() {
        List<String> employeeNames = new ArrayList<>();

        employeeNames.add("Student1");
        employeeNames.add("Student2");
        employeeNames.add("Student3");
        employeeNames.add("Student5");
        employeeNames.add("Student5");
        return new HashSet<>(employeeNames);
        }
    }
