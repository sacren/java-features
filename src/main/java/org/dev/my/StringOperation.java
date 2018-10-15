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

    final String output = String.format("Original string = %s%n"
                                        + "Number of char = %d%n"
                                        + "Beginning char = %c%n"
                                        + "Middle char = %c%n"
                                        + "End char = %c%n%n"
                                        + "Original string = %s%n"
                                        + "%1$s = %6$s? %7$b%n"
                                        + "%1$s = %6$s? (case ignored) %8$b%n%n"
                                        + "%6$s = %1$s? %9$b%n"
                                        + "%6$s = %1$s? (case ignored) %10$b%n%n"
                                        + "Substring of %1$s = %11$s%n"
                                        + "Substring of %6$s = %12$s%n"
                                        + "Index (o) of %6$s = %13$d%n"
                                        + "Last index (o) of %6$s = %14$d%n%n"
                                        + "Ends with -ity of %6$s = %15$b%n"
                                        + "Ends with -aty of %6$s = %16$b%n%n"
                                        + "Upper case of %6$s = %17$s%n"
                                        + "Lower case of %1$s = %18$s%n",
                                        s1,
                                        length,
                                        s1.charAt(beginning),
                                        s1.charAt(middle),
                                        s1.charAt(end),
                                        s2,
                                        s1.equals(s2),
                                        s1.equalsIgnoreCase(s2),
                                        s2.equals(s1),
                                        s2.equalsIgnoreCase(s1),
                                        s1.substring(middle),
                                        s2.substring(0, length - middle),
                                        s2.indexOf('o'),
                                        s2.lastIndexOf('o'),
                                        s2.endsWith("ity"),
                                        s2.endsWith("aty"),
                                        s2.toUpperCase(),
                                        s1.toLowerCase());

    System.out.printf(output);
  }
}
