package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Empo {
    private String name;
    private int age;
    public Empo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class EmpAge {
    public List<Empo> getEmployees() {
        List<Empo> employees = new ArrayList<>();
        employees.add(new Empo("S1", 20));
        employees.add(new Empo("S2", 21));
        employees.add(new Empo("S3", 35));
        employees.add(new Empo("S4", 25));
        return employees;
    }
    public List<Empo> sortByAge(List<Empo> employees) {
        employees.sort(Comparator.comparing(Empo::getAge));
        return employees;
    }
}

