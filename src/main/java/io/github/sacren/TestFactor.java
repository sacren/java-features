/**
 * Test driver for Factor class.
 */
import java.util.Scanner;

public class TestFactor {
    /** Factor test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a positive number for upper bound: ");
        num = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Prime factors ===");
        System.out.println();
        System.out.println(new Factor(num));
    }
}
