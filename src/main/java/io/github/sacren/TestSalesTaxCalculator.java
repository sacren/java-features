/**
 * Continuously input the tax-inclusive price of 7% tax rate. Compute the actual price and the sales
 * tax rounded to 2 decimal places. Print the total price, the actual price and sales tax when
 * terminate.
 */
import java.util.Scanner;

public class TestSalesTaxCalculator {
    /** Entry point to SalesTaxCalculator class. */
    public static void main(String[] args) {
        double priceWithTax;
        double sum = 0;

        Scanner inputStream = new Scanner(System.in);

        for ( ; ; ) {
            System.out.print("Enter the price with tax (negative to exit): ");
            priceWithTax = inputStream.nextDouble();

            if (priceWithTax < 0) {
                calculatePrice(sum);
                break;
            }

            sum += priceWithTax;
            calculatePrice(priceWithTax);
            System.out.println();
        }

        inputStream.close();
    }

    /* Calculate actual price and sales tax. */
    private static void calculatePrice(double priceWithTax) {
        final double taxRate = 0.07;
        double preTaxPrice;

        preTaxPrice = priceWithTax / (1 + taxRate);
        preTaxPrice = Math.floor(preTaxPrice * 100 + 0.5) / 100; /* Rounded. */
        priceWithTax = Math.floor(priceWithTax * 100 + 0.5) / 100; /* Rounded. */

        final double salesTax = priceWithTax - preTaxPrice;

        System.out.printf(
                "The pretax price is %.2f%n"
                        + "The 7%% sales tax is %.2f%n"
                        + "The price with tax is %.2f%n",
                preTaxPrice, salesTax, priceWithTax);
    }
}
