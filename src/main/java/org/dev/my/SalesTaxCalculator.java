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
    double taxInPrice;
    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter the price including sales tax: ");
      taxInPrice = inputStream.nextDouble();

      if (taxInPrice < 0) {
        break;
      }

      calculatePrice(taxInPrice);
    }

    inputStream.close();
  }

  /**
   * Calculate actual price and sales tax.
   */
  public static void calculatePrice(double userInput) {
    double taxRate = 0.07;
    double actualPrice = userInput / (1 + taxRate);
    double salesTax = actualPrice * taxRate;
    System.out.printf("The actual price is %.2f%n"
                      + "The sales tax is %.2f%n"
                      + "The total price is %.2f%n",
                      actualPrice, salesTax, userInput);
  }
}
