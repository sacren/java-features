/**
 * Test dirver for SalesTax class.
 */
import java.util.Scanner;

public class TestSalesTax {
    /** SalesTax test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price;
        System.out.print("Enter the price with tax: ");
        price = in.nextDouble();
        in.close();
        System.out.println();
        System.out.println("=== Sales tax ===");
        System.out.println();
        System.out.println(new SalesTax(price));
    }
}
