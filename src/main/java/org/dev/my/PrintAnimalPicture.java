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
    System.out.print("+");
    printMultiChar('=', 8);
    System.out.println("\\/");
    printMultiChar(' ', 3);
    System.out.print(" ");
    System.out.print("/");
    System.out.print(" ");
    printMultiChar('|', 2);
    System.out.print(" ");
    printMultiChar('%', 3);
    System.out.print(" ");
    printMultiChar('|', 2);
    System.out.println();
    printMultiChar(' ', 3);
    System.out.print("*");
    printMultiChar(' ', 2);
    printMultiChar('|', 2);
    printMultiChar('-', 5);
    printMultiChar('|', 2);
    System.out.println();
    printMultiChar(' ', 3);
    printMultiChar(' ', 3);
    printMultiChar('"', 2);
    printMultiChar(' ', 5);
    printMultiChar('"', 2);
    System.out.println();
  }

  private static void printMultiChar(char c, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(c);
    }
  }
}
