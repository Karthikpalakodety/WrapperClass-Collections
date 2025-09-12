package WrapperClass;

import java.util.Scanner;

public class parseIntEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for String : ");
        String numstr = sc.nextLine();

        int number = Integer.parseInt(numstr);
        int result = number + 10;

        System.out.println("Result: " + result);

    }
}
