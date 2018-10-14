/**
 * String and primitive value conversion.
 */
public class StringConversion {
  public static void main(String[] args) {
    runConversion();
  }

  private static void runConversion() {
    /* string and int conversion */
    final int year = 2018;
    String yearInString = String.valueOf(year);
    final int yearInInt = Integer.parseInt(yearInString);
    String yearToString = Integer.toString(yearInInt);

    /* string and double conversion */
    final double piOfMath = Math.PI;
    String doubleStr = String.valueOf(piOfMath);
    final double pi = Double.parseDouble(doubleStr);
    String piToString = Double.toString(pi);

    /* string and float conversion */
    final float eulerOfMath = (float)Math.E;
    String eulerInString = String.valueOf(eulerOfMath);
    final float euler = Float.parseFloat(eulerInString);
    String eulerToString = Float.toString(euler);

    /* string and boolean conversion */
    final boolean trueVal = true;
    String trueValInString = String.valueOf(trueVal);
    final boolean trueValBoolean = Boolean.parseBoolean(trueValInString);
    String trueValToString = Boolean.toString(trueValBoolean);

    /* string and character */
    final char charCn = '好';
    String stringCn = String.valueOf(charCn);
    final char perfect = stringCn.charAt(0);
    String perfectToString = Character.toString(perfect);

    /* difference between string index */
    final int indexDiff = yearToString.charAt(2) - yearToString.charAt(3);

    System.out.printf("%d is int%n"
                      + "%d is int%n"
                      + "%s is string%n"
                      + "%s is string%n%n"
                      + "%f is double%n"
                      + "%f is double%n"
                      + "%s is string%n"
                      + "%s is string%n%n"
                      + "%f is float%n"
                      + "%f is float%n"
                      + "%s is string%n"
                      + "%s is string%n%n"
                      + "%b is boolean%n"
                      + "%b is boolean%n"
                      + "%s is string%n"
                      + "%s is string%n%n"
                      + "%c is char%n"
                      + "%c is char%n"
                      + "%s is string%n"
                      + "%s is string%n%n"
                      + "%d is int%n%n",
                      year,
                      yearInInt,
                      yearInString,
                      yearToString,
                      piOfMath,
                      pi,
                      doubleStr,
                      piToString,
                      eulerOfMath,
                      euler,
                      eulerInString,
                      eulerToString,
                      trueVal,
                      trueValBoolean,
                      trueValInString,
                      trueValToString,
                      charCn,
                      perfect,
                      stringCn,
                      perfectToString,
                      indexDiff);
  }
}
