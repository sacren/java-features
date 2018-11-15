/**
 * Prompt the user for an integer (-1 to quit) and make the sum of numbers
 * containing the digit 8.
 */

import java.util.Scanner;

public class MagicSum {
    /** Prompt the user for a non-negative integer and get the sum. */
    public static void main(String[] args) {
        final int sentinel = -1;
        int sum = 0;
        int number;

        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter an integer(-1 to quit): ");
            number = inStream.nextInt();

            if (number == sentinel) {
                break;
            }

            if (number < 0) {
                System.out.printf("%d is not valid. Try again.%n", number);
                continue;
            }

            if (hasEight(number)) {
                sum += number;
            }
        }

        System.out.printf("The magic sum is %d%n", sum);
        inStream.close();
    }

    private static boolean hasEight(int number) {
        for ( ; ; ) {
            if (number == 0) { /* All the digits are dropped */
                return false;
            }
            if (number % 10 == 8) { /* 8 in the number */
                break;
            }
            number /= 10; /* Drop least significant digit */
        }
        return true;
    }
}
