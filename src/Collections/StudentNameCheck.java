package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class StudentNameCheck {
        public static void main(String[] args) {
            List<String> studentList = new ArrayList<>();
            studentList.add("Student1");
            studentList.add("Student2");
            studentList.add("Student3");
            studentList.add("Student4");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name to search: ");
            String nameToSearch = scanner.nextLine();
            if (studentList.contains(nameToSearch)) {
                System.out.println(nameToSearch + " is in the student list.");
            } else {
                System.out.println(nameToSearch + " is NOT in the student list.");
            }
            scanner.close();
        }
    }


