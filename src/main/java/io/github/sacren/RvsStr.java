/**
 * RvsStr class for the reverse of a string.
 *
 * <p>Private instance data:
 * -str:String
 * -reversed:String
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
    private String reversed;

    /** RvsStr constructor. */
    public RvsStr(String str) {
        this.str = str;
        reverse();
    }

    /** RvsStr setter for reversed string. */
    public void reverse() {
        reversed = "";
        for (char c : str.toCharArray()) {
            reversed = c + reversed;
        }
    }

    /** RvsStr string method. */
    public String toString() {
        return String.format(
                "User input: %s%n"
                        + "Reversed:   %s",
                str,
                reversed);
    }
}
