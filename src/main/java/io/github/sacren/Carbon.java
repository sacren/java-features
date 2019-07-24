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
    /* private static data */
    private static final int CARBON_ATOMIC_NUMBER = 6;

    /** Carbon constructor. */
    public Carbon() {
        super(CARBON_ATOMIC_NUMBER);
    }

    /** Carbon string method. */
    public String toString() {
        return String.format("Carbon:   %d", get());
    }
}
