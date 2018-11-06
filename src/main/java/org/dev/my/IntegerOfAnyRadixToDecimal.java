/** Prompt the user for a number and a radix and convert the number to decimal. */
import java.util.Scanner;

public class IntegerOfAnyRadixToDecimal {
    /** Prompt the user and convert to decimal. */
    public static void main(String[] args) {
        String stringInteger;
        String stringRadix;
        int radix;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a radix: ");
            stringRadix = inStream.next();

            if (isRadixValid(stringRadix)) {
                radix = Integer.parseInt(stringRadix);
                break;
            }

            System.out.printf("%s is invalid. Try again.%n", stringRadix);
        }

        System.out.print("Enter an integer: ");
        stringInteger = inStream.next();
        System.out.printf(
                "%s is %d in decimal%n",
                stringInteger, Integer.parseInt(stringInteger, radix));

        inStream.close();
    }

    private static boolean isRadixValid(String s) {
        final int radix = Integer.parseInt(s);

        if (radix >= 2 && radix <= 16) {
            return true;
        }

        return false;
    }
}
