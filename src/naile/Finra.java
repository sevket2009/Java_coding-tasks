package naile;

public class Finra {

    public static void main(String[] args) {
        displayFinra(30);

    }


    public static void displayFinra(int n) {

        for (int i = 1; i <= n; i++) {
            String result = (i % 3 == 0 && i % 5 == 0) ? "FINRA" : (i % 5 == 0) ? "RA" : (i % 3 == 0) ? "FIN" : "" + i;
            System.out.print(result + " ");
        }
    }
}
/*
Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
 print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
 For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */