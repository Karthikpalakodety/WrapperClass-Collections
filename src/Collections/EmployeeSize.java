package Collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSize {
    public Map<Integer, String> getEmployeeMap() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Karthik");
        employeeMap.put(102, "Mehlam");
        employeeMap.put(103, "Kartik");
        employeeMap.put(104, "Kaushik");
        return employeeMap;
    }
    public int getEmployeeCount(Map<Integer, String> employeeMap) {
        return employeeMap.size();
    }
}