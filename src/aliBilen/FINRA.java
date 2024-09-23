package aliBilen;

import java.util.Scanner;

public class FINRA {

    public static void main(String[] args) {

        finRa(63);
        System.out.println("==================================================");
        finraScanner();
    }

    public static void finRa(int x) {

        for (int i = 1; i <= x; i++) {
            String result;
            result = (i % 3 == 0 && i % 5 == 0) ? "FINRA" : (i % 3 == 0) ? "FIN" : (i % 5 == 0) ? "RA" : i + "";
            System.out.print(result+" ");

        }
    }

    public static void finraScanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int num = input.nextInt();
        input.close();

        for (int i = 1; i < 64; i++) {

            String result = "";

            if (i % 3 == 0 && i % 5 == 0) {
                result = "FINRA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else if (i % 5 == 0) {
                result = "RA";
            } else {
                result = "" + i;
            }
            System.out.print(result + " ");
        }
    }
}
