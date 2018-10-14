/**
 * String/Primitive conversion.
 */
public class StringConversion {
  public static void main(String[] args) {
    runConversion();
  }

  private static void runConversion() {
    final int year = 2018;
    final double piOfMath = Math.PI;
    final float floatingE = (float)Math.E;
    final boolean trueVal = true;
    final char charCn = '好';
    String s = String.valueOf(year);
    String doubleStr = String.valueOf(piOfMath);
    String floatStr = String.valueOf(floatingE);
    String boolStr = String.valueOf(trueVal);
    String charStr = String.valueOf(charCn);
    final int number = Integer.parseInt(s);
    final double pi = Double.parseDouble(doubleStr);
    final float euler = Float.parseFloat(floatStr);
    final boolean boolVal = Boolean.parseBoolean(boolStr);
    final char perfect = charStr.charAt(0);
    String integerStr1 = Integer.toString(number);
    String doubleStr1 = Double.toString(pi);
    String floatStr1 = Float.toString(euler);
    String boolStr1 = Boolean.toString(boolVal);
    String charStr1 = Character.toString(perfect);
    final int difference = integerStr1.charAt(2) - integerStr1.charAt(3);

    System.out.printf("%d%n%f%n%f%n%b%n%c%n%n%s%n%s%n%s%n%s%n"
                      + "%s%n%n%d%n%n%b%n%b%n%s%n",
                      number, pi, euler, boolVal, perfect, integerStr1,
                      doubleStr1, floatStr1, boolStr1, charStr1, difference,
                      trueVal, true, boolStr);
  }
}
