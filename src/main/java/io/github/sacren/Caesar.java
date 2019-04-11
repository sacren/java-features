/**
 * Caesar class for cipher.
 *
 * <p>Private instance data:
 * -usrStr:String
 * -encrypted:String
 *
 * <p>Constructor:
 * +Caesar(usrStr:String)
 *
 * <p>Public methods:
 * +cipher():void
 * +toString():String
 */
public class Caesar {
    /* private instance data */
    private String usrStr;
    private String encrypted;

    /** Caesar constructor. */
    public Caesar(String usrStr) {
        this.usrStr = usrStr;
        cipher();
    }

    /** Caesar method for encryption. */
    public void cipher() {
        final int key = 3;
        final int cycle = 26;
        int tmp;
        encrypted = "";
        for (char c: usrStr.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", usrStr));
            }
            tmp = Character.getNumericValue(c);
            if (tmp > 35 - key) {
                c = Character.forDigit(tmp + key - cycle, 35 + 1);
            } else {
                c = Character.forDigit(tmp + key, 35 + 1);
            }
            encrypted += Character.toString(Character.toUpperCase(c));
        }
    }

    /** Caesar instance printout. */
    public String toString() {
        return String.format(
                "Plain text:     %s%n"
                        + "Encrypted text: %s",
                usrStr,
                encrypted);
    }
}
