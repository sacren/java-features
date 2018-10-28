/** Prompt the user for a string and reverse its order. */
import java.util.Scanner;

public class ReverseString {
    /** Ask the user for the string. */
    public static void main(String[] args) {
        String line;

        Scanner inStream = new Scanner(System.in);

        System.out.print("Enter a string: ");
        line = inStream.nextLine();
        System.out.printf(
                "The original string: %s%n"
                + "The reversed string: %s%n",
                line, reverseString(line));

        inStream.close();
    }

    private static String reverseString(String s) {
        final int size = s.length();
        final int first = 0;
        String reversed = new String();

        for (int i = first; i < size; i++) {
            reversed += Character.toString(s.charAt(size - 1 - i));
        }

        return reversed;
    }
}
