/**
 * Prompt the user for 2 non-negative integers for base and exponent. Without
 * Math API, print the result.
 */
import java.util.Scanner;

public class Exponent {
    /** Prompt the user for base and exponent and display the result. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int base;
        int exponent;
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
                "No MATH API: %d to the power of %d is %d%n"
                        + "With MATH API: %f to the power of %f is %f%n",
                base, exponent, getProduct(base, exponent),
                (double) base, (double) exponent, Math.pow((double) base, (double) exponent));
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
