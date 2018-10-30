/** Prompt the user for a word and tell if it is a palindrome. */
import java.util.Scanner;

public class IsPalindrome {
    /** Prompt the user for a word and test if it is a palindrome. */
    public static void main(String[] args) {
        String word;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a word in palindrome: ");
            word = inStream.nextLine();

            if (word.isEmpty()) {
                System.out.println("You entered an empty string. Try again.");
                continue;
            }

            if (isInputValid(word)) {
                break;
            }

            System.out.println("You entered an invalid string. Try again.");
        }

        System.out.printf(
                "%s is%s palindrome%n",
                word, isPalindrome(word) ? "" : " not");
        inStream.close();
    }

    private static boolean isPalindrome(String s) {
        final int size = s.length();
        final int first = 0;
        String reversed = new String();

        for (int i = first; i < size; i++) {
            reversed += s.charAt(size - 1 - i);
        }

        if (s.equals(reversed)) {
            return true;
        }

        return false;
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
