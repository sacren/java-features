/**
 * Prompt the user for the score of 3 students; compute the average in double; and print the result
 * rounded to 2 decimal places.
 */
import java.util.Scanner;

public class TestInputValidation {
    /** Entry point to InputValidation class. */
    public static void main(String[] args) {
        final int studentCount = 3;
        double average;
        int sum = 0;
        int score;

        Scanner inputStream = new Scanner(System.in);

        for (int i = 1; i <= studentCount; i++) {
            System.out.printf("Enter the score of Student %d: ", i);
            score = inputStream.nextInt();
            if (!isValid(score)) {
                throw new IllegalArgumentException(
                        String.format("%d is invalid.%n", score));
            }
            sum += score;
        }

        average = (double) sum / studentCount;
        System.out.printf("The average score is %.2f%n", average);
        inputStream.close();
    }

    /* Check whether the student score is within the range. */
    private static boolean isValid(final int score) {
        if (score >= 0 && score <= 100) {
            return true;
        }

        return false;
    }
}
