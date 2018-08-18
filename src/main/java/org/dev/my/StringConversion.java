/**
 * String/Primitive conversion.
 */
public class StringConversion {
  public static void main(String[] args) {
    convertStringToNumber();
  }

  private static void convertStringToNumber() {
    int i = 2018;
    double d = Math.PI;
    boolean b = true;
    char c = '好';
    String s = String.valueOf(i);
    String doubleStr = String.valueOf(d);
    String boolStr = String.valueOf(b);
    String charStr = String.valueOf(c);
    int number = Integer.parseInt(s);
    double pi = Double.parseDouble(doubleStr);
    boolean boolVal = Boolean.parseBoolean(boolStr);
    char perfect = charStr.charAt(0);

    System.out.println(number + "\n"
                       + pi + "\n"
                       + boolVal + "\n"
                       + perfect + "\n\n"
                       + b + "\n"
                       + true + "\n"
                       + boolStr);
  }
}
