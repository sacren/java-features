/**
 * NullPointer class for exception handling.
 *
 * <p>Private instance data:
 * -strArray:String[]
 *
 * <p>Constructor:
 * +NullPointer()
 *
 * <p>Public methods:
 * +toString():String
 */
public class NullPointer {
    /* private instance data */
    private String[] strArray = new String[1];

    /** NullPointer constructor. */
    public NullPointer() {
    }

    /** NullPointer string method. */
    public String toString() {
        return String.format("%d%n", strArray[0].length());
    }
}
