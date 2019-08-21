/**
 * ArrayBounds class for exception handling.
 *
 * <p>Private instance data:
 * -intArray:int[]
 *
 * <p>Constructor:
 * +ArrayBounds()
 *
 * <p>Public methods:
 * +toString():String
 */
public class ArrayBounds {
    /* private instance data */
    private int[] intArray = new int[6];

    /** ArrayBounds constructor. */
    public ArrayBounds() {
        intArray[8] = 1;
    }

    /** ArrayBounds string method. */
    public String toString() {
        return String.format("%d", intArray[0]);
    }
}
