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
        intArray[intArray.length] = 1;
    }

    /** ArrayBounds string method. */
    public String toString() {
        return "ArrayIndexOutOfBoundsException";
    }
}
