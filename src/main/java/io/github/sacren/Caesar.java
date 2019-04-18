/**
 * Caesar class for cipher and decipher.
 *
 * <p>Private static data:
 * -CHAR_MAX:int = 35
 * -CHAR_MIN:int = 10
 * -CIPHER_KEY:int = 3
 * -ALPHABET:int = 26
 *
 * <p>Private instance data:
 * -usrStr:String
 * -encrypted:String
 * -decrypted:String
 *
 * <p>Constructor:
 * +Caesar(usrStr:String)
 *
 * <p>Public methods:
 * +cipher():void
 * +decipher():void
 * +toString():String
 */
public class Caesar {
    /* private static data */
    private static final int CHAR_MAX = 35;
    private static final int CHAR_MIN = 10;
    private static final int CIPHER_KEY = 3;
    private static final int ALPHABET = 26;

    /* private instance data */
    private String usrStr;
    private String encrypted;
    private String decrypted;
    private String cipherText;

    /** Caesar constructor. */
    public Caesar(String usrStr) {
        this.usrStr = usrStr;
        cipher();
        decipher();
        cipherText();
    }

    /** Caesar method for encryption. */
    public void cipher() {
        int tmp;
        encrypted = "";
        /* loop for cipher and for character validation at the same time */
        for (char c: usrStr.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", usrStr));
            }
            /* use character numeric value to calculate for cipher */
            tmp = Character.getNumericValue(c);
            if (tmp > CHAR_MAX - CIPHER_KEY) {
                tmp -= ALPHABET;
            }
            c = Character.forDigit(tmp + CIPHER_KEY, CHAR_MAX + 1);
            encrypted += Character.toString(Character.toUpperCase(c));
        }
    }

    /** Caesar method for decryption. */
    public void decipher() {
        int tmp;
        decrypted = "";
        for (char c: encrypted.toCharArray()) {
            /* use character numeric value to calculate for decipher */
            tmp = Character.getNumericValue(c);
            if (tmp < CHAR_MIN + CIPHER_KEY) {
                tmp += ALPHABET;
            }
            c = Character.forDigit(tmp - CIPHER_KEY, CHAR_MAX + 1);
            decrypted += Character.toString(Character.toUpperCase(c));
        }
    }

    /** Caesar method for cipher text. */
    public void cipherText() {
        int tmp;
        cipherText = "";
        /* 'A' + 'Z' and 'B' + 'Y'... are all equal. */
        final int A = Character.getNumericValue('A');
        final int Z = Character.getNumericValue('Z');
        for (char c : usrStr.toUpperCase().toCharArray()) {
            tmp = Character.getNumericValue(c);
            c = Character.forDigit(A + Z - tmp, CHAR_MAX + 1);
            cipherText += Character.toString(Character.toUpperCase(c));
        }
    }

    /** Caesar instance printout. */
    public String toString() {
        return String.format(
                "Plain text:     %s%n"
                        + "Encrypted text: %s%n"
                        + "Decrypted text: %s%n"
                        + "Cipher text:    %s",
                usrStr,
                encrypted,
                decrypted,
                cipherText);
    }
}
