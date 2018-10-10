/**
 * Print symmetric triangles.
 *
 *   * * * * *
 *    *     *
 *     *   *
 *      * *
 *       *
 *      (a)
 *
 *       *
 *      * *
 *     *   *
 *    *     *
 *   * * * * *
 *      (b)
 */
import java.util.Scanner;

public class SymmetricTriangle {
  /**
   * Get size of the triangle from the user.
   */
  public static void main(String[] args) {
    int size;

    Scanner inStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter positive odd number: ");
      size = inStream.nextInt();

      if (size > 0 && size % 2 == 1) {
        break;
      }

      System.out.println("You have entered an invalid number. Try again.");
    }

    printTrianglePattern();
    inStream.close();
  }

  private static void printTrianglePattern() {
    System.out.println();
    printMultiChar(' ', 3);
    printLine();

    for (int i = 1; i < 4; i++) {
      printMultiChar(' ', 3 + i);
      System.out.print('*');
      printMultiChar(' ', 9 - (i + 1) * 2);
      System.out.println('*');
    }

    /* Prepend with 3 + 4 = 7 spaces. */
    printMultiChar(' ', 7);
    System.out.println('*');
  }

  private static void printLine() {
    for (int i = 0; i < 4; i++) {
      System.out.print("* ");
    }

    System.out.println('*');
  }

  private static void printMultiChar(char character, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(character);
    }
  }
}
