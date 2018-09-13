/**
 * Use progressive income tax rate to calculate income tax.
 * (1) Income below $20,000 is exempt.
 * (2) Income above $20,000 but below $40,000 has the rate of 10%.
 * (3) Income above $40,000 but below $60,000 has the rate of 20%.
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

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter income: $");
      income = inputStream.nextDouble();

      if (income == -1) {
        System.out.println("Bye!");
        break;
      }

      for (;;) {
        if (income > 60000) {
          tax = 20000 * taxRate2k
                + 20000 * taxRate4k
                + (income - 60000) * taxRate6k;
          break;
        }

        if (income > 40000) {
          tax = 20000 * taxRate2k
                + (income - 40000) * taxRate4k;
          break;
        }

        if (income > 20000) {
          tax = (income - 20000) * taxRate2k;
          break;
        }

        break;
      }

      System.out.printf("Income tax is $%.2f%n", tax);
    }

    inputStream.close();
  }
}
