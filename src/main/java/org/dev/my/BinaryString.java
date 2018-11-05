/**
 * Prompt the user for a string and check if it is a binary string consisting of 1's and 0's only.
 *
 * <p>Convert the binary string to numerical value in decimal.
 */
import java.util.Scanner;

public class BinaryString {
    /** Ask the user for a string and check if it is binary. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a binary string: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.println("The binary string is empty");
                continue;
            }

            break;
        }

        if (isBinary(line)) {
            System.out.printf(
                    "%s is a binary string%n"
                            + "%1$s in decimal is %d%n",
                    line, convertToDecimal(line));
        } else {
            System.out.printf("%s is not a binary string%n", line);
        }

        inStream.close();
    }

    private static boolean isBinary(String s) {
        final int size = s.length();
        final int first = 0;
        int numericValue;

        for (int i = first; i < size; i++) {
            numericValue = Character.digit(s.charAt(i), 2);

            if (numericValue == 0 || numericValue == 1) {
                if (i == size - 1) {
                    return true;
                }

                continue;
            }

            break;
        }

        return false;
    }

    private static int convertToDecimal(String s) {
        final int size = s.length();
        final int first = 0;
        int decimal = 0;
        int numericValue;
        int exponent;

        for (int i = first; i < size; i++) {
            exponent = size - i - 1;
            numericValue = Character.digit(s.charAt(i), 10);
            decimal += (int) Math.pow(2, exponent) * numericValue;
        }

        return decimal;
    }
}
