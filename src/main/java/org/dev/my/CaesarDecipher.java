/**
 * Prompt the user for a ciphertext string consisting of mixed-case letters only. Decipher to plain
 * text and print it out in upper case. Let key = 3.
 */
import java.util.Scanner;

public class CaesarDecipher {
    /** Entry point that retrieves and validates user input. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a string of cipher text: ");
            line = inStream.nextLine();

            if (line.isEmpty()) {
                System.out.println("The string is empty. Try again.");
                continue;
            }

            if (isInputValid(line)) {
                break;
            }

            System.out.println("The input is invalid. Try again.");
        }

        System.out.printf("The plain text: %s%n", cipherToPlain(line));

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

    private static String cipherToPlain(String s) {
        String plainText = new String();
        final int size = s.length();
        final int first = 0;
        final int cycle = 26;
        final int key = 3;
        char c;

        s = s.toUpperCase();

        for (int i = first; i < size; i++) {
            c = s.charAt(i);

            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    plainText += (char) (c + cycle - key);
                    break;
                default:
                    plainText += (char) (c - key);
            }
        }

        return plainText;
    }
}
