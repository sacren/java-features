/**
 * Print 5 × 5 checker pattern using nested loops.
 * <p>
 * # # # # #
 *  # # # # #
 * # # # # #
 *  # # # # #
 * # # # # #
 * </p>
 */
public class CheckerBoard {
  public static void main(String[] args) {
    printChecker();
  }

  private static void printChecker() {
    final int size = 5;

    for (int row = 1; row <= size; row++) {
      if (row % 2 == 0) {
        System.out.print(' ');
      }

      for (int col = 1; col <= size; col++) {
        if (col == size) {
          System.out.println('#');
          break;
        }
        System.out.print("# ");
      }
    }
  }
}
