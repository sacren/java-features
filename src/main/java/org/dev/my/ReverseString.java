/** Prompt the user for a string and reverse its order. */
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    /** Ask the user for the string. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter a string: ");
            line = inStream.nextLine();

            /* The check protects array index falling into negative value. */
            if (!line.isEmpty()) {
                break;
            }

            System.out.printf("\"%s\" is empty. Try again.%n", line);
        }

        System.out.printf(
                "The original string: %s%n"
                        + "The reversed string: %s%n",
                line, reverseString(line));

        inStream.close();
    }

    /* String to array, reverse array, array to string. */
    private static String reverseString(String s) {
        final char[] charArray = s.toCharArray();
        final int size = charArray.length;
        int index = 0;
        for (char c: charArray) {
            if (index == size / 2) {
                break;
            }
            charArray[index] = charArray[size - 1 - index];
            charArray[size - 1 - index++] = c;
        }
        String reversed = "";
        for (char c: charArray) {
            reversed += Character.toString(c);
        }
        return reversed;
    }
}
