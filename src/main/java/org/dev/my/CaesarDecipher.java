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
                System.out.printf("\"%s\" is empty. Try again.%n", line);
                continue;
            }

            if (isInputValid(line)) {
                break;
            }

            System.out.printf("\"%s\" is invalid. Try again.%n", line);
        }

        System.out.printf("The plain text: %s%n", cipherToPlain(line));

        inStream.close();
    }

    private static boolean isInputValid(String s) {
        final char[] charArray = s.toCharArray();

        for (char c: charArray) {
            if (Character.isLetter(c)) {
                continue;
            }

            return false;
        }

        return true;
    }

    private static String cipherToPlain(String s) {
        final char[] charArray = s.toUpperCase().toCharArray();
        final int cycle = 26;
        final int key = 3;
        String plainText = "";

        for (char c: charArray) {
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
