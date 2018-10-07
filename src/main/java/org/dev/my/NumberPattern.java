/**
 * Prompt the user for the size (a non-negative integer in int) and print the
 * pattern.
 */
import java.util.Scanner;

public class NumberPattern {
  /**
   * Ask the user for the size and print the pattern.
   */
  public static void main(String[] args) {
    int size;

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter the size of number pattern: ");
      size = inputStream.nextInt();

      if (size >= 0) {
        break;
      }

      System.out.println("You entered an invalid size. Try again...");
    }

    bottomLeft(size);
    inputStream.close();
  }

  /**
   * Print patter with bottom-left right angle.
   */
  public static void bottomLeft(int size) {
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= row; col++) {
        if (col == row) {
          System.out.printf("%3d%n", col);
          break;
        }

        System.out.printf("%3d", col);
      }
    }
  }
}
