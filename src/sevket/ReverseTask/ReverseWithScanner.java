package sevket.ReverseTask;

import java.util.Scanner;

public class ReverseWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entera negative number: ");
        int input = scanner.nextInt();

        if (input >= 0) {
            System.out.println("Please enter a negative number.");
        } else {
            int output = reverseNegativeNumber(input);
            System.out.println("Reversed: " + output);
        }

        scanner.close();
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
