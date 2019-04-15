/**
 * AlphaNum class for number of vowels and digits.
 *
 * <p>Private instance data:
 * -usrStr:String
 * -count:int[2]
 * -vowels:double
 * -digits:double
 *
 * <p>Constructor:
 * +AlphaNum(usrStr:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class AlphaNum {
    /* private instance data */
    private String usrStr;
    private int[] count;
    private double vowels;
    private double digits;

    /** AlphaNum constructor. */
    public AlphaNum(String usrStr) {
        this.usrStr = usrStr;
        /* count[0]: vowels, count[1]: digits */
        count = new int[2];
        count();
        vowels = (double) count[0] * 100 / usrStr.length();
        digits = (double) count[1] * 100 / usrStr.length();
    }

    /** AlphaNum method to count vowels and digits. */
    public void count() {
        for (char c : usrStr.toLowerCase().toCharArray()) {
            if (Character.isDigit(c)) {
                count[1]++;
                continue;
            }
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count[0]++;
                    break;
                default:
            }
        }
    }

    /** AlphaNum instance printout. */
    public String toString() {
        return String.format(
                "Number of vowels: %d (%.2f%%)%n"
                        + "Number of digits: %d (%.2f%%)",
                count[0], vowels,
                count[1], digits);
    }
}
