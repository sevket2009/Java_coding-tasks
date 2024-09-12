package sevket;

public class EvenOddIdentifier {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        String result1 = identify(num1);
        String result2 = identify(num2);

        System.out.println("num1 = " + num1 + " is " + result1);
        System.out.println("num2 = " + num2 + " is " + result2);
    }

    public static String identify(int number) {
        if (number % 2 == 0) {
                return "even";
        } else {
                return "odd";
        }
    }
}