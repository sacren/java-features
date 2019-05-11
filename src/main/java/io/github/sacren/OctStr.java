/**
 * OctStr class converts octal number to decimal.
 *
 * <p>Private instance data:
 * -octStr:String
 *
 * <p>Constructor:
 * +OctStr(octStr:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class OctStr {
    /* private static data */
    private static final int RADIX = 8;

    /* private instance data */
    private String octStr;

    /** OctStr constructor. */
    public OctStr(String octStr) {
        this.octStr = octStr;
    }

    /** OctStr instance string method. */
    public String toString() {
        int i = Integer.parseInt(octStr, RADIX);
        return String.format(
                "Octal string:  %s%n"
                        + "Binary string: %s%n"
                        + "Hex string:    %s%n"
                        + "Decimal value: %d",
                octStr,
                Integer.toBinaryString(i),
                Integer.toHexString(i),
                i);
    }
}
