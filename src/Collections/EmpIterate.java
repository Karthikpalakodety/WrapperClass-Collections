package Collections;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class EmpIterate {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("s1", 101));
        employeeList.add(new Employee("s2", 102));
        employeeList.add(new Employee("s3", 103));
        System.out.println("Employee Details:");
        employeeList.forEach(emp ->
                System.out.println("ID: " + emp.id + ", Name: " + emp.name)
        );
    }

}
