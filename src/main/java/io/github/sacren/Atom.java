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

    /** getter of Atom atomicNumber. */
    public int get() {
        return atomicNumber;
    }

    /** setter of Atom atomicNumber. */
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
