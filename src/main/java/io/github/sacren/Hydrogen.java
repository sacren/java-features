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
    /** Hydrogen constructor. */
    public Hydrogen() {
        super(1);
    }

    /** Hydrogen string method. */
    public String toString() {
        return String.format("Hydrogen: %d", get());
    }
}
