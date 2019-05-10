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
        return String.format(
                "Hex:    %s%n"
                        + "Binary: %s",
                hex,
                Integer.toBinaryString(Integer.parseUnsignedInt(hex, RADIX)));
    }
}
