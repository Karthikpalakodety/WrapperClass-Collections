package Collections;

public class DecendingSalary {
    private int empid;
    private double salarys;

    public DecendingSalary(int empid, double salarys) {
        this.salarys = salarys;
        this.empid = empid;
    }

    public double getSalarys() {
        return salarys;
    }

    public int getEmpid() {
        return empid;
    }

    @Override
    public String toString() {
        return "DecendingSalary{EmpID : " +empid+"',Salary : " +salarys+"}";
    }
}
