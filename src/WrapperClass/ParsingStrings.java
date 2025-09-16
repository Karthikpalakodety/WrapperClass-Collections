package WrapperClass;

import java.util.Scanner;

public class ParsingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String value for s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the String value for s2: ");
        String s2 = sc.nextLine();

        try {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            int sum = num1 + num2;
            System.out.println("Sum of two int values = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer strings.");
        }
        sc.close();
    }
}
