/**
 * Prompt user for a positive integer and print it in reverse order.
 */
import java.util.Scanner;

public class ReverseInt {
  /**
   * Entry point of ReverseInt class.  It also prompts the user for an integer.
   */
  public static void main(String[] args) {
    Scanner inputStream = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = inputStream.nextInt();
    makeReverse(number);
    inputStream.close();
  }

  /**
   * Reverse the order of integer.
   */
  public static void makeReverse(int number) {
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
