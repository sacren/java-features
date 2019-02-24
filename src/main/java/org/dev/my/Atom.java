/**
 * Atom superclass.
 *
 * <p>Private data:
 * -atomicNumber:int
 *
 * <p>Constructor:
 * +Atom(atomicNumber:int)
 *
 * <p>Abstract methods:
 * +getAtomicNumber():int
 * +setAtomicNumber(atomicNumber:int):void
 */
public class Atom {
    /* private instance data */
    private int atomicNumber;

    /** Atom custom constructor. */
    public Atom(int atomicNumber) {
        setAtomicNumber(atomicNumber);
    }

    /** getter of Atom atomicNumber. */
    public int getAtomicNumber() {
        return atomicNumber;
    }

    /** setter of Atom atomicNumber. */
    public void setAtomicNumber(int atomicNumber) {
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new IllegalArgumentException(
                    String.format("Invalid atomic number %d!", atomicNumber));
        }
        this.atomicNumber = atomicNumber;
    }
}
