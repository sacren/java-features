/**
 * Compute and print the sum and product of three numbers.
 */
public class SumProduct3Numbers {
  public static void main(String[] args) {
    compute3Numbers();
  }

  private static void compute3Numbers() {
    int number1 = 98;
    int number2 = 5;
    int number3 = 77;
    int sum = number1 + number2 + number3;
    int product = number1 * number2 * number3;

    System.out.println("The sum and product of three numbers:\n"
                       + "98 + 5 + 77 = " + sum + "\n"
                       + "98 × 5 × 77 = " + product);
  }
}
