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
/*        List<PassingStudents> students = Arrays.asList(                //marks > 40
                new PassingStudents("Karthik", 80),
                new PassingStudents("Kaushik", 35),
                new PassingStudents("kartik", 50),
                new PassingStudents("mehlam", 38)
        );
        long passingCount = students.stream()
                .filter(s -> s.getMarks() > 40)
                .count();
        System.out.println("Number of students with passing marks (> 40): " + passingCount);*/

/*        List<Groupby> employees = Arrays.asList(                              //groupingBy()
                new Groupby(1, "Sam", "HR"),
                new Groupby(2, "Siv", "Finance"),
                new Groupby(3, "Pavn", "HR"),
                new Groupby(4, "Shru", "Tech"),
                new Groupby(5, "kaushik", "Finance"),
                new Groupby(6, "karthik", "Tech")
        );
        Map<String, List<Groupby>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Groupby::getDepartment));
        groupedByDept.forEach((dept, empList) -> {
            System.out.println("Department : " + dept);
            empList.forEach(System.out::println);
            System.out.println();
        });*/

/*
        List<ListToSets> studentList = Arrays.asList(                //ListToSets
                new ListToSets(1, "Ali"),
                new ListToSets(2, "Boo"),
                new ListToSets(3, "Yesh"),
                new ListToSets(1, "Ali")
        );
        Set<ListToSets> studentSet = studentList.stream().collect(Collectors.toSet());
        System.out.println("Converted Set are : ");
        studentSet.forEach(System.out::println);
*/
/*        List<UniqueDept> employees = Arrays.asList(         //UniqueDept
                new UniqueDept( "HR"),
                new UniqueDept( "Finance"),
                new UniqueDept( "HR"),
                new UniqueDept( "Tech")
        );
        Set<String> departments = employees.stream()
                .map(UniqueDept::getDepartment)
                .collect(Collectors.toSet());
        System.out.println("Unique Departments: " + departments);

    */
/*        List<NameFilter> students = Arrays.asList(                 //Contains letter 'e'
                new NameFilter("Ali", 85),
                new NameFilter("Bob", 75),
                new NameFilter("Eve", 90),
                new NameFilter("Karthik", 60),
                new NameFilter("Meena", 70)
        );
        List<NameFilter> filtered = students.stream()
                .filter(s -> s.getName().toLowerCase().contains("e"))
                .collect(Collectors.toList());
        System.out.println("Students whose names contain 'e' :");
        filtered.forEach(System.out::println);*/

 /*       List<RemoveEmp> employees1 = new ArrayList<>(Arrays.asList(              //Remove employees <25
                new RemoveEmp("Ali", 30),
                new RemoveEmp("Bob", 22),
                new RemoveEmp("Chari", 28),
                new RemoveEmp("Dav", 23)
        ));
        employees1.removeIf(emp1 -> emp1.getAge() < 25);
        System.out.println("Employees aged 25 and above:");
        employees1.forEach(System.out::println);*/

/*        List<EmployeePerDept> employees = Arrays.asList(    //Map list (Adv)
                new EmployeePerDept("A", "HR"),
                new EmployeePerDept("B", "Tech"),
                new EmployeePerDept("C", "HR"),
                new EmployeePerDept("D", "sales"),
                new EmployeePerDept("E", "Tech")
        );
        Map<String, List<EmployeePerDept>> map = employees.stream()
                .collect(Collectors.groupingBy(EmployeePerDept::getDepartment));
        map.forEach((dept, empList) -> {
            System.out.println("Department : " + dept);
            empList.forEach(emp -> System.out.println(" * " + emp));
        });*/

/*        List<StudentsGradeGroup> students = Arrays.asList(      //Group students by grade
          new StudentsGradeGroup("AB","1"),
          new StudentsGradeGroup("CD","2"),
          new StudentsGradeGroup("EF","3"),
          new StudentsGradeGroup("GH","2"),
          new StudentsGradeGroup("GH","1")
        );

        Map<String,Long>gradeCount = students.stream().collect(Collectors.groupingBy(
                StudentsGradeGroup::getGrade,Collectors.counting()
        ));

        gradeCount.forEach((grade,count) -> System.out.println("Grade : "+grade+ " = " +count+ " Students"));*/

