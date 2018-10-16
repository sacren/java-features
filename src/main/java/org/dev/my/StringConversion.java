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
    final char charA = 'a';
    String stringCn = String.valueOf(charCn);
    final char perfect = stringCn.charAt(0);
    String perfectToString = Character.toString(perfect);
    final int newChar = charCn - charA;

    /* string and byte conversion */
    final Byte minByteVal = Byte.MIN_VALUE;
    String minByteInString = Byte.toString(minByteVal);
    final Byte minByte = Byte.parseByte(minByteInString);
    final Byte maxByteVal = Byte.MAX_VALUE;
    String maxByteInString = Byte.toString(maxByteVal);
    final Byte maxByte = Byte.parseByte(maxByteInString);

    /* string and short conversion */
    final short minShortVal = Short.MIN_VALUE;
    String minShortInString = Short.toString(minShortVal);
    final short minShort = Short.parseShort(minShortInString);
    final short maxShortVal = Short.MAX_VALUE;
    String maxShortInString = Short.toString(maxShortVal);
    final short maxShort = Short.parseShort(maxShortInString);

    /* difference between string index */
    final int indexDiff = yearToString.charAt(2) - yearToString.charAt(3);

    final String output = String.format("%d is int%n"
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
                                        + "%d is byte%n"
                                        + "%d is byte%n"
                                        + "%s is string%n%n"
                                        + "%d is byte%n"
                                        + "%d is byte%n"
                                        + "%s is string%n%n"
                                        + "%d is short%n"
                                        + "%d is short%n"
                                        + "%s is string%n%n"
                                        + "%d is short%n"
                                        + "%d is short%n"
                                        + "%s is string%n%n"
                                        + "%d is int of difference of two characters%n"
                                        + "%c is char by int of difference between %17$c and %c%n",
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
                                        minByteVal,
                                        minByte,
                                        minByteInString,
                                        maxByteVal,
                                        maxByte,
                                        maxByteInString,
                                        minShortVal,
                                        minShort,
                                        minShortInString,
                                        maxShortVal,
                                        maxShort,
                                        maxShortInString,
                                        indexDiff,
                                        newChar,
                                        charA);

    System.out.printf(output);
  }
}
