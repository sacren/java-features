/**
 * Sum of the square of all the numbers from 1 to 100.
 * Answer: 338350
 */
public class RunningNumberSquareSum {
  public static void main(String[] args) {
    sumSquareNumbers();
  }

  private static void sumSquareNumbers() {
    int upperBound = 100;
    int lowerBound = 1;
    int sum = 0;

    for (int i = lowerBound; i <= upperBound; i++) {
      sum += i * i;
    }

    System.out.println("Sum of the square of all the numbers is " + sum + ".");
  }
}
