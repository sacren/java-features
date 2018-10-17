/**
 * Prompt the user for a string and check if it is a binary string consisting
 * of 1's and 0's only.
 */
import java.util.Scanner;

public class BinaryString {
  /**
   * Ask the user for a string and check if it is binary.
   */
  public static void main(String[] args) {
    String line;

    Scanner inStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter a binary string: ");
      line = inStream.nextLine();

      if (line.isEmpty()) {
        System.out.println("The binary string is empty");
        continue;
      }

      break;
    }

    System.out.printf("%s is %sa binary string%n", line, isBinary(line) ? "" : "not ");

    inStream.close();
  }

  private static boolean isBinary(String s) {
    final int size = s.length();
    final int first = 0;
    char c;

    for (int i = first; i < size; i++) {
      c = s.charAt(i);

      if (Character.valueOf(c).equals(Character.valueOf('0'))
          || Character.valueOf(c).equals(Character.valueOf('1'))) {
        if (i == size - 1) {
          return true;
        }

        continue;
      }

      break;
    }

    return false;
  }
}
