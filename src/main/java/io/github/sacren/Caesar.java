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
        encrypted = "";
        for (char c: usrStr.toUpperCase().toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", usrStr));
            }
            switch (c) {
                case 'X':
                case 'Y':
                case 'Z':
                    c = (char) (c + key - cycle);
                    break;
                default:
                    c = (char) (c + key);
            }
            encrypted += Character.toString(c);
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
