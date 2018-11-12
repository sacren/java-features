/** Prompt the user for a hexadecimal string and print the equivalent binary string. */
import java.util.Scanner;

public class HexToBin {
    /** Prompt for hex string and convert to binary string. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a hex string: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.printf("\"%s\" is empty. Try again.%n", line);
                continue;
            }

            if (isHex(line)) {
                break;
            }

            System.out.printf("\"%s\" is not a hex string. Try again.%n", line);
        }

        System.out.printf(
                "%s hex string is equivalent to %s binary string%n",
                line, convertToBin(line));

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
