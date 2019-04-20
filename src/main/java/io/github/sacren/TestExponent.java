/**
 * Test driver for Exponent class.
 */
import java.util.Scanner;

public class TestExponent {
    /** Exponent test driver. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int base;
        System.out.print("Enter non-negative integer for base: ");
        base = inStream.nextInt();
        int exponent;
        System.out.print("Enter non-negative integer for exponent: ");
        exponent = inStream.nextInt();
        inStream.close();
        System.out.println();
        System.out.println("=== Exponent operation ===");
        System.out.println();
        System.out.println(new Exponent(base, exponent));
    }
}
