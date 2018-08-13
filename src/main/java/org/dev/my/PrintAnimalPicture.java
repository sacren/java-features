/**
 * Print an animal picture.
 *
 * <p>
 *              '__'
 *              (oo)
 *      +========\/
 *     / || %%% ||
 *    *  ||-----||
 *       ""     ""
 * </p>
 */
public class PrintAnimalPicture {
  public static void main(String[] args) {
    printAnimal();
  }

  private static void printAnimal() {
    System.out.println();
    printTriple(" ");
    printTenSpaces();
    System.out.print("'");
    printDouble("_");
    System.out.println("'");
    printTriple(" ");
    printTenSpaces();
    System.out.print("(");
    printDouble("o");
    System.out.println(")");
    printTriple(" ");
    printDouble(" ");
    System.out.print("+");
    printEightEqualSigns();
    System.out.println("\\/");
    printTriple(" ");
    System.out.print(" ");
    System.out.print("/");
    System.out.print(" ");
    printDouble("|");
    System.out.print(" ");
    printTriple("%");
    System.out.print(" ");
    printDouble("|");
    System.out.println();
    printTriple(" ");
    System.out.print("*");
    printDouble(" ");
    printDouble("|");
    printDouble("-");
    printTriple("-");
    printDouble("|");
    System.out.println();
    printTriple(" ");
    printTriple(" ");
    printDouble("\"");
    printDouble(" ");
    printTriple(" ");
    printDouble("\"");
    System.out.println();
  }

  private static void printTenSpaces() {
    for (int i = 0; i < 5; i++) {
      printDouble(" ");
    }
  }

  private static void printEightEqualSigns() {
    for (int i = 0; i < 4; i++) {
      printDouble("=");
    }
  }

  private static void printTriple(String s) {
    for (int i = 0; i < 3; i++) {
      System.out.print(s);
    }
  }

  private static void printDouble(String s) {
    for (int i = 0; i < 2; i++) {
      System.out.print(s);
    }
  }
}
