/**
 * Prompt the user for 2 non-negative integers for base and exponent. Without
 * Math API, print the result.
 */
import java.util.Scanner;

public class Exponent {
    /** Prompt the user for base and exponent and display the result. */
    public static void main(String[] args) {
        int base;
        int exponent;
        Scanner inStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter non-negative integer for base: ");
            base = inStream.nextInt();
            if (base > 0) {
                break;
            }
            System.out.printf("%d is not valid. Try again.%n", base);
        }

        for ( ; ; ) {
            System.out.print("Enter non-negative integer for exponent: ");
            exponent = inStream.nextInt();
            if (exponent > 0) {
                break;
            }
            System.out.printf("%d is not valid. Try again.%n", exponent);
        }

        System.out.printf(
                "%d to the power of %d is %d%n",
                base, exponent, getProduct(base, exponent));
        inStream.close();
    }

    private static int getProduct(int base, int exponent) {
        int product = 1;
        for (int i = 0; i < exponent; i++) {
            product *= base;
        }
        return product;
    }
}
