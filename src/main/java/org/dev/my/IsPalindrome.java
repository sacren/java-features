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
        s = getAlpha(s); /* Non-alphabet characters filtered out. */
        final int size = s.length();
        /* If size is odd, size / 2 + 1 == (size + 1) / 2 and the middle
         * character is included in neither firstHalf nor secondHalf. If size
         * is even, size / 2 == (size + 1) / 2.
         */
        String firstHalf = s.substring(0, size / 2);
        String secondHalf = s.substring((size + 1) / 2);
        final char[] charArray = secondHalf.toCharArray();
        final int halfSize = charArray.length;
        String reverseSecondHalf = "";

        for (int i = 0; i < halfSize; i++) {
            reverseSecondHalf += Character.toString(charArray[halfSize - 1 - i]);
        }

        /* Palindrome is determined by comparing first half to the second. */
        if (firstHalf.equals(reverseSecondHalf)) {
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

    private static String getAlpha(String s) {
        /* Each letter in array is lower case. Ignore case for comparison. */
        final char[] charArray = s.toLowerCase().toCharArray();
        String stripped = "";

        for (char c: charArray) {
            if (Character.isLetter(c)) {
                stripped += Character.toString(c);
            }
        }

        return stripped;
    }
}
