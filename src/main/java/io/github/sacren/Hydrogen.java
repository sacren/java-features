/**
 * Hydrogen subclass extends Atom superclass.
 *
 * <p>Constructor:
 * +Hydrogen()
 *
 * <p>Public methods:
 * +toString():String
 */
public class Hydrogen extends Atom {
    /* private static data */
    private static final int HYDROGEN_ATOMIC_NUMBER = 1;

    /** Hydrogen custom constructor. */
    public Hydrogen() {
        super(HYDROGEN_ATOMIC_NUMBER);
    }

    /** Hydrogen instance description. */
    public String toString() {
        return String.format("Hydrogen: %d", get());
    }
}
