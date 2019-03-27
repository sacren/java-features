/**
 * Test driver for Gcd class.
 */
import java.util.Scanner;

public class TestGcd {
    /** Test driver for GCD. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        System.out.print("Enter a positive integer: ");
        int m = in.nextInt();
        in.close();
        Gcd gcd = new Gcd(n, m);
        System.out.println();
        System.out.println("=== GCD ===");
        System.out.println();
        System.out.println(gcd);
        System.out.println();
        System.out.println("=== Recursive GCD ===");
        System.out.println();
        System.out.printf("GCD: %d%n", gcd.recGcd(n, m));
    }
}
