/**
 * Print the square pattern.
 *
 * <p>
 *   * * * * *
 *   *       *
 *   *       *
 *   *       *
 *   * * * * *
 * </p>
 */
public class PrintPattern {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    printSquarePattern();
  }

  private static void printSquarePattern() {
    for (int row = 1; row <= 7; row++) {
      for (int col = 1; col <= 7; col++) {
        if (row % 7 > 1 && col % 7 > 1) {
          System.out.print("  ");
          continue;
        }

        if (col == 7) {
          System.out.println('#');
          continue;
        }

        System.out.print("# ");
      }
    }
  }
}
