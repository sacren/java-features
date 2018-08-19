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
    float f = (float)Math.E;
    boolean b = true;
    char c = '好';
    String s = String.valueOf(i);
    String doubleStr = String.valueOf(d);
    String floatStr = String.valueOf(f);
    String boolStr = String.valueOf(b);
    String charStr = String.valueOf(c);
    int number = Integer.parseInt(s);
    double pi = Double.parseDouble(doubleStr);
    float euler = Float.parseFloat(floatStr);
    boolean boolVal = Boolean.parseBoolean(boolStr);
    char perfect = charStr.charAt(0);
    String integerStr1 = Integer.toString(number);
    String doubleStr1 = Double.toString(pi);
    String floatStr1 = Float.toString(euler);
    String boolStr1 = Boolean.toString(boolVal);
    String charStr1 = Character.toString(perfect);
    int number1 = integerStr1.charAt(2) - integerStr1.charAt(3);

    System.out.println(number + "\n"
                       + pi + "\n"
                       + euler + "\n"
                       + boolVal + "\n"
                       + perfect + "\n\n"
                       + integerStr1 + "\n"
                       + doubleStr1 + "\n"
                       + floatStr1 + "\n"
                       + boolStr1 + "\n"
                       + charStr1 + "\n\n"
                       + number1 + "\n\n"
                       + b + "\n"
                       + true + "\n"
                       + boolStr);
  }
}
