package WrapperClass;

import java.util.Scanner;

public class toStringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the int value : ");
        Number score = sc.nextInt();
        String scoreStr = score.toString();
        System.out.println(scoreStr + " points");
    }
}
