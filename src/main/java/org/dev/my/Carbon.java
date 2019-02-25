/**
 * Carbon subclass extends Atom superclass.
 *
 * <p>Constructor:
 * +Carbon(atomicNumber:int)
 *
 * <p>Public methods:
 * +toString():String
 */
public class Carbon extends Atom {
    /* private static data */
    private static final int CARBON_ATOMIC_NUMBER = 6;

    /** Carbon custom constructor. */
    public Carbon() {
        super(CARBON_ATOMIC_NUMBER);
    }

    /** Carbon instance description. */
    public String toString() {
        return String.format(
                "Carbon has atomic number %d",
                getAtomicNumber());
    }
}
