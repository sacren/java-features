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
 * -plain:String
 * -crypt:String
 *
 * <p>Constructor:
 * +Caesar(plain:String)
 *
 * <p>Public methods:
 * +setCrypt():void
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
    private String plain;
    private String crypt;

    /** Caesar constructor. */
    public Caesar(String plain) {
        this.plain = plain;
        setCrypt();
    }

    /** Caesar setter for encryption. */
    public void setCrypt() {
        int numeric;
        StringBuffer sb = new StringBuffer();
        /* loop for cipher and for character validation at the same time */
        for (char ch : plain.toCharArray()) {
            if (!Character.isLetter(ch)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", plain));
            }
            /* use character numeric value to calculate for cipher */
            numeric = Character.getNumericValue(ch);
            if (numeric > CHAR_MAX - CIPHER_KEY) {
                numeric -= ALPHABET;
            }
            ch = Character.forDigit(numeric + CIPHER_KEY, CHAR_MAX + 1);
            sb.append(Character.toUpperCase(ch));
        }
        crypt = sb.toString();
    }

    /** Caesar getter for decrypted text. */
    public String getDecrypt() {
        int numeric;
        StringBuffer sb = new StringBuffer();
        for (char ch : crypt.toCharArray()) {
            /* use character numeric value to calculate for decipher */
            numeric = Character.getNumericValue(ch);
            if (numeric < CHAR_MIN + CIPHER_KEY) {
                numeric += ALPHABET;
            }
            ch = Character.forDigit(numeric - CIPHER_KEY, CHAR_MAX + 1);
            sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }

    /** Caesar getter for cipher text. */
    public String getCipher() {
        int numeric;
        StringBuffer sb = new StringBuffer();
        /* 'A' + 'Z' and 'B' + 'Y'... are all equal. */
        final int A = Character.getNumericValue('A');
        final int Z = Character.getNumericValue('Z');
        for (char ch : plain.toCharArray()) {
            numeric = Character.getNumericValue(ch);
            ch = Character.forDigit(A + Z - numeric, CHAR_MAX + 1);
            sb.append(Character.toUpperCase(ch));
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
                plain,
                crypt,
                getDecrypt(),
                getCipher());
    }
}
