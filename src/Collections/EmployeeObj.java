package Collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeObj {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Alice", 101));
        employeeSet.add(new Employee("Bob", 102));
        employeeSet.add(new Employee("Charlie", 103));
        System.out.println("List of Employees : ");
        for (Employee e : employeeSet) {
            System.out.println("ID: " + e.id + ", Name: " + e.name);
        }
    }
}
