/** Prompt the user for a hexadecimal string and print the equivalent binary string. */
import java.util.Scanner;

public class HexToBin {
    /** Prompt for hex string and convert to binary string. */
    public static void main(String[] args) {
        String hexString;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a hexadecimal string: ");
            hexString = inStream.nextLine();

            if (isHex(hexString)) {
                break;
            }

            System.out.println("Not a hexidecial number. Try again.");
        }

        System.out.printf(
                "%s hex string is equivalent to %s binary string%n",
                hexString, convertToBin(hexString));

        inStream.close();
    }

    private static boolean isHex(String s) {
        final char[] charArray = s.toCharArray();
        int numericValue;

        for (char c: charArray) {
            numericValue = Character.digit(c, 16);
            if (!(numericValue >= 0 && numericValue <= 15)) {
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
