package refianur;

public class Numbers {
    public static void main(String[] args) {

        identifier(5);
        identifier(4);


    }


    public static void identifier(int number) {
        if( number % 2 == 0 ) {
            System.out.println( number + "  is a even.  " );
        }else {
            System.out.println( number + "  is a odd.  " );
        }
    }
}


