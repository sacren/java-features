/** Prompt the user for a word and tell if it is a palindrome. */
import java.util.Scanner;

public class IsPalindrome {
    /** Prompt the user for a word and test if it is a palindrome. */
    public static void main(String[] args) {
        String phrase;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a phrase in palindrome: ");
            phrase = inStream.nextLine();

            if (phrase.isEmpty()) {
                System.out.println("You entered an empty string. Try again.");
                continue;
            }

            if (isInputValid(phrase)) {
                break;
            }

            System.out.println("You entered an invalid string. Try again.");
        }

        System.out.printf(
                "%s is%s palindrome%n",
                phrase, isPalindrome(phrase) ? "" : " not");
        inStream.close();
    }

    private static boolean isPalindrome(String s) {
        s = getAlphaStr(s);

        final int size = s.length();
        final int first = 0;
        String firstHalf = s.substring(0, size / 2);
        String secondHalf = new String();

        for (int i = first; i < size / 2; i++) {
            secondHalf += s.charAt(size - 1 - i);
        }

        /* Only need to compare the first half to the second. */
        if (firstHalf.equals(secondHalf)) {
            return true;
        }

        return false;
    }

    private static boolean isInputValid(String s) {
        final int size = s.length();
        final int first = 0;
        char c;

        for (int i = first; i < size; i++) {
            c = s.charAt(i);

            if (Character.isISOControl(c)) {
                break;
            }

            if (i == size - 1) {
                return true;
            }
        }

        return false;
    }

    private static String getAlphaStr(String s) {
        final int size = s.length();
        final int first = 0;
        String stripped = new String();
        char c;

        for (int i = first; i < size; i++) {
            c = s.charAt(i);

            if (Character.isLetter(c)) {
                stripped += c;
            }
        }

        return stripped.toLowerCase();
    }
}
