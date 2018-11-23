/** Prompt the user for a number and a radix and convert the number to decimal. */
import java.util.Scanner;

public class IntegerOfAnyRadixToDecimal {
    /** Prompt the user and convert to decimal. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        String stringInteger;
        int radix;
        for ( ; ; ) {
            System.out.print("Enter a radix: ");
            radix = inStream.nextInt();
            if (isRadixValid(radix)) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", radix);
        }
        System.out.print("Enter an integer: ");
        stringInteger = inStream.next();
        System.out.printf(
                "%s is %d in decimal%n",
                stringInteger, Integer.parseInt(stringInteger, radix));
        inStream.close();
    }

    private static boolean isRadixValid(int number) {
        if (number >= 2 && number <= 16) {
            return true;
        }
        return false;
    }
}
