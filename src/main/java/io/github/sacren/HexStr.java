/**
 * HexStr class converts hex string to binary.
 *
 * <p>Private instance data:
 * -hex:String
 *
 * <p>Constructor:
 * +HexStr(hex:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class HexStr {
    /* private static data */
    private static final int RADIX = 16;

    /* private instance data */
    private String hex;

    /** HexStr custom constructor. */
    public HexStr(String hex) {
        this.hex = hex;
    }

    /** HexStr instance printout. */
    public String toString() {
        int i = Integer.parseUnsignedInt(hex, RADIX);
        return String.format(
                "Hex string:    %s%n"
                        + "Binary string: %s%n"
                        + "Octal string:  %s%n"
                        + "Decimal value: %d",
                hex,
                Integer.toBinaryString(i),
                Integer.toOctalString(i),
                i);
    }
}
