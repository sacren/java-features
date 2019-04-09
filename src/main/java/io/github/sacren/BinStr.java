/**
 * BinStr class.
 *
 * <p>Convert binary string to numerical value in decimal.
 *
 * <p>Private data:
 * -binStr:String
 * -decimal:long
 *
 * <p>Constructor:
 * +BinStr(binStr:String)
 *
 * <p>Public methods:
 * +convirt():void
 * +toString():String
 */
public class BinStr {
    /* private instance data */
    private String binStr;
    private long decimal;

    /** BinStr constructor. */
    public BinStr(String binStr) {
        this.binStr = binStr;
        convert();
    }

    /** BinStr method to convert to decimal value. */
    public void convert() {
        final char[] bin = binStr.toCharArray();
        final int size = bin.length;
        int index = 0;
        int exponent;
        decimal = 0;
        for (char c: bin) {
            if (Character.digit(c, 2) == -1) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is not a binary string!", binStr));
            }
            /* (size - 1) is the greatest index and each iteration makes it decrement. */
            exponent = size - 1 - index++;
            decimal += (long) Math.pow(2, exponent) * Character.digit(c, 2);
        }
    }

    /** BinStr instance printout. */
    public String toString() {
        return String.format(
                "Binary string: %s%n"
                        + "Decimal value: %d",
                binStr, decimal);
    }
}
