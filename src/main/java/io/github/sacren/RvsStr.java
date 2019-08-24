/**
 * RvsStr class for the reverse of a string.
 *
 * <p>Private instance data:
 * -sb:StringBuilder
 *
 * <p>Constructor:
 * +RvsStr(str:String)
 *
 * <p>Public methods:
 * +toString():String
 */
public class RvsStr {
    /* private instance data */
    private StringBuilder sb;

    /** RvsStr constructor. */
    public RvsStr(String str) {
        sb = new StringBuilder(str);
    }

    /** RvsStr string method. */
    public String toString() {
        return String.format(
                "User input: %s%n"
                        + "Reversed:   %s",
                sb.toString(),
                sb.reverse().toString());
    }
}
