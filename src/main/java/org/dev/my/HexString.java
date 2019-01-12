/** Prompt the user for a hexadecimal string and convert it to decimal. */
import java.util.Scanner;

public class HexString {
    /** Ask the user for a string and check if it is hex. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        String line;
        System.out.print("Enter a hex string: ");
        line = inStream.nextLine();
        inStream.close();
        if (!isHex(line)) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is not a hex string!", line));
        }
        System.out.printf(
                "%s is a hex string%n"
                        + "%1$s in decimal is %d%n",
                line, convertToDecimal(line));
    }

    private static boolean isHex(String s) {
        final char[] charArray = s.toCharArray();

        for (char c: charArray) {
            if (Character.digit(c, 16) == -1) {
                return false;
            }
        }

        return true;
    }

    private static int convertToDecimal(String hexString) {
        final char[] charArray = hexString.toCharArray();
        final int size = charArray.length;
        int index = 0;
        int decimal = 0;
        int exponent;

        for (char c: charArray) {
            /* (size - 1) is the greatest index and each iteration makes it decrement. */
            exponent = size - 1 - index++;
            decimal += (int) Math.pow(16, exponent) * Character.digit(c, 16);
        }

        return decimal;
    }
}
