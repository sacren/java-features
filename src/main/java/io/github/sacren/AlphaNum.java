/**
 * AlphaNum class for number of vowels and digits.
 *
 * <p>Private instance data:
 * -input:String
 * -vowels:int
 * -digits:int
 *
 * <p>Constructor:
 * +AlphaNum(input:String)
 *
 * <p>Public methods:
 * +set(input:String):void
 * +count():void
 * +rate(num:int):double
 * +toString():String
 */
public class AlphaNum {
    /* private instance data */
    private String input;
    private int vowels;
    private int digits;

    /** AlphaNum constructor. */
    public AlphaNum(String input) {
        set(input);
        count();
    }

    /** AlphaNum setter for input string. */
    public void set(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" for input is invalid!", input));
        }
        this.input = input;
    }

    /** AlphaNum method to count vowels and digits. */
    public void count() {
        for (char c : input.toLowerCase().toCharArray()) {
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

    /** AlphaNum method for the percent of vowels or digits. */
    public double rate(int num) {
        return (double) num * 100 / input.length();
    }

    /** AlphaNum instance printout. */
    public String toString() {
        return String.format(
                "=== Input string ===%n%n"
                        + "%s%n%n"
                        + "Length:           %d%n"
                        + "Number of vowels: %d (%.2f%%)%n"
                        + "Number of digits: %d (%.2f%%)",
                input,
                input.length(),
                vowels, rate(vowels),
                digits, rate(digits));
    }
}
