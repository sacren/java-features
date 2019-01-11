/**
 * By definition, GCD(a, b) is the greatest factor that divides both a and b.
 * Assume that a and b are positive integers, and a >= b, the Euclid algorithm
 * is based on these two properties:
 *
 * GCD(a, 0) = a
 * GCD(a, b) = GCD(b, a mod b), where (a mod b) denotes the remainder of a
 * divided by b.
 */
import java.util.Scanner;

public class GreatestCommonDenominator {
    /**
     * Prompt the user for 2 positive integers and give the greatest common
     * denominator.
     */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int n1;
        System.out.print("Enter a positive integer: ");
        n1 = inStream.nextInt();
        if (n1 <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", n1));
        }
        int n2;
        System.out.print("Enter a positive integer: ");
        n2 = inStream.nextInt();
        if (n2 <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", n2));
        }
        int tmp;
        if (n1 < n2) {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        System.out.printf(
                "The greatest common denominator of %d and %d is %d%n"
                        + "By recursion the greatest common denominator of %1$d and %2$d is %d%n",
                n1, n2, gcd(n1, n2), gcdRecursive(n1, n2));
        inStream.close();
    }

    private static int gcd(int a, int b) {
        int remainder;
        for ( ; ; ) {
            if (b == 0) {
                break;
            }
            remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    private static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }
}
