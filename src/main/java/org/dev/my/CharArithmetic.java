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
    char c4;
    int n1;
    int n2;

    c3 = 98;              /* Remain char */
    c4 = (char)(c3 - 1);  /* Promote to int for calculation */
    c3 -= 44;             /* Compound operation of char */
    n1 = c3 - '0';        /* Convert '0'..'9' to 0..9 */
    n2 = c4 - c1;         /* Same as above */
    c3 += 44;             /* Compound operation of char */

    for (char c = 'a'; c < 'd'; c++) {
      System.out.println(c);
    }

    for (char c = 'Z'; c > 'W'; c--) {
      System.out.println(c);
    }

    System.out.println();
    System.out.println("Display character unformatted:");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println();
    System.out.println("Display numbers from characters:");
    System.out.println((int)c1);
    System.out.println((int)c2);
    System.out.println(n1);
    System.out.println(n2);
    System.out.println();

    System.out.printf("Display character formatted:%n"
                      + "%c%n"    /* Display '0' by char */
                      + "%c%n"    /* Display 'A' by char */
                      + "%c%n"    /* Display 'A' by literal char */
                      + "%c%n"    /* Display 'b' by char */
                      + "%c%n"    /* Display 'b' by casting char to int */
                      + "%c%n"    /* Display 'c' by literal int */
                      + "%c%n%n"  /* Display 'a' by int operation */
                      + "Now with cast:%n"
                      + "%d%n"    /* Display integer casting from char */
                      + "%d%n",   /* Display integer casting from char */
                      c1, c2, 'A', c3, (int)c3, 99, c4, (int)c1, (int)c2);
  }
}
