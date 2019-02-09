/** Prompt the user for a number and a radix and convert the number to decimal. */
import java.util.Scanner;

public class TestIntegerOfAnyRadixToDecimal {
    /** Convert to decimal number. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int radix;
        System.out.print("Enter the radix: ");
        radix = inStream.nextInt();
        if (!isRadixValid(radix)) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid for radix!", radix));
        }
        System.out.print("Enter an integer: ");
        String stringInteger = inStream.next();
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
