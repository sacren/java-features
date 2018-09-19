/**
 * Prompt user for a positive integer and print it in reverse order.
 */
public class ReverseInt {
  public static void main(String[] args) {
    makeReverse();
  }

  /**
   * Reverse the order of integer.
   */
  public static void makeReverse() {
    int number = 154023;
    int remainder;
    int quotient;

    System.out.printf("Original integer is %d%n"
                      + "Reversed integer is ", number);

    for (;;) {
      remainder = number % 10;
      quotient = number / 10;

      if (quotient == 0) {
        System.out.println(remainder);
        break;
      }

      number = quotient;
      System.out.print(remainder);
    }
  }
}
