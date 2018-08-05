/**
 * Multiply six integers and print the product.
 */
public class SixNumberProduct {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    printProduct();
  }

  private static void printProduct() {
    int number1 = 11;
    int number2 = 22;
    int number3 = 33;
    int number4 = 44;
    int number5 = 55;
    int number6 = 66;
    int product;

    product = number1 * number2 * number3 * number4 * number5;
    product *= number6;

    System.out.println("The product is " + product + ".");
  }
}
