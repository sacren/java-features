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
    printMultiChar(' ', 3);
    printLine();

    for (int i = 1; i < 4; i++) {
      printMultiChar(' ', 3);

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      System.out.print("*");

      for (int j = 0; j < 9 - (i + 1) * 2; j++) {
        System.out.print(" ");
      }

      System.out.println("*");
    }

    /* Prepend with 3 + 4 = 7 spaces. */
    printMultiChar(' ', 7);
    System.out.println('*');
  }

  private static void printLine() {
    for (int i = 0; i < 4; i++) {
      System.out.print("* ");
    }

    System.out.println("*");
  }

  private static void printMultiChar(char character, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(character);
    }
  }
}
