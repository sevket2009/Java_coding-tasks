package laurette;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println(identify(17));
        System.out.println(identify(60));

    }

    public static String identify(int number){

        return (number%2==0) ? "Even":  "Odd";

    }
}
