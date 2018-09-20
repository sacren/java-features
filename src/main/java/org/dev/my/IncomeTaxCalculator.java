/**
 * Use progressive income tax rate to calculate income tax with sentinel.
 * (1) Income $20,000 or below is exempt.
 * (2) Income above $20,000 but $40,000 or below has the rate of 10%.
 * (3) Income above $40,000 but $60,000 or below has the rate of 20%.
 * (4) Income above $60,000 is 30%.
 * (5) If income is negative, terminate tax calculation.
 */
import java.util.Scanner;

public class IncomeTaxCalculator {
  public static void main(String[] args) {
    calculateTax();
  }

  private static void calculateTax() {
    final double taxRateAbove20k = 0.1;
    final double taxRateAbove40k = 0.2;
    final double taxRateAbove60k = 0.3;
    double tax;
    double income;

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter income: $");
      income = inputStream.nextDouble();

      if (income < 0) {
        System.out.println("Bye!");
        break;
      }

      for (;;) {
        if (income > 60000) {
          tax = 20000 * taxRateAbove20k
                + 20000 * taxRateAbove40k
                + (income - 60000) * taxRateAbove60k;
          break;
        }

        if (income > 40000) {
          tax = 20000 * taxRateAbove20k
                + (income - 40000) * taxRateAbove40k;
          break;
        }

        if (income > 20000) {
          tax = (income - 20000) * taxRateAbove20k;
          break;
        }

        tax = 0;
        break;
      }

      System.out.printf("Income tax is $%.2f%n", tax);
    }

    inputStream.close();
  }
}
