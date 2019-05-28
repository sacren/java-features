/**
 * RvsStr class for the reverse of a string.
 *
 * <p>Private instance data:
 * -str:String
 * -rvs:StringBuffer
 *
 * <p>Constructor:
 * +RvsStr(str:String)
 *
 * <p>Public methods:
 * +reverse():void
 * +toString():String
 */
public class RvsStr {
    /* private instance data */
    private String str;
    private StringBuffer rvs;

    /** RvsStr constructor. */
    public RvsStr(String str) {
        this.str = str;
        reverse();
    }

    /** RvsStr setter for reversed string. */
    public void reverse() {
        rvs = new StringBuffer();
        for (char c : str.toCharArray()) {
            rvs.insert(0, c);
        }
    }

    /** RvsStr string method. */
    public String toString() {
        return String.format(
                "User input: %s%n"
                        + "Reversed:   %s",
                str,
                rvs);
    }
}
