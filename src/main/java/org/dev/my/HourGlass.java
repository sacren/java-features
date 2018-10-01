/**
 * Print the pattern of hourglass.
 *   # # # # # # #
 *   #           #
 *   #           #
 *     #       #
 *       #   #
 *         #
 *       #   #
 *     #       #
 *   #           #
 *   #           #
 *   # # # # # # #
 */
public class HourGlass {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    makeHourGlass();
  }

  /**
   * Print out hourglass pattern.
   */
  public static void makeHourGlass() {
    final int size = 7;
    final int firstCount = 1;
    boolean crossed = false;

    for (int row = firstCount; row <= size; row++) {
      for (int col = firstCount; col <= size; col++) {
        if (row % size < 2) {
          if (col == size) {
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

        if (col == row) {
          if (crossed) {
            System.out.println('#');
            break;
          }

          System.out.print("# ");
          continue;
        }

        if (col == size - row + 1) {
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
}
