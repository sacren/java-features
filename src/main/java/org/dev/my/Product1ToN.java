/**
 * Compute the product of integers from 1 to 10, 1 to 11, 1 to 12, 1 to 13 and
 * 1 to 14.
 */
public class Product1ToN {
  public static void main(String[] args) {
    product1To10();
    product1To11();
    product1To12();
    product1To13();
    product1To14();
  }

  private static void product1To10() {
    int upperBound = 10;
    int lowerBound = 1;
    int product = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      product *= i;
    }

    System.out.println("Product from 1 to 10 is " + product);
  }

  private static void product1To11() {
    int upperBound = 11;
    int lowerBound = 1;
    int product = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      product *= i;
    }

    System.out.println("Product from 1 to 11 is " + product);
  }

  private static void product1To12() {
    int upperBound = 12;
    int lowerBound = 1;
    int product = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      product *= i;
    }

    System.out.println("Product from 1 to 12 is " + product);
  }

  private static void product1To13() {
    int upperBound = 13;
    int lowerBound = 1;
    long product = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      product *= i;
    }

    System.out.println("Product from 1 to 13 is " + product);
  }

  private static void product1To14() {
    int upperBound = 14;
    int lowerBound = 1;
    long product = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      product *= i;
    }

    System.out.println("Product from 1 to 14 is " + product);
  }
}
