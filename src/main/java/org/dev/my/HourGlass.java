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
    final int height = 11;
    final int width = 7;
    final int heightWidthDiff = height - width;
    final int rowColAlignment = heightWidthDiff / 2;
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

        if (row % height < rowColAlignment + 1
            || row % height > height - (rowColAlignment + 1)) {
          if (col == width) {
            System.out.println('#');
            break;
          }

          if (col == firstCount) {
            System.out.print("# ");
            continue;
          }
        }

        /* height / 2 + 1 for both odd and even numbers. */
        if (height / 2 + 1 == row) {
          crossed = true;
        }

        if (col == row - rowColAlignment) {
          if (crossed) {
            System.out.println('#');
            break;
          }

          System.out.print("# ");
          continue;
        }

        if (col == height - row + 1 - rowColAlignment) {
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
