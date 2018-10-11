/**
 * Arithmetic operation of type char.
 */
public class CharArithmetic {
  public static void main(String[] args) {
    runChar();
  }

  /**
   * The type char in action.
   */
  public static void runChar() {
    final char c1 = '0';
    final char c2 = 'A';
    char c3;

    c3 = 97;

    System.out.println("Display character unformatted:");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println();
    System.out.println((int)c1);
    System.out.println((int)c2);
    System.out.println();

    System.out.printf("Display character formatted:%n"
                      + "%c%n"    /* Display '0' by char */
                      + "%c%n"    /* Display 'A' by char */
                      + "%c%n"    /* Display 'A' by literal char */
                      + "%c%n"    /* Display 'a' by char */
                      + "%c%n"    /* Display 'a' by casting char to int */
                      + "%c%n%n"  /* Display 'a' by literal int */
                      + "Now with cast:%n"
                      + "%d%n"    /* Display integer casting from char */
                      + "%d%n",   /* Display integer casting from char */
                      c1, c2, 'A', c3, (int)c3, 97, (int)c1, (int)c2);
  }
}
