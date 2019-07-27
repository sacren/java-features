/**
 * Test driver for Add2Int class.
 */
import java.util.Scanner;

public class TestAdd2Int {
    /** Add2Int test driver. */
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
        System.out.println("=== Add 2 integers ===");
        System.out.println();
        System.out.println(new Add2Int(num1, num2));
    }
}
