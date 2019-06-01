/**
 * StrConv class for string and primitive value conversion.
 *
 * <p>Public method:
 * +toString():String
 */
public class StrConv {
    /** StrConv string method. */
    public String toString() {
        /* string and int conversion */
        int year = 2018;
        String yearStr1 = String.valueOf(year);
        String yearStr2 = Integer.toString(year);

        /* string and double conversion */
        double piOfMath = Math.PI;
        String doubleStr = String.valueOf(piOfMath);
        double pi = Double.parseDouble(doubleStr);
        String piToString = Double.toString(pi);

        /* string and float conversion */
        float eulerOfMath = (float) Math.E;
        String eulerInString = String.valueOf(eulerOfMath);
        float euler = Float.parseFloat(eulerInString);
        String eulerToString = Float.toString(euler);

        /* string and boolean conversion */
        boolean trueVal = true;
        String trueValInString = String.valueOf(trueVal);
        boolean trueValBoolean = Boolean.parseBoolean(trueValInString);
        String trueValToString = Boolean.toString(trueValBoolean);

        /* string and character */
        char charCn = '好';
        char charA = 'a';
        String stringCn = String.valueOf(charCn);
        char perfect = stringCn.charAt(0);
        String perfectToString = Character.toString(perfect);
        int newChar = charCn - charA;

        /* string and byte conversion */
        Byte minByteVal = Byte.MIN_VALUE;
        String minByteInString = Byte.toString(minByteVal);
        Byte minByte = Byte.parseByte(minByteInString);
        Byte maxByteVal = Byte.MAX_VALUE;
        String maxByteInString = Byte.toString(maxByteVal);
        Byte maxByte = Byte.parseByte(maxByteInString);

        /* string and short conversion */
        short minShortVal = Short.MIN_VALUE;
        String minShortInString = Short.toString(minShortVal);
        short minShort = Short.parseShort(minShortInString);
        short maxShortVal = Short.MAX_VALUE;
        String maxShortInString = Short.toString(maxShortVal);
        short maxShort = Short.parseShort(maxShortInString);

        /* string and long conversion */
        long minLongVal = Long.MIN_VALUE;
        String minLongInString = Long.toString(minLongVal);
        long minLong = Long.parseLong(minLongInString);
        long maxLongVal = Long.MAX_VALUE;
        String maxLongInString = Long.toString(maxLongVal);
        long maxLong = Long.parseLong(maxLongInString);

        /* difference between string index */
        int indexDiff = yearStr2.charAt(2) - yearStr2.charAt(3);

        return String.format(
                "%d is int%n"
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
                        + "%d is long%n"
                        + "%d is long%n"
                        + "%s is string%n%n"
                        + "%d is long%n"
                        + "%d is long%n"
                        + "%s is string%n%n"
                        + "%d is int of difference of two characters%n"
                        + "%c is char by int of difference between %17$c and %c",
                year,
                Integer.parseInt(yearStr1),
                yearStr1,
                yearStr2,
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
                minLongVal,
                minLong,
                minLongInString,
                maxLongVal,
                maxLong,
                maxLongInString,
                indexDiff,
                newChar,
                charA);
    }
}
