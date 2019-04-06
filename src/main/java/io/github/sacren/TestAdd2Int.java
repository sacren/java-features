/**
 * Test driver for Add2Int class.
 */
import java.util.Scanner;

public class TestAdd2Int {
    /** Add2Int test driver. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        final int n1 = inStream.nextInt();
        System.out.print("Enter the second integer: ");
        final int n2 = inStream.nextInt();
        inStream.close();
        Add2Int add2 = new Add2Int(n1, n2);
        System.out.println();
        System.out.println("=== Add 2 integers ===");
        System.out.println();
        System.out.println(add2);
    }
}
