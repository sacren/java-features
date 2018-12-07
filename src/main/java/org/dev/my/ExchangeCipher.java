/**
 * Prompt the user for a plaintext string consisting of mixed-case letters only. Swap the
 * corresponding letters between plain and cipher texts. Print out the result in upper case.
 * Example: abcXYZ <-> ZYXCBA.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ExchangeCipher {
    /** Entry point that retrieves and validates the input string. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        String line;
        for ( ; ; ) {
            System.out.print("Enter a plaintext string: ");
            line = inStream.nextLine();
            if (line.isEmpty()) {
                System.out.printf("\"%s\" is empty. Try again.%n", line);
                continue;
            }
            if (isInputValid(line)) {
                break;
            }
            System.out.printf("\"%s\" is invalid. Try again.%n", line);
        }
        System.out.printf("The ciphertext string: %s%n", getCipher(line));
        inStream.close();
    }

    private static String getCipher(String s) {
        char[] cipherArray = s.toUpperCase().toCharArray();
        String cipher = "";
        /* 'A' + 'Z' and 'B' + 'Y'... are all equal. */
        final int key = 'A' + 'Z';
        for (char c: cipherArray) {
            cipher += Character.toString((char) (key - c));
        }
        return cipher;
    }

    private static boolean isInputValid(String s) {
        for (char c: s.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
