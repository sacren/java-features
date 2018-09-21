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

  /**
   * Calculate income tax by income amount and tax rate.
   */
  public static void calculateTax() {
    final double taxRateAbove20k = 0.1;
    final double taxRateAbove40k = 0.2;
    final double taxRateAbove60k = 0.3;
    final int taxableStep = 20000;
    final int income60k = 60000;
    final int income40k = 40000;
    final int income20k = 20000;
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
        if (income > income60k) {
          tax = taxableStep * taxRateAbove20k
                + taxableStep * taxRateAbove40k
                + (income - income60k) * taxRateAbove60k;
          break;
        }

        if (income > income40k) {
          tax = taxableStep * taxRateAbove20k
                + (income - income40k) * taxRateAbove40k;
          break;
        }

        if (income > income20k) {
          tax = (income - income20k) * taxRateAbove20k;
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
