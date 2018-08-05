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
    printThreeSpaces();
    printTenSpaces();
    System.out.print("'");
    printDouble("_");
    System.out.println("'");
    printThreeSpaces();
    printTenSpaces();
    System.out.print("(");
    printDouble("o");
    System.out.println(")");
    printThreeSpaces();
    printDouble(" ");
    System.out.print("/");
    printEightEqualSigns();
    printDouble("/");
    System.out.println();
    printThreeSpaces();
    System.out.print(" ");
    System.out.print("/");
    System.out.print(" ");
    printDouble("|");
    System.out.print(" ");
    printDouble("X");
    System.out.print(" ");
    printDouble("|");
    System.out.println();
    printThreeSpaces();
    System.out.print("*");
    printDouble(" ");
    printDouble("|");
    printDouble("-");
    printDouble("-");
    printDouble("|");
    System.out.println();
    printThreeSpaces();
    printThreeSpaces();
    printDouble("V");
    printDouble(" ");
    printDouble(" ");
    printDouble("V");
    System.out.println();
    printThreeSpaces();
    printThreeSpaces();
    printDouble("'");
    printDouble(" ");
    printDouble(" ");
    printDouble("'");
    System.out.println();
  }

  private static void printTenSpaces() {
    for (int i = 0; i < 5; i++) {
      printDouble(" ");
    }
  }

  private static void printThreeSpaces() {
    for (int i = 0; i < 3; i++) {
      System.out.print(" ");
    }
  }

  private static void printEightEqualSigns() {
    for (int i = 0; i < 4; i++) {
      printDouble("=");
    }
  }

  private static void printDouble(String s) {
    for (int i = 0; i < 2; i++) {
      System.out.print(s);
    }
  }
}
