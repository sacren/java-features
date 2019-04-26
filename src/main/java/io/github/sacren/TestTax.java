/**
 * Test driver for Tax class.
 */
import java.util.Scanner;

public class TestTax {
    /** Tax test driver. */
    public static void main(String[] args) {
        double income;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter income: ");
        income = in.nextDouble();
        in.close();
        System.out.println();
        System.out.println("=== Tax calculation ===");
        System.out.println();
        System.out.println(new Tax(income));
    }
}
