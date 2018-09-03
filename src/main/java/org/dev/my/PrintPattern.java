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
    System.out.println();
    printThreeSpaces();
    printFiveStars();

    for (int i = 0; i < 3; i++) {
      printThreeSpaces();
      printTwoStars();
    }

    printThreeSpaces();
    printFiveStars();
  }

  private static void printFiveStars() {
    for (int i = 0; i < 4; i++) {
      System.out.print("* ");
    }

    System.out.println("*");
  }

  private static void printTwoStars() {
    System.out.print("*");

    for (int i = 0; i < 7; i++) {
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
