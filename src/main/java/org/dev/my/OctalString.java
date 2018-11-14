/** Prompt the user for an octal string and convert it to decimal. */
import java.util.Scanner;

public class OctalString {
    /** Ask the user for a string and check if it is octal. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter an octal string: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.printf("\"%s\" is empty. Try again.%n", line);
                continue;
            }

            if (isOctal(line)) {
                break;
            }

            System.out.printf("\"%s\" is not an octal string. Try again.%n", line);
        }

        System.out.printf(
                "%s is an octal string%n"
                        + "%1$s in decimal is %d%n",
                line, convertToDecimal(line));

        inStream.close();
    }

    private static boolean isOctal(String s) {
        final char[] charArray = s.toCharArray();

        for (char c: charArray) {
            if (Character.digit(c, 8) == -1) {
                return false;
            }
        }

        return true;
    }

    private static int convertToDecimal(String octalString) {
        final char[] charArray = octalString.toCharArray();
        final int size = charArray.length;
        int index = 0;
        int decimal = 0;
        int exponent;

        for (char c: charArray) {
            /* (size - 1) is the greatest index and each iteration makes it decrement. */
            exponent = size - 1 - index++;
            decimal += (int) Math.pow(8, exponent) * Character.digit(c, 8);
        }

        return decimal;
    }
}
