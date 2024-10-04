package sevket.ReverseTask;

public class Reverse3 {

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int number1 = -123;
        int number2 = -456;
        int number3 = -789;
        int number4 = -147;
        int number5 = -963;

        int reversedNumber1 = reverse(number1);
        int reversedNumber2 = reverse(number2);
        int reversedNumber3 = reverse(number3);
        int reversedNumber4 = reverse(number4);
        int reversedNumber5 = reverse(number5);

        System.out.println("Reversed: " +number1+" --> " + reversedNumber1);
        System.out.println("Reversed: " +number2+" --> " + reversedNumber2);
        System.out.println("Reversed: " +number3+" --> " + reversedNumber3);
        System.out.println("Reversed: " +number4+" --> " + reversedNumber4);
        System.out.println("Reversed: " +number5+" --> " + reversedNumber5);
    }
}
