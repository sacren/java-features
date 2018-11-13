/** Prompt the user for a word and tell if it is a palindrome. */
import java.util.Scanner;

public class IsPalindrome {
    /** Prompt the user for a word and test if it is a palindrome. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a phrase in palindrome: ");
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

        System.out.printf(
                "\"%s\" is%s a palindrome%n",
                line, isPalindrome(line) ? "" : " not");
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
        final char[] charArray = s.toCharArray();
        boolean hasAlpha = true;

        for (char c: charArray) {
            if (Character.isLetter(c)) {
                hasAlpha = false;
                continue;
            }

            switch (c) {
                case ' ':
                case '-':
                case '?':
                case ',':
                case '.':
                case '!':
                case '\'':
                    continue;
                default:
                    return false;
            }
        }

        if (hasAlpha) {
            return false;
        }

        return true;
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