/*        List<DecendingSalary> employees = Arrays.asList(                      //Salary decending
                new DecendingSalary(1, 60000),
                new DecendingSalary(2, 75000),
                new DecendingSalary(3, 60000),
                new DecendingSalary(4, 90000)
        );
        employees.sort(
                Comparator.comparingDouble(DecendingSalary::getSalarys).reversed()
                        .thenComparing(DecendingSalary::getEmpid)
        );
        System.out.println("Employees sorted by salary (desc) then name:");
        employees.forEach(System.out::println);*/

/*        List<StudentById> students = Arrays.asList(        //Filter by grade
                new StudentById(1, "A"),
                new StudentById(2, "B"),
                new StudentById(1, "AB"),
                new StudentById(3, "C"),
                new StudentById(2, "BD")
        );

        Set<Integer> seenIds = new HashSet<>();
        List<StudentById> uniqueStudents = students.stream()
                .filter(s -> seenIds.add(s.getId())).collect(Collectors.toList());
        System.out.println("Unique Students by ID : ");
        uniqueStudents.forEach(System.out::println);*/

/*        List<EmployeeNamesMap> employees = Arrays.asList(                //List containing just names
                new EmployeeNamesMap("A", 50000),
                new EmployeeNamesMap("B", 60000),
                new EmployeeNamesMap("C", 55000)
        );
        List<String> employeeNames = employees.stream()
                .map(EmployeeNamesMap::getName).collect(Collectors.toList());
        System.out.println("Employee Names: " + employeeNames);*/

/*
        AvgMark avgMark = new AvgMark();                                  //26.Finding avg marks

        avgMark.addMark(101, 80);
        avgMark.addMark(102, 90);
        avgMark.addMark(103, 85);
        avgMark.addMark(104, 75);
        avgMark.addMark(105, 95);

        double average = avgMark.getAverageMarks();
        System.out.println("Average Marks : " + average);
*/
        /*
        HighestPaid sal = new HighestPaid();                                  //top 3 highest paid salary

        sal.addEmployee(new Empl(1, "A", 75000));
        sal.addEmployee(new Empl(2, "B", 88000));
        sal.addEmployee(new Empl(3, "C", 65000));
        sal.addEmployee(new Empl(4, "D", 99000));
        sal.addEmployee(new Empl(5, "E", 92000));

        System.out.println("Top 3 highest-paid employees:");
        for (Empl emp : sal.getTop3HighestPaid()) {
            System.out.println(emp);
        }*/

/*        List<List<Integer>> listOfLists = Arrays.asList(                      //listflatter
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        ListFlatter flattener = new ListFlatter();
        List<Integer> flattened = flattener.flattenList(listOfLists);

        System.out.println("Flattened List: " + flattened);*/
 /*       EmpMatch empMatch = new EmpMatch();                  //Employee min salary

        empMatch.addEmployee(new Match(1, "A", 75000));
        empMatch.addEmployee(new Match(2, "B", 82000));
        empMatch.addEmployee(new Match(3, "C", 70000));

        double minimum = 60000;
        boolean result = empMatch.areAllEmployeesAbove(minimum);

        System.out.println("All employees earn above Rs: " + minimum + "?\n" + result);*/

        StudentsPartition partitioner = new StudentsPartition();

        partitioner.addPartition(new Partition(1, "A", 75));
        partitioner.addPartition(new Partition(2, "B", 40));
        partitioner.addPartition(new Partition(3, "C", 90));
        partitioner.addPartition(new Partition(4, "D", 35));
        partitioner.addPartition(new Partition(5, "E", 60));

        int passMark = 50;

        Map<Boolean, List<Partition>> result = partitioner.partitionByPass(passMark);

        System.out.println("Passed Students : ");
        for (Partition p : result.get(true)) {
            System.out.println(p);
        }

        System.out.println("\nFailed Students : ");
        for (Partition p : result.get(false)) {
            System.out.println(p);
        }
    }
}

