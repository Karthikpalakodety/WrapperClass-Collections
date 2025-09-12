package WrapperClass;

import java.util.Scanner;

public class CombinedEX {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a stringInterger value to convert : ");
            String strInt = sc.nextLine();
            System.out.println("Enter a string value to convert : ");
            String strDouble = sc.nextLine();
            System.out.println("Enter a string value to check the boolean value : ");
            String strBool = sc.nextLine();
            System.out.println("Enter a stringInterger value to convert : ");
            char ch =sc.nextLine().charAt(0);

/*            String strInt = "25";
            String strDouble = "3.14";
            String strBool = "true";
            char ch = '7';*/

            int num = Integer.parseInt(strInt);
            double pi = Double.parseDouble(strDouble);
            boolean flag = Boolean.parseBoolean(strBool);
            boolean isDigit = Character.isDigit(ch);

            System.out.println("Parsed int: " + num);
            System.out.println("Parsed double: " + pi);
            System.out.println("Parsed boolean: " + flag);
            System.out.println("Is character a digit or not : " + isDigit);
        }
    }


