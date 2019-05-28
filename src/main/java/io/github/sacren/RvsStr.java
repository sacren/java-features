/**
 * RvsStr class for the reverse of a string.
 *
 * <p>Private instance data:
 * -str:String
 *
 * <p>Constructor:
 * +RvsStr(str:String)
 *
 * <p>Public methods:
 * +getRvs():StringBuffer
 * +toString():String
 */
public class RvsStr {
    /* private instance data */
    private String str;

    /** RvsStr constructor. */
    public RvsStr(String str) {
        this.str = str;
    }

    /** RvsStr getter for reversed string. */
    public StringBuffer getRvs() {
        return new StringBuffer(str).reverse();
    }

    /** RvsStr string method. */
    public String toString() {
        return String.format(
                "User input: %s%n"
                        + "Reversed:   %s",
                str,
                getRvs());
    }
}
