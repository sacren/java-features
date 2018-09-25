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
    int score;

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter the student score between 0 and 100: ");
      score = inputStream.nextInt();

      if (isValid(score)) {
        break;
      }

      System.out.println("The score is invalid. Please try again...");
    }

    System.out.printf("The valid score entered is %d%n", score);
    inputStream.close();
  }

  /**
   * Check whether the student score is valid.
   */
  public static boolean isValid(int score) {
    if (score >= 0 && score <= 100) {
      return true;
    }

    return false;
  }
}
