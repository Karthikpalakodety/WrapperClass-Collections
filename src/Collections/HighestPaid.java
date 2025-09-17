package Collections;

import java.util.*;
import java.util.stream.*;

class Empl {
    private int id;
    private String name;
    private double salary;
    public Empl(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    @Override
    public String toString() {
        return id + " - " + name + " - Rs" + salary;
    }
}

public class HighestPaid {
    private List<Empl> employeeList;
    public HighestPaid() {
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Empl emp) {
        employeeList.add(emp);
    }
    public List<Empl> getTop3HighestPaid() {
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Empl::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
