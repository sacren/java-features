/**
 * Prompt the user for a hexadecimal string and convert it to decimal.
 */
import java.util.Scanner;

public class HexString {
  /**
   * Ask the user for a string and check if it is hex.
   */
  public static void main(String[] args) {
    String line;

    Scanner inStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter a hex string: ");
      line = inStream.nextLine();

      if (line.isEmpty()) {
        System.out.println("The hex string is empty");
        continue;
      }

      break;
    }

    if (isHex(line)) {
      System.out.printf("%s is a hex string%n"
                        + "%1$s in decimal is %d%n",
                        line, convertToDecimal(line));
    } else {
      System.out.printf("%s is not a hex string%n", line);
    }

    inStream.close();
  }

  private static boolean isHex(String s) {
    final int size = s.length();
    final int first = 0;
    int digit;
    char c;

    for (int i = first; i < size; i++) {
      c = s.charAt(i);
      digit = Character.digit(c, 10);

      if (digit >= 0 && digit <= 9
          || Character.compare(c, 'a') >= 0 && Character.compare(c, 'f') <= 0
          || Character.compare(c, 'A') >= 0 && Character.compare(c, 'F') <= 0) {
        if (i == size - 1) {
          return true;
        }

        continue;
      }

      break;
    }

    return false;
  }

  private static int convertToDecimal(String s) {
    final int size = s.length();
    final int first = 0;
    int decimal = 0;
    int digit;
    int exponent;
    char c;
    int bitAtLowerA;
    int bitAtLowerF;
    int bitAtUpperA;
    int bitAtUpperF;

    for (int i = first; i < size; i++) {
      c = s.charAt(i);
      exponent = size - i - 1;
      digit = Character.digit(c, 10);
      bitAtLowerA = Character.compare(c, 'a');
      bitAtLowerF = Character.compare(c, 'f');
      bitAtUpperA = Character.compare(c, 'A');
      bitAtUpperF = Character.compare(c, 'F');

      for (;;) {
        if (digit >= 0 && digit <= 9) {
          break;
        }

        if (bitAtLowerA >= 0 && bitAtLowerF <= 0) {
          digit = bitAtLowerA + 10;
          break;
        }

        if (bitAtUpperA >= 0 && bitAtUpperF <= 0) {
          digit = bitAtUpperA + 10;
          break;
        }
      }

      decimal += (int)Math.pow(16, exponent) * digit;
    }

    return decimal;
  }
}
