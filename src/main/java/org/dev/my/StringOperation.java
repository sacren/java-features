/**
 * String operations by length(), charAt(), and equals().
 */
public class StringOperation {
  public static void main(String[] args) {
    runString();
  }

  private static void runString() {
    String s1 = "Oregon State University";
    String s2 = "oregon state university";
    final int length = s1.length();
    final int beginning = 0;
    final int middle = length / 2;
    final int end = length - 1;

    System.out.printf("Original string = %s%n"
                       + "Number of char = %d%n"
                       + "Beginning char = %c%n"
                       + "Middle char = %c%n"
                       + "End char = %c%n%n"
                       + "Original string = %s%n"
                       + "%s = %s? %b%n"
                       + "%s = %s? (case ignored) %b%n%n"
                       + "%s = %s? %b%n"
                       + "%s = %s? (case ignored) %b%n%n"
                       + "Substring of %s = %s%n"
                       + "Substring of %s = %s%n"
                       + "Index (o) of %s = %d%n"
                       + "Last index (o) of %s = %d%n%n"
                       + "Ends with -ity of %s = %b%n"
                       + "Ends with -aty of %s = %b%n%n"
                       + "Upper case of %s = %s%n"
                       + "Lower case of %s = %s%n",
                       s1,
                       length,
                       s1.charAt(beginning),
                       s1.charAt(middle),
                       s1.charAt(end),
                       s2,
                       s1, s2, s1.equals(s2),
                       s1, s2, s1.equalsIgnoreCase(s2),
                       s2, s1, s2.equals(s1),
                       s2, s1, s2.equalsIgnoreCase(s1),
                       s1, s1.substring(middle),
                       s2, s2.substring(0, length - middle),
                       s2, s2.indexOf('o'),
                       s2, s2.lastIndexOf('o'),
                       s2, s2.endsWith("ity"),
                       s2, s2.endsWith("aty"),
                       s2, s2.toUpperCase(),
                       s1, s1.toLowerCase());
  }
}
