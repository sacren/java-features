/**
 * Sum all the integers between 1 and 1000, that are divisible by 13, 15 or 17,
 * but not by 30.
 */
public class RunningNumberDivisible {
  public static void main(String[] args) {
    sumDivisible();
    sumDivisibleBy7();
  }

  /**
   * The sum of all divisible by 13, 15 or 17 but not by 30.
   */
  public static void sumDivisible() {
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

    System.out.printf("Between 1 and 1000, the sum of integers divisible by 13, 15, or 17 "
                       + "but not by 30 is %d%n", sum);
  }

  /**
   * Between 1 and 1000, the sum of integers divisible by 7.
   */
  public static void sumDivisibleBy7() {
    final int upperBound = 1000;
    final int lowerBound = 1;
    int sum = 0;

    for (int i = lowerBound + 6; i <= upperBound; i += 7) {
      sum += i;
    }

    System.out.printf("Between 1 and 1000, the sum of integers divisible by 7 is %d%n", sum);
  }
}
