/**
 * HexToBin class.
 *
 * <p>Private data:
 * -hex:String
 *
 * <p>Custom constructor:
 * +HexToBin(hex:String)
 *
 * <p>Public methods:
 * +check():void
 * +toBin():String
 * +toString():String
 */
public class HexToBin {
    /* private instance data */
    private String hex;

    /** HexToBin custom constructor. */
    public HexToBin(String hex) {
        this.hex = hex;
        check();
    }

    /** HexToBin method to validate input string is hex. */
    public void check() {
        if (hex.isEmpty()) {
            throw new IllegalArgumentException(
                    String.format(
                        "\"%s\" is not a hex string!",
                        hex));
        }
        for (char c : hex.toCharArray()) {
            if (Character.digit(c, 16) == -1) {
                throw new IllegalArgumentException(
                        String.format(
                            "\"%s\" is not a hex string!",
                            hex));
            }
        }
    }

    /** HexToBin method to convert hex string to binary string. */
    public String toBin() {
        String[] bin = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };
        String s = "";
        for (char c : hex.toCharArray()) {
            s += bin[Character.digit(c, 16)];
        }
        return s;
    }

    /** HexToBin instance printout. */
    public String toString() {
        return String.format(
                "Hex: %s%n"
                        + "Binary: %s",
                hex, toBin());
    }
}
