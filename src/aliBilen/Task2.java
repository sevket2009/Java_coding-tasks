package aliBilen;

public class Task2 {

    public static void main(String[] args) {

        OddEvenNumber(6);

    }

    public static void OddEvenNumber (int num){


        if (num % 2 == 1) {
            System.out.println(num + " is Odd number");
        }
        if (num % 2 == 0) {
            System.out.println(num+ " is Even number");
        }
    }
}
