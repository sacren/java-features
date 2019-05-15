/**
 * Test driver for PerfNum class.
 */
import java.util.Scanner;

public class TestPerfNum {
    /** PerfNum test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a positive integer for upper bound: ");
        num = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Perfect number ===");
        System.out.println();
        System.out.println(new PerfNum(num));
    }
}
