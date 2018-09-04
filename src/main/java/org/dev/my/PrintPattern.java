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
  public static void main(String[] args) {
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
}
