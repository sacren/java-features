/**
 * Print the triangle pattern.
 *
 * <p>
 *   * * * * *
 *    *     *
 *     *   *
 *      * *
 *       *
 * </p>
 */
public class PrintTrianglePattern {
  public static void main(String[] args) {
    printTrianglePattern();
  }

  private static void printTrianglePattern() {
    System.out.println();
    printThreeSpaces();
    printLine();

    for (int i = 1; i < 4; i++) {
      printThreeSpaces();

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      System.out.print("*");

      for (int j = 0; j < 9 - (i + 1) * 2; j++) {
        System.out.print(" ");
      }

      System.out.println("*");
    }

    printThreeSpaces();
    printMiddleStar();
  }

  private static void printLine() {
    for (int i = 0; i < 4; i++) {
      System.out.print("* ");
    }

    System.out.println("*");
  }

  private static void printMiddleStar() {
    for (int i = 0; i < 4; i++) {
      System.out.print(" ");
    }

    System.out.println("*");
  }

  private static void printThreeSpaces() {
    for (int i = 0; i < 3; i++) {
      System.out.print(" ");
    }
  }
}
