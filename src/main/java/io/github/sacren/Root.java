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
 * +getName():String
 * +toString():String
 */

public class Root {
    /* private instance data */
    private Object bool;

    /** Root constructor. */
    public Root() {
        bool = Boolean.FALSE;
    }

    /** Root getter for the object name. */
    public String getName() {
        return bool.getClass().getName();
    }

    /** Root string method. */
    public String toString() {
        return String.format(
                "=== Object class examples ===%n%n"
                        + "Boolean object: %s%n"
                        + "Name:           %s",
                bool.toString(),
                getName());
    }
}
