package naile;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int x = 20;
        int y = 30;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=y-x;//x=10
        y=y-x;//y=20

        x=x+y;//x=30

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
