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
      print3Spaces();
      printLine();
      print3Spaces();
      System.out.print(" ");
      printLine();
    }

    print3Spaces();
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

  private static void print3Spaces() {
    for (int i = 0; i < 3; i++) {
      System.out.print(" ");
    }
  }
}
