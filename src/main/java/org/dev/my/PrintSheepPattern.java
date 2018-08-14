/**
 * Print the sheep pattern.
 *
 * <p>
 *              '__'
 *              (oo)
 *      /========//
 *     / || XX ||
 *    *  ||----||
 *       VV    VV
 *       ''    ''
 * </p>
 */
public class PrintSheepPattern {
  public static void main(String[] args) {
    printSheepPattern();
  }

  private static void printSheepPattern() {
    System.out.println();
    printMultiChar(' ', 3);
    printMultiChar(' ', 10);
    System.out.print("'");
    printMultiChar('_', 2);
    System.out.println("'");
    printMultiChar(' ', 3);
    printMultiChar(' ', 10);
    System.out.print("(");
    printMultiChar('o', 2);
    System.out.println(")");
    printMultiChar(' ', 3);
    printMultiChar(' ', 2);
    System.out.print("/");
    printMultiChar('=', 8);
    printMultiChar('/', 2);
    System.out.println();
    printMultiChar(' ', 3);
    System.out.print(" ");
    System.out.print("/");
    System.out.print(" ");
    printMultiChar('|', 2);
    System.out.print(" ");
    printMultiChar('X', 2);
    System.out.print(" ");
    printMultiChar('|', 2);
    System.out.println();
    printMultiChar(' ', 3);
    System.out.print("*");
    printMultiChar(' ', 2);
    printMultiChar('|', 2);
    printMultiChar('-', 4);
    printMultiChar('|', 2);
    System.out.println();
    printMultiChar(' ', 3);
    printMultiChar(' ', 3);
    printMultiChar('V', 2);
    printMultiChar(' ', 4);
    printMultiChar('V', 2);
    System.out.println();
    printMultiChar(' ', 3);
    printMultiChar(' ', 3);
    printMultiChar('\'', 2);
    printMultiChar(' ', 4);
    printMultiChar('\'', 2);
    System.out.println();
  }

  private static void printMultiChar(char c, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(c);
    }
  }
}
