/**
 * BinStr class converts binary string to octal, hex and decimal.
 *
 * <p>Private data:
 * -binStr:String
 *
 * <p>Constructor:
 * +BinStr(binStr:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class BinStr {
    /* private static data */
    private static final int RADIX = 2;

    /* private instance data */
    private String binStr;

    /** BinStr constructor. */
    public BinStr(String binStr) {
        this.binStr = binStr;
    }

    /** BinStr instance printout. */
    public String toString() {
        int i = Integer.parseUnsignedInt(binStr, RADIX);
        return String.format(
                "Binary string: %s%n"
                        + "Octal string:  %s%n"
                        + "Hex string:    %s%n"
                        + "Decimal value: %d",
                binStr,
                Integer.toOctalString(i),
                Integer.toHexString(i),
                i);
    }
}
