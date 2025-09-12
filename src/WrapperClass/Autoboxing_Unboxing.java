package WrapperClass;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer boxedA = a;
        int result = boxedA + 5;

        System.out.println("Final value is : " + result);
    }
}