/**
 * Root class using Object.
 *
 * <p>Private instance data:
 * -bool:Object
 *
 * <p>Constructor:
 * +Root()
 *
 * <p>Public methods:
 * +toString():String
 */

public class Root {
    /* private instance data */
    private Object bool;

    /** Root constructor. */
    public Root() {
        bool = Boolean.FALSE;
    }

    /** Root string method. */
    public String toString() {
        return String.format(
                "=== Object class examples ===%n%n"
                        + "Boolean object: %s",
                bool.toString());
    }
}
