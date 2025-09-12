package Collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSize {
        public static void main(String[] args) {
            Map<Integer, String> employeeMap = new HashMap<>();
            employeeMap.put(101, "Karthik");
            employeeMap.put(102, "mehlam");
            employeeMap.put(103, "kartik");
            employeeMap.put(104,"kaushik");

            int size = employeeMap.size();
            System.out.println("Total number of employees: " + size);
        }
    }


