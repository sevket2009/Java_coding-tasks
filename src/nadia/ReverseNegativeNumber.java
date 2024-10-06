package nadia;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int number = -35;
        int reversed = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNegativeNumber(int num) {
        // Check if the number is negative
        if (num >= 0) {
            throw new IllegalArgumentException("The number must be negative.");
        }

        // Remove the negative sign and convert to string
        StringBuilder sb = new StringBuilder(Integer.toString(-num));

        // Reverse the string
        sb.reverse();

        // Convert back to integer and add negative sign
        return -Integer.parseInt(sb.toString());
    }
}
