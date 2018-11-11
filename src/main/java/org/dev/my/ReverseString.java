/** Prompt the user for a string and reverse its order. */
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

    private static String reverseString(String s) {
        final char[] charArray = s.toCharArray();
        final int size = charArray.length;
        /* From the last item in the array. */
        String reversed = Character.toString(charArray[size - 1]);

        /* Start from the second last item of the array. */
        for (int i = 1; i < size; i++) {
            reversed += Character.toString(charArray[size - 1 - i]);
        }

        return reversed;
    }
}
