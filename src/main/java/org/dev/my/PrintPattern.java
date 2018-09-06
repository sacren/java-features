/**
 * Print miscellaneous patterns using nested loop.
 * <p>
 *   # # # # # # #
 *   #           #
 *   #           #
 *   #           #
 *   #           #
 *   #           #
 *   # # # # # # #
 * </p>
 */
public class PrintPattern {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    triangleBottomLeft();
    System.out.printf("%9s\n\n", "(a)");
    triangleTopLeft();
    System.out.printf("%9s\n\n", "(b)");
    triangleTopRight();
    System.out.printf("%9s\n\n", "(c)");
    triangleBottomRight();
    System.out.printf("%9s\n\n", "(d)");
    printSquarePattern();
  }

  private static void printSquarePattern() {
    final int size = 7;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (row % size > 1 && col % size > 1) {
          System.out.print("  ");
          continue;
        }

        if (col == size) {
          System.out.println('#');
          continue;
        }

        System.out.print("# ");
      }
    }
  }

  private static void triangleBottomLeft() {
    final int size = 8;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == row) {
          System.out.println("#");
          break;
        }
        System.out.print("# ");
      }
    }
  }

  private static void triangleTopLeft() {
    final int size = 8;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col + row > size) {
          System.out.println("#");
          break;
        }
        System.out.print("# ");
      }
    }
  }

  private static void triangleTopRight() {
    final int size = 8;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == size) {
          System.out.println("#");
          break;
        }

        if (row > col) {
          System.out.print("  ");
          continue;
        }

        System.out.print("# ");
      }
    }
  }

  private static void triangleBottomRight() {
    final int size = 8;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == size) {
          System.out.println("#");
          break;
        }

        if (col + row <= size) {
          System.out.print("  ");
          continue;
        }

        System.out.print("# ");
      }
    }
  }
}
