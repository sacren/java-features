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

    System.out.print("Enter a non-negative integer: ");
    number = inputStream.nextInt();
    reverseNumber(number);

    inputStream.close();
  }

  /**
   * Reverse the order of integer.
   */
  public static void reverseNumber(int number) {
    String stringOfInt = "";
    int remainder;

    if (number < 0) {
      System.out.println("You must enter a non-negative integer. Bye!");
      return;
    }

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
