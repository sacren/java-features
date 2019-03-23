/**
 * Prompt the user for an upper bound (a positive integer) and list all the
 * perfect numbers less than or equal to this upper bound. It shall also list
 * all the numbers that are neither deficient nor perfect.
 */
import java.util.Arrays;
import java.util.Scanner;

public class TestPerfectNumber {
    /** TestPerfectNumber is the driver for a perfect number. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int number;
        System.out.print("Enter a positive integer for upper bound: ");
        number = inputStream.nextInt();
        if (number <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", number));
        }
        inputStream.close();
        int[] countArray = new int[2]; /* [0]: perfect count, [1]: neither count */
        for (int i = 1; i <= number; i++) {
            if (isPerfect(i)) {
                countArray[0]++;
                continue;
            }
            if (isDeficient(i)) {
                continue;
            }
            countArray[1]++;
        }
        int[] perfectArray = new int[countArray[0]];
        int[] neitherArray = new int[countArray[1]];
        int perfectCount = 0;
        int neitherCount = 0;
        for (int i = 1; i <= number; i++) {
            if (isPerfect(i)) {
                perfectArray[perfectCount++] = i;
                continue;
            }
            if (isDeficient(i)) {
                continue;
            }
            neitherArray[neitherCount++] = i;
        }
        System.out.printf(
                "List of perfect numbers:%n"
                        + "%s%n"
                        + "%d perfect numbers (%.2f%%)%n%n"
                        + "List of numbers neither perfect nor deficient:%n"
                        + "%s%n"
                        + "%d neither perfect nor deficient (%.2f%%)%n",
                Arrays.toString(perfectArray), perfectCount, (double) perfectCount / number * 100,
                Arrays.toString(neitherArray), neitherCount, (double) neitherCount / number * 100);
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
