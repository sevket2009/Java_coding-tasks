package laurette;

public class Finra {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if(i % 3==0){
                System.out.print(" FIN ");
            }
            if(i%5==0){
                System.out.print(" RA ");
            }
            if(i%3==0 && i%5==0){
                System.out.print(" FINRA ");
            }

        }
    }
}
