package sevket.ReverseTask;

import java.util.Arrays;

public class Reverse2 {

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {-85, -234, -987, -35, -85};

        System.out.println("Original numbers: " + Arrays.toString(numbers));

        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = reverse(numbers[i]);
        }

        System.out.println("Reversed numbers: " + Arrays.toString(reversedNumbers));
    }
}
