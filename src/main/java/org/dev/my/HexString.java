/** Prompt the user for a hexadecimal string and convert it to decimal. */
import java.util.Scanner;

public class HexString {
    /** Ask the user for a string and check if it is hex. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a hex string: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.println("The hex string is empty");
                continue;
            }

            if (isHex(line)) {
                break;
            }

            System.out.printf("%s is not a hex string. Try again.%n", line);
        }

        System.out.printf(
                "%s is a hex string%n"
                        + "%1$s in decimal is %d%n",
                line, convertToDecimal(line));

        inStream.close();
    }

    private static boolean isHex(String s) {
        final int size = s.length();
        final int first = 0;
        int numericValue;

        s = s.toLowerCase();

        for (int i = first; i < size; i++) {
            numericValue = Character.digit(s.charAt(i), 16);
            if (!(numericValue >= 0 && numericValue <= 15)) {
                return false;
            }
        }

        return true;
    }

    private static int convertToDecimal(String s) {
        final int size = s.length();
        final int first = 0;
        int decimal = 0;
        int digit;
        int exponent;
        char c;

        s = s.toLowerCase();

        for (int i = first; i < size; i++) {
            c = s.charAt(i);
            /* (size - 1) is the greatest index and each iteration makes it decrement. */
            exponent = size - 1 - i;

            /* We are only interested in arithmetic difference between this character
             * and 'a'. And that includes 'A' due to toLowerCase() call.  We don't
             * have to worry about going over boundaries as isHex() protects.
             */
            if (Character.isDigit(c)) {
                digit = Character.digit(c, 10);
            } else {
                digit = Character.compare(c, 'a') + 10;
            }

            decimal += (int) Math.pow(16, exponent) * digit;
        }

        return decimal;
    }
}
