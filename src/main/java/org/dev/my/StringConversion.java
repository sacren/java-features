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

    System.out.println(number);
  }
}
