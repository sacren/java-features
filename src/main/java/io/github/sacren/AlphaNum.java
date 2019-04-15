/**
 * AlphaNum class for number of vowels and digits.
 *
 * <p>Private instance data:
 * -usrStr:String
 * -vowels:int
 * -digits:int
 * -vowRate:double
 * -digiRate:double
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
    private int vowels;
    private int digits;
    private double vowRate;
    private double digiRate;

    /** AlphaNum constructor. */
    public AlphaNum(String usrStr) {
        this.usrStr = usrStr;
        count();
        vowRate = (double) vowels * 100 / usrStr.length();
        digiRate = (double) digits * 100 / usrStr.length();
    }

    /** AlphaNum method to count vowels and digits. */
    public void count() {
        for (char c : usrStr.toLowerCase().toCharArray()) {
            if (Character.isDigit(c)) {
                digits++;
                continue;
            }
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
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
                vowels, vowRate,
                digits, digiRate);
    }
}
