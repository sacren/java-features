/**
 * KeyPad class with the alphabet mapped to the digits.
 *
 * <p>ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
 *
 * <p>Private instance data:
 * -str:String
 *
 * <p>Constructor:
 * +KeyPad(str:String)
 *
 * <p>Public methods:
 * +set(str:String):void
 * +getPhNum():String
 * +toString():String
 */
public class KeyPad {
    /* private instance data */
    private String str;

    /** KeyPad constructor. */
    public KeyPad(String str) {
        set(str);
    }

    /** KeyPad setter for the input string. */
    public void set(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", str));
            }
        }
        this.str = str;
    }

    /** KeyPad getter for phone number in digits. */
    public String getPhNum() {
        String phNum = "";
        for (char c : str.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    phNum += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    phNum += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    phNum += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    phNum += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    phNum += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    phNum += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    phNum += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    phNum += "9";
                    break;
                default:
            }
        }
        return phNum;
    }

    /** KeyPad string method. */
    public String toString() {
        return String.format(
                "Input string: %s%n"
                        + "Phone number: %s",
                str,
                getPhNum());
    }
}
