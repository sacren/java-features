/** Prompt the user for a string and count the number of vowels and digits. */
import java.util.Scanner;

public class TestCountVowelDigit {
    /** Entry point of class. Ask the user to enter a string. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        String line;
        for ( ; ; ) {
            System.out.print("Enter a string: ");
            line = inStream.nextLine();
            if (!line.isEmpty()) {
                break;
            }
            System.out.println("The string is empty. Try again.");
        }
        char[] charArray = line.toLowerCase().toCharArray();
        int[] countArray = countVowelDigit(charArray);
        System.out.printf(
                "Number of vowels: %d (%.2f%%)%n"
                        + "Number of digits: %d (%.2f%%)%n",
                countArray[0], (float) countArray[0] * 100 / charArray.length,
                countArray[1], (float) countArray[1] * 100 / charArray.length);
        inStream.close();
    }

    private static int[] countVowelDigit(char[] charArray) {
        int[] count = new int[2];
        for (char c: charArray) {
            if (Character.isDigit(c)) {
                count[1]++;
                continue;
            }
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count[0]++;
                    break;
                default:
            }
        }
        return count;
    }
}
