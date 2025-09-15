package Collections;

import java.util.*;
import java.util.stream.Collectors;
import Collections.FilterMarks;

import static java.util.Arrays.asList;


public class Main {
    public static void main(String[] args) {
       /* alphabeticOrder sorter = new alphabeticOrder();            // alphabetic order
        List<String> sortedNames = sorter.getSortedEmployeeNames();

        System.out.println("Sorted Employee Names:");
        for (String name : sortedNames) {
            System.out.println(name);*/

/*        ArrayConvertList converter = new ArrayConvertList();       //Array to list convertion
        List<StudentData> studentList = converter.convertArrayToList();

        System.out.println("Student List:");
        for (StudentData student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());

        }*/
/*        EmployeeObj employeeObj = new EmployeeObj();              //Employeeobject
        Set<Employee> employeeSet = employeeObj.getEmployeeSet();

        System.out.println("List of Employees : ");
        for (Employee e : employeeSet) {
            System.out.println("ID: " + e.id + ", Name: " + e.name);
        }*/
/*
        EmployeeSize employeeSize = new EmployeeSize();             //Employeesize
        Map<Integer, String> employeeMap = employeeSize.getEmployeeMap();
        int totalEmployees = employeeSize.getEmployeeCount(employeeMap);

        System.out.println("Total number of employees: " + totalEmployees);
*/
/*        RemovingDup dupRemover = new RemovingDup();                 // Removing duplicates
        Set<String> uniqueNames = dupRemover.getUniqueEmployeeNames();

        System.out.println("Unique Employee Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }*/

/*        StudentList studentList = new StudentList();              //Student list
        Student first = studentList.getFirstStudent();
        System.out.println("First student :");
        System.out.println("Name: " + first.getName() + ", Age: " + first.getAge());
        System.out.println("\n All students :");
        for (Student s : studentList.getAllStudents()) {
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
        }
        System.out.println("\nTotal students: " + studentList.getTotalStudents());
        studentList.removeSecondStudent();
        System.out.println("\nAfter removing second student : ");
        for (Student s : studentList.getAllStudents()) {
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
        }*/

/*        StudentMapping mapping = new StudentMapping();    //Student mapping
        Map<Integer, String> studentMap = mapping.getStudentMap();
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }*/

/*        StudentNameCheck checker = new StudentNameCheck();       //StudentNameCheck
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search : ");
        String nameToSearch = scanner.nextLine();
        if (checker.isStudentPresent(nameToSearch)) {
            System.out.println(nameToSearch + " is in the student list.");
        } else {
            System.out.println(nameToSearch + " is not in the student list.");
        }
        scanner.close();*/

/*        EmpAge empService = new EmpAge();                           //intermediate Employees by age

        List<Empo> employees = empService.getEmployees();
        List<Empo> sortedEmployees = empService.sortByAge(employees);

        System.out.println("Employees sorted by age : ");
        for (Empo e : sortedEmployees) {
            System.out.println(e);
        }*/
/*        List<FilterMarks> students = Arrays.asList(                      //Student marks
                new FilterMarks("karthik", 80),
                new FilterMarks("meta", 90)
        );
        List<FilterMarks> filteredStudents = students.stream()
                .filter(s -> s.getMarks() > 75)
                .collect(Collectors.toList());

        System.out.println("Students with marks > 75:");
        filteredStudents.forEach(System.out::println);*/
/*
        Map<Integer, MarksSheet> studentMap = new HashMap<>();             //13

        studentMap.put(101, new MarksSheet(101, "Karthik", 80));
        studentMap.put(102, new MarksSheet(102, "Meta", 90));
        studentMap.put(103, new MarksSheet(103, "John", 65));
        System.out.println("Student Names : ");
        for (MarksSheet m : studentMap.values()) {
            System.out.println(m.getName());
        }*/
/*        List<HighSalary> highSalary = Arrays.asList(
                new HighSalary(1, "Karthik", 85000),
                new HighSalary(2, "vikram", 82000),
                new HighSalary(3, "kaushik", 67000),
                new HighSalary(4, "Diana", 80000)
        );
        Optional<HighSalary> highestPaid = highSalary.stream()
                .max(Comparator.comparingDouble(HighSalary::getSalary));
        if (highestPaid.isPresent()) {
            System.out.println("Employee with highest salary : " + highestPaid.get());
        } else {
            System.out.println("No employees found.");
        }*/
        List<PassingStudents> students = Arrays.asList(
                new PassingStudents("Karthik", 80),
                new PassingStudents("Kaushik", 35),
                new PassingStudents("kartik", 50),
                new PassingStudents("mehlam", 38)
        );
        long passingCount = students.stream()
                .filter(s -> s.getMarks() > 40)
                .count();
        System.out.println("Number of students with passing marks (> 40): " + passingCount);
    }

}

