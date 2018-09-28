/**
 * Prompt user for a positive integer and print it in reverse order.
 */
import java.util.Scanner;

public class ReverseInt {
  /**
   * Entry point of ReverseInt class.  It also prompts the user for an integer.
   */
  public static void main(String[] args) {
    int number;

    Scanner inputStream = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    number = inputStream.nextInt();
    System.out.printf("Reversed integer is %d%n", reverseNumber(number));

    inputStream.close();
  }

  /**
   * Reverse the order of integer.
   */
  public static int reverseNumber(int number) {
    int remainder;
    int reversed = 0;

    for (;;) {
      remainder = number % 10;
      number /= 10;
      reversed *= 10;
      reversed += remainder;

      if (number == 0) {
        break;
      }
    }

    return reversed;
  }
}
