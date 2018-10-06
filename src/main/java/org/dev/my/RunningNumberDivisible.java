/**
 * Sum all the integers between 1 and 1000, that are divisible by 13, 15 or 17,
 * but not by 30.
 */
public class RunningNumberDivisible {
  /**
   * Entry point to execute a list of methods.
   */
  public static void main(String[] args) {
    sumDivisible();
    sumDivisibleBy7();
    sumOddNumbers();
    productOfIntegers();
    sumOfSquares();
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

  /**
   * The sum of odd integers.
   */
  public static void sumOddNumbers() {
    final int upperBound = 1000;
    final int lowerBound = 1;
    int sum = 0;
    int firstOddNumber;

    if (lowerBound % 2 == 1) {
      firstOddNumber = lowerBound;
    } else {
      firstOddNumber = lowerBound + 1;
    }

    for (int oddNumber = firstOddNumber; oddNumber <= upperBound; oddNumber += 2) {
      sum += oddNumber;
    }

    System.out.printf("Between %d and %d, the sum of all odd numbers is %d%n",
                      lowerBound, upperBound, sum);
  }

  /**
   * The product of a series of integers.
   */
  private static void productOfIntegers() {
    final int upperBound = 10;
    final int lowerBound = 1;
    int product = lowerBound;

    for (int number = lowerBound + 1; number <= upperBound; number++) {
      product *= number;
    }

    System.out.printf("Between %d and %d, the product of integer series is %d%n",
                      lowerBound, upperBound, product);
  }

  /**
   * The sum of squares.
   */
  public static void sumOfSquares() {
    final int upperBound = 100;
    final int lowerBound = 1;
    int sum = 0;

    for (int number = lowerBound; number <= upperBound; number++) {
      sum += number * number;
    }

    System.out.printf("Between %d and %d, the sum of all the squares is %d%n",
                      lowerBound, upperBound, sum);
  }
}
