/**
 * Print miscellaneous patterns using nested loop.
 * <p>
 *   #
 *   # #
 *   # # #
 *   # # # #
 *   # # # # #
 *   # # # # # #
 *   # # # # # # #
 *   # # # # # # # #
 *         (a)
 *
 *   # # # # # # # #
 *   # # # # # # #
 *   # # # # # #
 *   # # # # #
 *   # # # #
 *   # # #
 *   # #
 *   #
 *         (b)
 *
 *   # # # # # # # #
 *     # # # # # # #
 *       # # # # # #
 *         # # # # #
 *           # # # #
 *             # # #
 *               # #
 *                 #
 *         (c)
 *
 *                 #
 *               # #
 *             # # #
 *           # # # #
 *         # # # # #
 *       # # # # # #
 *     # # # # # # #
 *   # # # # # # # #
 *         (d)
 *
 *   # # # # # # #
 *   #           #
 *   #           #
 *   #           #
 *   #           #
 *   #           #
 *   # # # # # # #
 *        (e)
 *
 *   # # # # # # #
 *     #
 *       #
 *         #
 *           #
 *             #
 *   # # # # # # #
 *        (f)
 *
 *   # # # # # # #
 *             #
 *           #
 *         #
 *       #
 *     #
 *   # # # # # # #
 *        (g)
 *
 *   # # # # # # #
 *     #       #
 *       #   #
 *         #
 *       #   #
 *     #       #
 *   # # # # # # #
 *        (h)
 *
 *   # # # # # # #
 *   # #       # #
 *   #   #   #   #
 *   #     #     #
 *   #   #   #   #
 *   # #       # #
 *   # # # # # # #
 *        (i)
 *
 *          # # # # # # # #
 *         # # # # # # # #
 *        # # # # # # # #
 *       # # # # # # # #
 *      # # # # # # # #
 *     # # # # # # # #
 *    # # # # # # # #
 *   # # # # # # # #
 *         (j)
 * </p>
 */
public class PrintPattern {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    triangleBottomLeft();
    System.out.printf("%9s%n%n", "(a)");
    triangleTopLeft();
    System.out.printf("%9s%n%n", "(b)");
    triangleTopRight();
    System.out.printf("%9s%n%n", "(c)");
    triangleBottomRight();
    System.out.printf("%9s%n%n", "(d)");
    emptySquare();
    System.out.printf("%8s%n%n", "(e)");
    letterZMirror();
    System.out.printf("%8s%n%n", "(f)");
    letterZ();
    System.out.printf("%8s%n%n", "(g)");
    hourGlass();
    System.out.printf("%8s%n%n", "(h)");
    hourGlassInBox();
    System.out.printf("%8s%n%n", "(i)");
    parallelogram();
    System.out.printf("%9s%n%n", "(j)");
  }

  private static void emptySquare() {
    final int size = 7;
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int size = 7;
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int size = 7;
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int firstCount = 1;
    boolean crossed = false;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
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
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
        if (col == firstCount) {
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

  private static void parallelogram() {
    final int size = 8;
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
        if (size == col) {
          System.out.println('#');
          break;
        }

        if (col == firstCount) {
          for (int prepend = row; prepend < size; prepend++) {
            System.out.print(' ');
          }
        }

        System.out.print("# ");
      }
    }
  }
}
