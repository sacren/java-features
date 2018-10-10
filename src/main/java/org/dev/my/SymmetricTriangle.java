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

    printTriangle(size);
    inStream.close();
  }

  private static void printTriangle(int size) {
    final int firstCount = 1;

    for (int row = firstCount; row <= size; row++) {
      if (row == firstCount) {
        for (int col = firstCount; col < size; col++) {
          System.out.print("* ");
        }

        System.out.println('*');
        continue;
      }

      for (int col = firstCount; col < row; col++) {
        System.out.print(' ');
      }

      if (row != size) {
        System.out.print('*');
      }

      for (int col = row; col < size * 2 - 1 - row; col++) {
        System.out.print(' ');
      }

      System.out.println('*');
    }
  }
}
