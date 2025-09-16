package Collections;


public class EmployeePerDept {
    private String name;
    private String department;
    public EmployeePerDept(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return name;
    }
}

