/**
 * Prompt the user for a hex string and print the equivalent binary string.
 */
import java.util.Scanner;

public class HexToBin {
    /** Prompt for hex string and convert to binary string. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String line = inStream.nextLine();
        inStream.close();
        if (!isHex(line)) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is not a hex string!", line));
        }
        System.out.printf(
                "%s hex string is equivalent to %s binary string%n",
                line, convertToBin(line));
    }

    private static boolean isHex(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (char c: s.toCharArray()) {
            if (Character.digit(c, 16) == -1) {
                return false;
            }
        }
        return true;
    }

    private static String convertToBin(String s) {
        String[] binArray = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };
        final char[] charArray = s.toCharArray();
        String binString = "";

        for (char c: charArray) {
            binString += binArray[Character.digit(c, 16)];
        }

        return binString;
    }
}
