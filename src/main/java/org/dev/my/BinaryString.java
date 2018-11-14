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
                System.out.printf("\"%s\" is empty. Try again.%n", line);
                continue;
            }

            if (isBinary(line)) {
                break;
            }

            System.out.printf("\"%s\" is not a binary string. Try again.%n", line);
        }

        System.out.printf(
                "%s is a binary string%n"
                        + "%1$s in decimal is %d%n",
                line, convertToDecimal(line));

        inStream.close();
    }

    private static boolean isBinary(String s) {
        final char[] charArray = s.toCharArray();

        for (char c: charArray) {
            if (Character.digit(c, 2) == -1) {
                return false;
            }
        }

        return true;
    }

    private static int convertToDecimal(String binaryString) {
        final char[] charArray = binaryString.toCharArray();
        final int size = charArray.length;
        int index = 0;
        int decimal = 0;
        int exponent;

        for (char c: charArray) {
            /* (size - 1) is the greatest index and each iteration makes it decrement. */
            exponent = size - 1 - index++;
            decimal += (int) Math.pow(2, exponent) * Character.digit(c, 2);
        }

        return decimal;
    }
}
