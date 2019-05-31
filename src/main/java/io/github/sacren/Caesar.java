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
 * -str:String
 * -encrypted:String
 *
 * <p>Constructor:
 * +Caesar(str:String)
 *
 * <p>Public methods:
 * +setEncrypt():void
 * +getDecrypt():String
 * +getCipher():String
 * +toString():String
 */
public class Caesar {
    /* private static data */
    private static final int CHAR_MAX = 35;
    private static final int CHAR_MIN = 10;
    private static final int CIPHER_KEY = 3;
    private static final int ALPHABET = 26;

    /* private instance data */
    private String str;
    private String encrypted;

    /** Caesar constructor. */
    public Caesar(String str) {
        this.str = str;
        setEncrypt();
    }

    /** Caesar setter for encryption. */
    public void setEncrypt() {
        int tmp;
        StringBuffer sb = new StringBuffer();
        /* loop for cipher and for character validation at the same time */
        for (char c: str.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", str));
            }
            /* use character numeric value to calculate for cipher */
            tmp = Character.getNumericValue(c);
            if (tmp > CHAR_MAX - CIPHER_KEY) {
                tmp -= ALPHABET;
            }
            c = Character.forDigit(tmp + CIPHER_KEY, CHAR_MAX + 1);
            sb.append(Character.toString(Character.toUpperCase(c)));
        }
        encrypted = sb.toString();
    }

    /** Caesar getter for decrypted text. */
    public String getDecrypt() {
        int tmp;
        StringBuffer sb = new StringBuffer();
        for (char c: encrypted.toCharArray()) {
            /* use character numeric value to calculate for decipher */
            tmp = Character.getNumericValue(c);
            if (tmp < CHAR_MIN + CIPHER_KEY) {
                tmp += ALPHABET;
            }
            c = Character.forDigit(tmp - CIPHER_KEY, CHAR_MAX + 1);
            sb.append(Character.toString(Character.toUpperCase(c)));
        }
        return sb.toString();
    }

    /** Caesar getter for cipher text. */
    public String getCipher() {
        int tmp;
        StringBuffer sb = new StringBuffer();
        /* 'A' + 'Z' and 'B' + 'Y'... are all equal. */
        final int A = Character.getNumericValue('A');
        final int Z = Character.getNumericValue('Z');
        for (char c : str.toUpperCase().toCharArray()) {
            tmp = Character.getNumericValue(c);
            c = Character.forDigit(A + Z - tmp, CHAR_MAX + 1);
            sb.append(Character.toString(Character.toUpperCase(c)));
        }
        return sb.toString();
    }

    /** Caesar string method. */
    public String toString() {
        return String.format(
                "Plain text:     %s%n"
                        + "Encrypted text: %s%n"
                        + "Decrypted text: %s%n"
                        + "Cipher text:    %s",
                str,
                encrypted,
                getDecrypt(),
                getCipher());
    }
}
