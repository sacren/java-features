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
    String stringOfInt = "";
    int remainder;

    System.out.printf("Original integer is %d%n", number);

    for (;;) {
      remainder = number % 10;
      number /= 10;
      stringOfInt += remainder;

      if (number == 0) {
        break;
      }
    }

    number = Integer.parseInt(stringOfInt);
    System.out.printf("Reversed integer is %d%n", number);
  }
}
