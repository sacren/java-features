/**
 * Prompt the user for a string and count the number of vowels and digits.
 */
import java.util.Scanner;

public class CountVowelDigit {
  /**
   * Entry point of class.  Ask the user to enter a string.
   */
  public static void main(String[] args) {
    String line;

    Scanner inStream = new Scanner(System.in);

    for (;;) {
      System.out.print("Enter a string: ");
      line = inStream.nextLine();

      if (!line.isEmpty()) {
        break;
      }

      System.out.println("The string is empty. Try again.");
    }

    printout(line);

    inStream.close();
  }

  private static void printout(String s) {
    int size = s.length();
    int vowels = countVowel(s);
    int digits = countDigit(s);

    System.out.printf("Number of vowels: %d (%.2f%%)%n"
                      + "Number of digits: %d (%.2f%%)%n",
                      vowels, (float)vowels * 100 / size, digits, (float)digits * 100 / size);
  }

  private static int countVowel(String s) {
    final int size = s.length();
    final int first = 0;
    int count = 0;
    char vowel;

    s = s.toLowerCase();

    for (int i = first; i < size; i++) {
      vowel = s.charAt(i);

      switch (vowel) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          count++;
          break;
        default:
      }
    }

    return count;
  }

  private static int countDigit(String s) {
    final int size = s.length();
    final int first = 0;
    int count = 0;

    for (int i = first; i < size; i++) {
      if (Character.isDigit(s.charAt(i))) {
        count++;
      }
    }

    return count;
  }
}
