/**
 * Prompt the user for the size (a non-negative integer in int) and print these
 * patterns.
 *           #
 *         # # #
 *       # # # # #
 *     # # # # # # #
 *   # # # # # # # # #
 * # # # # # # # # # # #
 */
import java.util.Scanner;

public class HillPattern {
  /**
   * Entry point to HillPattern class.
   */
  public static void main(String[] args) {
    int size;

    Scanner inputStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter non-negative integer: ");
      size = inputStream.nextInt();

      if (size >= 0) {
        break;
      }

      System.out.println("Invalid number. Try again...");
    }

    makeHill(size);
    System.out.printf("(a)%n%n");
    makeReverseHill(size);
    System.out.printf("(b)%n%n");
    inputStream.close();
  }

  /**
   * Make the hill pattern according to the size given by the user.
   */
  public static void makeHill(int size) {
    final int startCount = 1;
    int width;

    for (int row = startCount; row <= size; row++) {
      width = row * 2 - 1;

      for (int col = startCount; col <= size - row; col++) {
        System.out.print("  ");
      }

      for (int col = startCount; col <= width; col++) {
        if (col == width) {
          System.out.println('#');
          break;
        }

        System.out.print("# ");
      }
    }
  }

  /**
   * Make reverse hill pattern.
   */
  public static void makeReverseHill(int size) {
    final int startCount = 1;
    int width;

    for (int row = startCount; row <= size; row++) {
      width = (size - row) * 2 + startCount;

      for (int col = startCount; col < row; col++) {
        System.out.print("  ");
      }

      for (int col = startCount; col <= width; col++) {
        if (col == width) {
          System.out.println('#');
          break;
        }

        System.out.print("# ");
      }
    }
  }
}
