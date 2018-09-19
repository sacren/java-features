/**
 * Prompt user for a positive integer and print it in reverse order.
 */
public class ReverseInt {
  public static void main(String[] args) {
    printDigits();
  }

  private static void printDigits() {
    int number = 154023;
    int remainder;
    int quotient;

    for (;;) {
      remainder = number % 10;
      quotient = number / 10;

      if (quotient == 0) {
        System.out.println(remainder);
        break;
      }

      System.out.print(remainder + " ");
      number = quotient;
    }
  }
}
