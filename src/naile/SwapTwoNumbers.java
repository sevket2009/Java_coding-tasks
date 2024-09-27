package naile;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        //Swap two int variables' values without using a third variable

        int x = 20;
        int y = 30;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=y-x;//x=10
        y=y-x;//y=20

        x=x+y;//x=30

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*
        Swap two int variables' values with using a third variable
        int x=10;
        int y=15;
        int z=x;

        x=y;
        y=z;

       System.out.println("x= "+x);
        System.out.println("y= "+y);

         */


    }
}
