package necati;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        identifyNumber(number);

    }

    public static void identifyNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}

