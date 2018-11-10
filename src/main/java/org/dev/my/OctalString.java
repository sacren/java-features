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
                System.out.println("The octal string is empty");
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
        final int size = s.length();
        final int first = 0;
        int numericValue;

        s = s.toLowerCase();

        for (int i = first; i < size; i++) {
            numericValue = Character.digit(s.charAt(i), 10);
            if (!(numericValue >= 0 && numericValue <= 7)) {
                return false;
            }
        }

        return true;
    }

    private static int convertToDecimal(String s) {
        final int size = s.length();
        final int first = 0;
        int decimal = 0;
        int numericValue;
        int exponent;

        s = s.toLowerCase();

        for (int i = first; i < size; i++) {
            /* (size - 1) is the greatest index and each iteration makes it decrement. */
            exponent = size - 1 - i;
            numericValue = Character.digit(s.charAt(i), 10);
            decimal += (int) Math.pow(8, exponent) * numericValue;
        }

        return decimal;
    }
}
