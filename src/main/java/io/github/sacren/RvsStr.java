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

    /** RvsStr setter for string character list. */
    public void reverse() {
        reversed = "";
        char[] list = str.toCharArray();
        int size = list.length;
        for (int i = 0; i < size; i++) {
            reversed += list[size - 1 - i];
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
