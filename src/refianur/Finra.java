package refianur;

public class Finra {

    public static void main(String[] args) {
        // Finra(15);
        //new1
        for(int i = 1; i <= 15; i++) {
            if(i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FINRA");
            }else if(i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }

    }
/*
    public static void Finra(int num){
        for(int i = 1; i <= num; i++ ) {
            System.out.print(( i % 15 == 0 ? "FINRA" : i % 3 == 0 ? "FIN" : i % 5 == 0 ? "RA" : i) +" ");
        }
    }

 */
}



