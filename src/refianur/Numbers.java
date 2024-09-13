package refianur;

public class Numbers {
    public static void main(String[] args) {

        EvenOrOdd(5);
        EvenOrOdd(4);


    }


    public static void EvenOrOdd(int number) {
        if( number % 2 == 0 ) {
            System.out.println( number + "  is a even.  " );
        }else {
            System.out.println( number + "  is a odd.  " );
        }
    }
}


