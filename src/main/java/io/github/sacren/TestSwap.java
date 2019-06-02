/**
 * Test driver for Swap class.
 */
import java.util.Scanner;

public class TestSwap {
    /** Swap test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        System.out.print("Enter the first integer: ");
        num1 = in.nextInt();
        int num2;
        System.out.print("Enter the second integer: ");
        num2 = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Swap 2 integers ===");
        System.out.println();
        Swap sp = new Swap(num1, num2);
        System.out.println(sp);
        System.out.println();
        System.out.println("=== After swap ===");
        System.out.println();
        sp.swap();
        System.out.println(sp);
    }
}
