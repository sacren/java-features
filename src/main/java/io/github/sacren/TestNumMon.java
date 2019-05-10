/**
 * Test driver for NumMon class.
 */
import java.util.Scanner;

public class TestNumMon {
    /** NumMon test driver. */
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 through 12 for the month: ");
        num = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Number to month ===");
        System.out.println();
        System.out.println(new NumMon(num));
    }
}
