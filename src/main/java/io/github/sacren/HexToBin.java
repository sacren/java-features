/**
 * HexToBin class converts hex string to binary.
 *
 * <p>Private instance data:
 * -hex:String
 *
 * <p>Constructor:
 * +HexToBin(hex:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class HexToBin {
    /* private static data */
    private static final int RADIX = 16;

    /* private instance data */
    private String hex;

    /** HexToBin custom constructor. */
    public HexToBin(String hex) {
        this.hex = hex;
    }

    /** HexToBin instance printout. */
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
