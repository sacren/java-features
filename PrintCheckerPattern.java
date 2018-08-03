/**
 * Print the checker pattern.
 * <p>
 *    * * * * *
 *     * * * * *
 *    * * * * *
 *     * * * * *
 *    * * * * *
 * </p>
 */
public class PrintCheckerPattern {
  /**
   * Entry point.
   */
  public static void main(String[] args) {
    System.out.println();

    for (int i = 0; i < 2; i++) {
      System.out.print("   ");
      printLine();
      System.out.print("    ");
      printLine();
    }

    System.out.print("   ");
    printLine();
  }

  /**
   * Method to print one line of asterisk and space.
   */
  private static void printLine() {
    for (int i = 0; i < 4; i++) {
      System.out.print("* ");
    }

    System.out.println("*");
  }
}
