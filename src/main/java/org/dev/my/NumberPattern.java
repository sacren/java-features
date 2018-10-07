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
    System.out.println();
    topRight(size);
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

  /**
   * Print pattern with right angle at top-right corner.
   */
  public static void topRight(int size) {
    final int firstCount = 1;
    int width;

    for (int row = firstCount; row <= size; row++) {
      width = size - row + 1;

      for (int col = firstCount; col < row; col++) {
        System.out.printf("%3c", ' ');
      }

      for (int col = firstCount; col <= width; col++) {
        if (col == width) {
          System.out.printf("%3d%n", col);
          break;
        }

        System.out.printf("%3d", col);
      }
    }
  }
}
