package aliBilen;

public class swapTwoNumbers {


    public static void main(String[] args) {

        int a = 45;
        int b = 15;

        System.out.print("Before swapping:");
        System.out.print(" a = " + a);
        System.out.println(", b = " + b);

        a = a + b;
        b = a - b;

        System.out.print("After swapping : ");
        System.out.print("a = " + a);
        System.out.print(", b = " + b);
    }
}