/**
 * Prompt the user for an integer between 0 and 10 or between 90 and 100 and
 * repeat until the user enters a valid number.
 */
import java.util.Scanner;

public class InputValidation {
  /**
   * Entry point to InputValidation class.
   */
  public static void main(String[] args) {
    int number;

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter an integer between 0 and 10 or between 90 and 100: ");
      number = inputStream.nextInt();

      if (isValid(number)) {
        break;
      }

      System.out.println("You have entered an invalid number. Please try again...");
    }

    System.out.printf("You have entered a valid number %d%n", number);
    inputStream.close();
  }

  /**
   * Check whether the input falls within the ranges.
   */
  public static boolean isValid(int number) {
    if (number >= 0 && number <= 10) {
      return true;
    }

    if (number >= 90 && number <= 100) {
      return true;
    }

    return false;
  }
}
