/**
 * Use progressive income tax rate to calculate income tax.
 * (1) Income below $20,000 is exempted.
 * (2) Income $20,000 and above but below $40,000 has the rate of 10%.
 * (3) Income $40,000 and above but below $60,000 has the rate of 20%.
 * (4) Income $60,000 and above is 30%.
 */
import java.util.Scanner;

public class IncomeTaxCalculator {
  public static void main(String[] args) {
    calculateTax();
  }

  private static void calculateTax() {
    final double taxRate2k = 0.1;
    final double taxRate4k = 0.2;
    final double taxRate6k = 0.3;
    double tax = 0;
    double income;

    System.out.print("Enter income: $");
    Scanner stream = new Scanner(System.in);
    income = stream.nextDouble();
    stream.close();

    for (;;) {
      if ((int)income / 60000 >= 1) {
        tax = income * taxRate6k;
        break;
      }

      if ((int)income / 40000 >= 1) {
        tax = income * taxRate4k;
        break;
      }

      if ((int)income / 20000 >= 1) {
        tax = income * taxRate2k;
        break;
      }

      break;
    }

    System.out.printf("Income tax is $%.2f%n", tax);
  }
}
