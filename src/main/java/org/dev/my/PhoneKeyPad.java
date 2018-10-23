/**
 * On the phone keypad, the alphabet is mapped to digits as follows:
 * ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
 * #
 * In simulation, prompt the user for a string (case insensitive) and convert
 * it to a sequence of keypad digits.
 */
import java.util.Scanner;

public class PhoneKeyPad {
  /**
   * Entry point to PhoneKeyPad class. Ask user for a string.
   */
  public static void main(String[] args) {
    String line;

    Scanner inStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter a string of letters: ");
      line = inStream.nextLine();

      if (line.isEmpty()) {
        System.out.println("The string is empty. Try again.");
        continue;
      }

      if (isAllLetter(line)) {
        break;
      }

      System.out.println("You entered an invalid string. Try again.");
    }

    System.out.printf("The user entered: %s%n", makeKeyPad(line));

    inStream.close();
  }

  private static boolean isAllLetter(String s) {
    final int size = s.length();
    final int first = 0;

    for (int i = first; i < size; i++) {
      if (!Character.isLetter(s.charAt(i))) {
        break;
      }

      if (i == size - 1) {
        return true;
      }
    }

    return false;
  }

  private static String makeKeyPad(String s) {
    final int size = s.length();
    final int first = 0;
    String allDigit = new String();
    char c;

    s = s.toLowerCase();

    for (int i = first; i < size; i++) {
      c = s.charAt(i);

      switch (c) {
        case 'a':
        case 'b':
        case 'c':
          allDigit += "2";
          break;
        case 'd':
        case 'e':
        case 'f':
          allDigit += "3";
          break;
        case 'g':
        case 'h':
        case 'i':
          allDigit += "4";
          break;
        case 'j':
        case 'k':
        case 'l':
          allDigit += "5";
          break;
        case 'm':
        case 'n':
        case 'o':
          allDigit += "6";
          break;
        case 'p':
        case 'q':
        case 'r':
        case 's':
          allDigit += "7";
          break;
        case 't':
        case 'u':
        case 'v':
          allDigit += "8";
          break;
        case 'w':
        case 'x':
        case 'y':
        case 'z':
          allDigit += "9";
          break;
        default:
      }
    }

    return allDigit;
  }
}
