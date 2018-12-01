/**
 * Prompt the user for an upper bound (a positive integer) and list all the
 * perfect numbers less than or equal to this upper bound. It shall also list
 * all the numbers that are neither deficient nor perfect.
 */
import java.util.Scanner;

public class PerfectNumber {
    /** Prompt for a positive integer and check if it is a perfect number. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int number;
        for ( ; ; ) {
            System.out.print("Enter a positive integer for upper bound: ");
            number = inputStream.nextInt();
            if (number > 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", number);
        }
        String perfectNumbers = "";
        String neither = "";
        int perfectCount = 0;
        int neitherCount = 0;
        for (int i = 1; i <= number; i++) {
            if (isPerfect(i)) {
                if (perfectNumbers.isEmpty()) {
                    perfectNumbers += Integer.toString(i);
                } else {
                    perfectNumbers += " " + Integer.toString(i);
                }
                perfectCount++;
                continue;
            }
            if (isDeficient(i)) {
                continue;
            }
            if (neither.isEmpty()) {
                neither += Integer.toString(i);
            } else {
                neither += " " + Integer.toString(i);
            }
            neitherCount++;
        }
        System.out.printf(
                "List of perfect numbers:%n"
                        + "%s%n"
                        + "%d perfect numbers (%.2f%%)%n%n"
                        + "List of numbers neither perfect nor deficient:%n"
                        + "%s%n"
                        + "%d neither perfect nor deficient (%.2f%%)%n",
                perfectNumbers, perfectCount, (double) perfectCount / number * 100,
                neither, neitherCount, (double) neitherCount / number * 100);
        inputStream.close();
    }

    private static boolean isPerfect(int number) {
        int sum = 0;
        /* Proper divisor doesn't go beyond the median of the number. */
        for (int i = 1; i <= number >> 1; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    private static boolean isDeficient(int number) {
        int sum = 0;
        /* Proper divisor doesn't go beyond the median of the number. */
        for (int i = 1; i <= number >> 1; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum < number) {
            return true;
        }
        return false;
    }
}
