package sevket;

public class SwapTwoNumber {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swap the values of x and y without using a third variable
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}