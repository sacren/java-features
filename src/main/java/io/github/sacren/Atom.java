/**
 * Atom superclass.
 *
 * <p>Private data:
 * -atomicNumber:int
 *
 * <p>Constructor:
 * +Atom(atomicNumber:int)
 *
 * <p>Public methods:
 * +get():int
 * +set(atomicNumber:int):void
 */
public class Atom {
    /* private instance data */
    private int atomicNumber;

    /** Atom custom constructor. */
    public Atom(int atomicNumber) {
        set(atomicNumber);
    }

    /** Atom getter for atomic number. */
    public int get() {
        return atomicNumber;
    }

    /** Atom static getter for origin info. */
    public static String getOrigin() {
        return "From Atom!";
    }

    /** Atome setter for atomic number. */
    public void set(int atomicNumber) {
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new IllegalArgumentException(
                    String.format(
                        "%d is invalid atomic number!",
                        atomicNumber));
        }
        this.atomicNumber = atomicNumber;
    }
}
