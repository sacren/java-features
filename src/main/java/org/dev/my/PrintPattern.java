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
    emptySquare();
    System.out.printf("%8s\n\n", "(e)");
    letterZMirror();
    System.out.printf("%9s\n\n", "(f)");
    letterZ();
    System.out.printf("%9s\n\n", "(g)");
    hourGlass();
    System.out.printf("%8s\n\n", "(h)");
    hourGlassInBox();
    System.out.printf("%8s\n\n", "(i)");
  }

  private static void emptySquare() {
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

  private static void letterZMirror() {
    final int size = 8;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == size) {
          System.out.println('#');
          break;
        }

        if (row % size <= 1) {
          System.out.print("# ");
          continue;
        }

        if (col == row) {
          System.out.println('#');
          break;
        }

        System.out.print("  ");
      }
    }
  }

  private static void letterZ() {
    final int size = 8;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == size) {
          System.out.println('#');
          break;
        }

        if (row % size <= 1) {
          System.out.print("# ");
          continue;
        }

        if (col + row - 1 == size) {
          System.out.println('#');
          break;
        }

        System.out.print("  ");
      }
    }
  }

  private static void hourGlass() {
    final int size = 7;
    boolean crossed = false;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (row % size < 2) {
          if (size == col) {
            System.out.println('#');
            break;
          }
          System.out.print("# ");
          continue;
        }

        /* size / 2 + 1 for both odd and even numbers. */
        if (size / 2 + 1 == row) {
          crossed = true;
        }

        if (row == col) {
          if (crossed) {
            System.out.println('#');
            break;
          }

          System.out.print("# ");
          continue;
        }

        if (size - row + 1 == col) {
          if (crossed) {
            System.out.print("# ");
            continue;
          }

          System.out.println('#');
          break;
        }

        System.out.print("  ");
      }
    }
  }

  private static void hourGlassInBox() {
    final int size = 7;

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == 1) {
          System.out.print("# ");
          continue;
        }

        if (col == size) {
          System.out.println('#');
          break;
        }

        if (row % size < 2) {
          System.out.print("# ");
          continue;
        }

        if (row == col) {
          System.out.print("# ");
          continue;
        }

        if (size - row + 1 == col) {
          System.out.print("# ");
          continue;
        }

        System.out.print("  ");
      }
    }
  }
}
