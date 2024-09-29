package laurette;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("x after swapping = " + x);
        System.out.println("y after swapping = " + y);
    }
}
