/**
 * Add six integers and print the sum.
 */
public class SixNumberSum {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    printSum();
  }

  private static void printSum() {
    int number1 = 11;
    int number2 = 22;
    int number3 = 33;
    int number4 = 44;
    int number5 = 55;
    int number6 = 66;
    int sum;

    sum = number1 + number2 + number3 + number4 + number5;
    sum += number6;

    System.out.println("The sum is " + sum + ".");
  }
}
