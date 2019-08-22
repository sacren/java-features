/**
 * ClassCast class for exception handling.
 *
 * <p>Private instance data:
 * -obj:Object
 *
 * <p>Constructor:
 * +ClassCast()
 *
 * <p>Public methods:
 * +toString():String
 */
public class ClassCast {
    /* private instance data */
    Object obj = new Object();

    /** ClassCast constructor. */
    public ClassCast() {
    }

    /** ClassCast string method. */
    public String toString() {
        return String.format("%d%n", (Integer) obj);
    }
}
