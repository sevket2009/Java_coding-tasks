package laurette;

public class ReverseNegativeNumber {


    public static void main(String[] args) {


        // Test the method
        System.out.println(reverseNegativeNumber(-35));

    }

    public static int reverseNegativeNumber(int n) {
        // Check if the number is negative

            // Convert the number to positive for processing
            int reversedNum = 0;
            n = -n;  // Remove the negative sign temporarily

            // Reverse the digits of the number
            while (n != 0) {
                int digit = n % 10;  // Extract the last digit
                reversedNum = reversedNum * 10 + digit;  // Append it to the reversed number
                n /= 10;  // Remove the last digit from the original number
            }
            return -reversedNum;  // Add the negative sign back to the result

    }



}
