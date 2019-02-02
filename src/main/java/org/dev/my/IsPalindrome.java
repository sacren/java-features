/**
 * Prompt the user for a word and tell if it is a palindrome.
 */
import java.util.Scanner;

public class IsPalindrome {
    /** Check if the string is a palindrome. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter a phrase in palindrome: ");
        String line = inStream.nextLine();
        inStream.close();
        if (line.isEmpty() || !isInputValid(line)) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is invalid!", line));
        }
        System.out.printf(
                "\"%s\" is%s a palindrome%n",
                line, isPalindrome(line) ? "" : " not");
    }

    private static boolean isPalindrome(String s) {
        s = getAlphaString(s); /* Strip non-alphabet characters. */
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
        for (char c: s.toCharArray()) {
            if (!Character.isLetter(c) && !isOneOfThese(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOneOfThese(char c) {
        switch (c) {
            case ' ':
            case '-':
            case '?':
            case ',':
            case '.':
            case '!':
            case '\'':
                return true;
            default:
                break;
        }
        return false;
    }

    private static String getAlphaString(String s) {
        /* Each letter in array is lower case. Ignore case for comparison. */
        String alphaString = "";
        for (char c: s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphaString += Character.toString(c);
            }
        }
        return alphaString;
    }
}
