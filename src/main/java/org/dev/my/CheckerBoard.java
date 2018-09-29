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
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      if (row % 2 == 0) {
        System.out.print(' ');
      }

      for (int col = firstCount; col < size; col++) {
        System.out.print("# ");
      }

      System.out.println('#');
    }
  }
}
