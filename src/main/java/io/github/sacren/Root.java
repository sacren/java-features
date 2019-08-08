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
 * +getHash():int
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

    /** Root getter for the hash of the object. */
    public int getHash() {
        return bool.hashCode();
    }

    /** Root string method. */
    public String toString() {
        return String.format(
                "=== Object class examples ===%n%n"
                        + "Boolean object: %s%n"
                        + "Name:           %s%n"
                        + "Hash:           %d",
                bool.toString(),
                getName(),
                getHash());
    }
}
