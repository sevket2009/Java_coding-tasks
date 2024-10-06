package sevket.ReverseTask;

public class Reverse1 {

    public static void main(String[] args) {
        int input = -258;
        int output = reverseNegativeNumber(input);
        System.out.println("Reversed: " + output);
    }

    public static int reverseNegativeNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return reversed;
    }
}
