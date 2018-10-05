/**
 * Sum all the integers between 1 and 1000, that are divisible by 13, 15 or 17,
 * but not by 30.
 */
public class RunningNumberDivisible {
  public static void main(String[] args) {
    sumNumbersDivisible();
  }

  private static void sumNumbersDivisible() {
    final int upperBound = 1000;
    final int lowerBound = 1;
    int sum = 0;

    for (int i = lowerBound; i <= upperBound; i++) {
      if ((i % 13 == 0
           || i % 15 == 0
           || i % 17 == 0)
          && i % 30 != 0) {
        sum += i;
      }
    }

    System.out.println("Sum of integers divisible is " + sum + ".");
  }
}
