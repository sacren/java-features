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
 * +getPhone():String
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
    public String getPhone() {
        StringBuffer sb = new StringBuffer();
        for (char c : str.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    sb.append(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    sb.append(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    sb.append(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    sb.append(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    sb.append(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    sb.append(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    sb.append(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    sb.append(9);
                    break;
                default:
            }
        }
        return sb.toString();
    }

    /** KeyPad string method. */
    public String toString() {
        return String.format(
                "Input string: %s%n"
                        + "Phone number: %s",
                str,
                getPhone());
    }
}
