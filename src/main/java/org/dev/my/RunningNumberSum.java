/**
 * Sum all the numbers from 9 to 888.
 * Answer: 394680.
 */
public class RunningNumberSum {
  public static void main(String[] args) {
    sumNumbers();
  }

  private static void sumNumbers() {
    int upperBound = 888;
    int lowerBound = 9;
    int sum = 0;

    for (int i = lowerBound; i <= upperBound; i++) {
      sum += i;
    }

    System.out.println("Sum from 9 to 888 is " + sum + ".");
  }
}
