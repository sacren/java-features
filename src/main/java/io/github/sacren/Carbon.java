/**
 * Carbon subclass extends Atom superclass.
 *
 * <p>Constructor:
 * +Carbon()
 *
 * <p>Public method:
 * +toString():String
 */
public class Carbon extends Atom {
    /** Carbon constructor. */
    public Carbon() {
        super(6);
    }

    /** Carbon static getter for origin info. */
    public static String getOrigin() {
        return "From Carbon!";
    }

    /** Carbon string method. */
    public String toString() {
        return String.format("Carbon:   %d", get());
    }
}
