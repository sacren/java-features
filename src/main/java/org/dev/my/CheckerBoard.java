/**
 * Print 7 × 7 checker pattern using nested loops.
 * <p>
 * # # # # # # #
 *  # # # # # # #
 * # # # # # # #
 *  # # # # # # #
 * # # # # # # #
 *  # # # # # # #
 * # # # # # # #
 * </p>
 */
public class CheckerBoard {
  public static void main(String[] args) {
    printChecker();
  }

  private static void printChecker() {
    final int size = 7;

    for (int row = 1; row <= size; row++) {
      if (row % 2 == 0) {
        System.out.print(' ');
      }

      for (int col = 1; col < size; col++) {
        System.out.print("# ");
      }

      System.out.println('#');
    }
  }
}
