/**
 * String operations.
 */
public class StringOperations {
  public static void main(String[] args) {
    doStringOperation();
  }

  private static void doStringOperation() {
    String s1 = "Oregon State University";
    String s2 = "oregon state university";
    int length = s1.length();
    int beginning = 0;
    int middle = length / 2;
    int end = length - 1;

    System.out.println(s1 + "\n"
                       + "Number of char = " + length + "\n"
                       + "Beginning char = " + s1.charAt(beginning) + "\n"
                       + "Middle char = " + s1.charAt(middle) + "\n"
                       + "End char = " + s1.charAt(end) + "\n\n"
                       + s2 + "\n"
                       + s1 + " = " + s2 + "? " + s1.equals(s2) + "\n"
                       + s1 + " = " + s2 + "? (case ignored) " + s1.equalsIgnoreCase(s2) + "\n\n"
                       + s2 + " = " + s1 + "? " + s2.equals(s1) + "\n"
                       + s2 + " = " + s1 + "? (case ignored) " + s2.equalsIgnoreCase(s1) + "\n\n"
                       + "Substring of " + s1 + " = " + s1.substring(middle) + "\n"
                       + "Substring of " + s2 + " = " + s2.substring(0, length - middle) + "\n"
                       + "Index (o) of " + s2 + " = " + s2.indexOf('o') + "\n"
                       + "Last index (o) of " + s2 + " = " + s2.lastIndexOf('o') + "\n\n"
                       + "Ends with -ity of " + s2 + " = " + s2.endsWith("ity") + "\n"
                       + "Ends with -aty of " + s2 + " = " + s2.endsWith("aty") + "\n\n"
                       + "Upper case of " + s2 + " = " + s2.toUpperCase() + "\n"
                       + "Lower case of " + s1 + " = " + s1.toLowerCase());
  }
}
