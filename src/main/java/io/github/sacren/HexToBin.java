/**
 * HexToBin class.
 *
 * <p>Private data:
 * -bin:String
 * -hex:String
 *
 * <p>Custom constructor:
 * +HexToBin(hex:String)
 *
 * <p>Public methods:
 * +checkHex():void
 * +toBin():void
 * +toString():String
 */
public class HexToBin {
    /* private instance data */
    private String bin;
    private String hex;

    /** HexToBin custom constructor. */
    public HexToBin(String hex) {
        this.hex = hex;
        checkHex();
        toBin();
    }

    /** HexToBin method to validate input string is hex. */
    public void checkHex() {
        if (!isHex(hex)) {
            throw new IllegalArgumentException(
                    String.format(
                        "\"%s\" is not a hex string!",
                        hex));
        }
    }

    /* helper for hex string validation */
    private static boolean isHex(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (char c: s.toCharArray()) {
            if (Character.digit(c, 16) == -1) {
                return false;
            }
        }
        return true;
    }

    /** HexToBin method to convert hex string to binary string. */
    public void toBin() {
        String[] binArray = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };
        bin = "";
        for (char c: hex.toCharArray()) {
            bin += binArray[Character.digit(c, 16)];
        }
    }

    /** HexToBin instance printout. */
    public String toString() {
        return String.format(
                "Hex: %s%n"
                        + "Binary: %s",
                hex, bin);
    }
}
