/**
 * Root class using Object.
 *
 * <p>Private instance data:
 * -any:Object
 *
 * <p>Constructor:
 * +Root()
 *
 * <p>Public methods:
 * +toString():String
 */

public class Root {
    /* private instance data */
    private Object any;

    /** Root constructor. */
    public Root() {
        any = Boolean.TRUE;
    }

    /** Root string method. */
    public String toString() {
        return any.toString();
    }
}
