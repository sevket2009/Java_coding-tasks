package sevket;

public class Finra {
    public static void main(String[] args) {

//Solution 1)
/*
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);

            }
        }

*/



//Solution 2)
/*
            for (int i = 1; i <= 30; i++) {
                String output = "";

                if (i % 3 == 0) {
                    output += "FIN";
                }
                if (i % 5 == 0) {
                    output += "RA";
                }

                System.out.println(output.isEmpty() ? i : output);
            }
*/




//Solution 3)
/*
                for (int i = 1; i <= 30; i++) {
                    System.out.println(i % 15 == 0 ? "FINRA" : i % 3 == 0 ? "FIN" : i % 5 == 0 ? "RA" : i);
                }

 */


    }
}


