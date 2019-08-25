/**
 * Test driver for RvsInt class.
 */
import java.util.Scanner;

public class TestRvsInt {
    /** RvsInt test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a non-negative integer: ");
        num = in.nextInt();
        in.close();
        try {
            System.out.println();
            System.out.println("=== Reverse integer ===");
            System.out.println();
            System.out.println(new RvsInt(num));
            System.out.println();
            System.out.println("=== Reverse integer by operation ===");
            System.out.println();
            System.out.println(new RvsIntOp(num));
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }
}
