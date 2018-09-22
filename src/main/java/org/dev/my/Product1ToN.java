/**
 * Compute the product of integers from 1 to 10, 1 to 11, 1 to 12, 1 to 13 and
 * 1 to 14.
 */
public class Product1ToN {
  /**
   * Entry point to Product1ToN class.
   */
  public static void main(String[] args) {
    computeProduct(10);
    computeProduct(11);
    computeProduct(12);
    computeProduct(13);
    computeProduct(14);
  }

  /**
   * Calculate the product from 1 to 10, 11, etc.
   */
  public static void computeProduct(int number) {
    final int upperBound = number;
    final int lowerBound = 2;
    /* Use long type to not go over bounds. */
    long product = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      product *= i;
    }

    System.out.printf("Product from 1 to %d is %d%n", number, product);
  }
}
