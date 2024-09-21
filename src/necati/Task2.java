package necati;

public class Task2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.println(i % 15 == 0 ? "FINRA" : i % 3 == 0 ? "FIN" : i % 5 == 0 ? "RA" : i);
        }

    }
}
