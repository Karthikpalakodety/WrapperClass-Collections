package Collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeObj {
    public Set<Employee> getEmployeeSet() {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Ali", 101));
        employeeSet.add(new Employee("Boo", 102));
        employeeSet.add(new Employee("Alpha", 103));
        return  employeeSet;
    }
}