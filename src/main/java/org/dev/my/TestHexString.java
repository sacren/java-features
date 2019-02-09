/** Prompt the user for a hexadecimal string and convert it to decimal. */
import java.util.Scanner;

public class TestHexString {
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
        System.out.println();
        System.out.printf(
                "0X%s = %d%n",
                line, convertToDecimal(line));
    }

    private static boolean isHex(String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length == 0) {
            return false;
        }
        for (char c: charArray) {
            if (Character.digit(c, 16) == -1) {
                return false;
            }
        }
        return true;
    }

    private static int convertToDecimal(String hexString) {
        final char[] charArray = hexString.toCharArray();
        int index = 0;
        int decimal = 0;
        for (char c: charArray) {
            /* (charArray.length - 1) is the position number of the most significant hex bit.
             * (charArray.length - 1 - index) happens to be the exponent.
             */
            decimal += (int) Math.pow(16, charArray.length - 1 - index++) * Character.digit(c, 16);
        }
        return decimal;
    }
}
