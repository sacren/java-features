/**
 * Prompt the user for a plaintext string consisting of mixed-case letters
 * only.  Swap the corresponding letters between plain and cipher texts.  Print
 * out the result in upper case.  Example: abcXYZ <-> ZYXCBA.
 */
import java.util.Scanner;

public class ExchangeCipher {
    /**
     * Entry point that retrieves and validates the input string.
     */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for (;;) {
            System.out.print("Enter a plaintext string: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.println("The string is empty. Try again.");
                continue;
            }

            if (isInputValid(line)) {
                break;
            }

            System.out.println("The string is invalid. Try again.");
        }

        System.out.printf("The ciphertext string: %s%n", getCipher(line));

        inStream.close();
    }

    private static String getCipher(String s) {
        String cipher = new String();
        final int size = s.length();
        final int first = 0;
        /* 'A' + 'Z' and 'B' + 'Y'... are all equal. */
        final int key = 'A' + 'Z';

        /* Make the whole string upper case for easier handling. */
        s = s.toUpperCase();

        for (int i = first; i < size; i++) {
            cipher += (char)(key - s.charAt(i));
        }

        return cipher;
    }

    private static boolean isInputValid(String s) {
        final int size = s.length();
        final int first = 0;

        for (int i = first; i < size; i++) {
            if (!Character.isLetter(s.charAt(i))) {
                break;
            }

            if (i == size - 1) {
                return true;
            }
        }

        return false;
    }
}
