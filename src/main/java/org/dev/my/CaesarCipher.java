/**
 * Caesar's Cipher is one of the simplest encryption techniques. Each letter in the plaintext is
 * replaced by a letter some fixed number of position (n) down the alphabet cyclically. Prompt user
 * for some plain text consisting of mixed-case letters only. Construct the cipher text and print it
 * out in uppercase. Let n = 3.
 */
import java.util.Scanner;

public class CaesarCipher {
    /** Entry point of the class with validation of user input. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter text in mixed case: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.println("The string is empty. Try again.");
                continue;
            }

            if (isInputValid(line)) {
                break;
            }

            System.out.println("You entered an invalid string. Try again.");
        }

        System.out.printf("The cipher text: %s%n", plainToCipher(line));

        inStream.close();
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

    private static String plainToCipher(String s) {
        final int size = s.length();
        final int first = 0;
        final int key = 3;
        final int cycle = 26;
        String cipherText = new String();
        char c;

        s = s.toUpperCase();

        for (int i = first; i < size; i++) {
            c = s.charAt(i);

            switch (c) {
                case 'X':
                case 'Y':
                case 'Z':
                    c = (char) (c + key - cycle);
                    break;
                default:
                    c = (char) (c + key);
            }

            cipherText += Character.toString(c);
        }

        return cipherText;
    }
}
