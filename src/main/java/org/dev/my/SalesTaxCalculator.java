/**
 * Continuously input the tax-inclusive price of 7% tax rate.  Compute the
 * actual price and the sales tax rounded to 2 decimal places.  Print the total
 * price, the actual price and sales tax when terminate.
 */
import java.util.Scanner;

public class SalesTaxCalculator {
  /**
   * Entry point to SalesTaxCalculator class.
   */
  public static void main(String[] args) {
    double priceWithTax;
    double sum = 0;

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter the price including sales tax: ");
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

  /**
   * Calculate actual price and sales tax.
   */
  public static void calculatePrice(double priceWithTax) {
    double taxRate = 0.07;
    double preTaxPrice = priceWithTax / (1 + taxRate);
    double salesTax = priceWithTax - preTaxPrice;
    System.out.printf("The pretax price is %.2f%n"
                      + "The 7%% sales tax is %.2f%n"
                      + "The price with tax is %.2f%n",
                      preTaxPrice, salesTax, priceWithTax);
  }
}
