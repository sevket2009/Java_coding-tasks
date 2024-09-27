package refianur;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 8;
        int b = 12;

        a = a + b; // a:20
        b = a - b; // b:8

        a = a - b; // a: 12 --> 20-8

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

/*
    Swap two int variables' values without using a third variable
    Swap two numbers" ifadesi, iki sayının yerlerini değiştirmek anlamına gelir.
 */