/**
 * String/Primitive conversion.
 */
public class StringConversion {
  public static void main(String[] args) {
    convertStringToNumber();
  }

  private static void convertStringToNumber() {
    int i = 2018;
    String s = String.valueOf(i);
    int number = Integer.parseInt(s);
    boolean honest = true;
    String boolStr = String.valueOf(honest);
    boolean integrity = Boolean.parseBoolean(boolStr);

    System.out.println(number + "\n"
                       + honest + "\n"
                       + true + "\n"
                       + boolStr + "\n"
                       + integrity);
  }
}
