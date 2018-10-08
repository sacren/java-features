/**
 * Prompt the user for the size (a non-negative integer in int) and print these
 * patterns.
 *           #
 *         # # #
 *       # # # # #
 *     # # # # # # #
 *   # # # # # # # # #
 * # # # # # # # # # # #
 *          (a)
 *
 * # # # # # # # # # # #
 *   # # # # # # # # #
 *     # # # # # # #
 *       # # # # #
 *         # # #
 *           #
 *          (b)
 *
 *           #
 *         # # #
 *       # # # # #
 *     # # # # # # #
 *   # # # # # # # # #
 * # # # # # # # # # # #
 *   # # # # # # # # #
 *     # # # # # # #
 *       # # # # #
 *         # # #
 *           #
 *          (c)
 *
 * # # # # # # # # # # #
 * # # # # #   # # # # #
 * # # # #       # # # #
 * # # #           # # #
 * # #               # #
 * #                   #
 * # #               # #
 * # # #           # # #
 * # # # #       # # # #
 * # # # # #   # # # # #
 * # # # # # # # # # # #
 *          (d)
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

    System.out.println();
    makeHill(size);
    centerId(size, 'a');
    System.out.println();
    makeReverseHill(size);
    centerId(size, 'b');
    System.out.println();
    mirrorHill(size);
    centerId(size, 'c');
    System.out.println();
    diamondInSquare(size);
    centerId(size, 'd');
    inputStream.close();
  }

  /**
   * Put ID in alignment with the pattern.
   */
  public static void centerId(int size, char id) {
    for (int col = 1; col < size; col++) {
      if (col == size - 1) {
        System.out.printf("%c(%c)%n", ' ', id);
        break;
      }

      System.out.print("  ");
    }
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
      width = (size - row) * 2 + 1;

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

  /**
   * Mirror the hill pattern.
   */
  public static void mirrorHill(int size) {
    final int startCount = 1;
    final int top = size;
    final int bottom = size - 1;
    int width;

    /* Hill pattern on the top. */
    for (int row = startCount; row <= top; row++) {
      width = row * 2 - 1;

      for (int col = startCount; col <= top - row; col++) {
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

    /* Reverse hill pattern on the bottom. */
    for (int row = startCount; row <= bottom; row++) {
      width = (bottom - row) * 2 + 1;
      /* Offset for the pattern. */
      System.out.print("  ");

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

  /**
   * Empty diamond inside a square.
   */
  public static void diamondInSquare(int size) {
    final int firstCount = 1;
    int sideTriangle;
    int midTriangle;

    for (int row = firstCount; row <= size; row++) {
      sideTriangle = size - row + 1;
      midTriangle = (row - 1) * 2 - 1;

      for (int col = firstCount; col <= sideTriangle; col++) {
        System.out.print("# ");
      }

      for (int col = firstCount; col <= midTriangle; col++) {
        System.out.print("  ");
      }

      for (int col = firstCount; col <= sideTriangle; col++) {
        if (row == firstCount && col == firstCount) {
          continue;
        }

        if (col == sideTriangle) {
          System.out.println('#');
          break;
        }

        System.out.print("# ");
      }
    }

    for (int row = firstCount + 1; row <= size; row++) {
      for (int col = firstCount; col <= row; col++) {
        System.out.print("# ");
      }

      for (int col = firstCount; col <= (size - row) * 2 - 1; col++) {
        System.out.print("  ");
      }

      for (int col = firstCount; col <= row; col++) {
        if (row == size && col == firstCount) {
          continue;
        }

        if (col == row) {
          System.out.println('#');
          break;
        }

        System.out.print("# ");
      }
    }
  }
}
