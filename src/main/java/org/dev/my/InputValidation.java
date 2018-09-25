/**
 * Prompt the user for the score of 3 students; compute the average in double;
 * and print the result rounded to 2 decimal places.
 */
import java.util.Scanner;

public class InputValidation {
  /**
   * Entry point to InputValidation class.
   */
  public static void main(String[] args) {
    final int studentCount = 3;
    double average;
    int sum = 0;
    int score;

    Scanner inputStream = new Scanner(System.in);

    for (int i = 1; i <= studentCount; i++) {
      for (;;) {
        System.out.printf("Enter the score of Student %d: ", i);
        score = inputStream.nextInt();

        if (isValid(score)) {
          sum += score;
          break;
        }

        System.out.println("The score is invalid. Please try again...");
      }
    }

    average = (double)sum / studentCount;
    System.out.printf("The average score is %.2f%n", average);
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
