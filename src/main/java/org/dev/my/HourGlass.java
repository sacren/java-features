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
    final int height = 7;
    final int width = 7;
    final int firstCount = 1;
    boolean crossed = false;

    for (int row = firstCount; row <= height; row++) {
      for (int col = firstCount; col <= width; col++) {
        if (row % height < 2) {
          if (col == width) {
            System.out.println('#');
            break;
          }

          System.out.print("# ");
          continue;
        }

        /* height / 2 + 1 for both odd and even numbers. */
        if (height / 2 + 1 == row) {
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

        if (col == height - row + 1) {
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
