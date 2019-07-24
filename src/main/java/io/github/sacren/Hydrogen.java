/**
 * Hydrogen subclass extends Atom superclass.
 *
 * <p>Constructor:
 * +Hydrogen()
 *
 * <p>Public method:
 * +toString():String
 */
public class Hydrogen extends Atom {
    /* private static data */
    private static final int HYDROGEN_ATOMIC_NUMBER = 1;

    /** Hydrogen constructor. */
    public Hydrogen() {
        super(HYDROGEN_ATOMIC_NUMBER);
    }

    /** Hydrogen string method. */
    public String toString() {
        return String.format("Hydrogen: %d", get());
    }
}
