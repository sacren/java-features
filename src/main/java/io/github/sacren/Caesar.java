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
    /* private static data */
    private static final int CHAR_MAX = 35;
    private static final int CIPHER_KEY = 3;
    private static final int ALPHABET = 26;

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
        int tmp;
        encrypted = "";
        for (char c: usrStr.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", usrStr));
            }
            /* use character numeric value to calculate for cipher */
            tmp = Character.getNumericValue(c);
            if (tmp > CHAR_MAX - CIPHER_KEY) {
                c = Character.forDigit(tmp + CIPHER_KEY - ALPHABET, CHAR_MAX + 1);
            } else {
                c = Character.forDigit(tmp + CIPHER_KEY, CHAR_MAX + 1);
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
