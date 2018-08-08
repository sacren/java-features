/**
 * Product of all the numbers from 1 to 10.
 * Answer: 3628800
 */
public class RunningNumberProduct {
  public static void main(String[] args) {
    productNumbers();
  }

  private static void productNumbers() {
    int upperBound = 10;
    int lowerBound = 1;
    int product = lowerBound;

    for (int i = lowerBound + 1; i <= upperBound; i++) {
      product *= i;
    }

    System.out.println("Product of all the numbers is " + product + ".");
  }
}
