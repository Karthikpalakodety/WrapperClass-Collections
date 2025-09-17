package Collections;

import java.util.*;

class Match {
    private int id;
    private String name;
    private double salary;
    public Match(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return id + " - " + name + " - Rs " + salary;
    }
}

public class EmpMatch {
    private List<Match> employees;
    public EmpMatch() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Match e) {
        employees.add(e);
    }

    public boolean areAllEmployeesAbove(double minimum) {
        return employees.stream()
                .allMatch(e -> e.getSalary() > minimum);
    }

    public List<Match> getEmployees() {
        return employees;
    }
}
