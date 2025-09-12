package WrapperClass;

import java.util.Scanner;

public class DoubleEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value : ");
        String piStr = sc.nextLine();
        double pi = Double.parseDouble(piStr);
        double result = pi * 2;

        System.out.println("Result: " + result);
    }
}
