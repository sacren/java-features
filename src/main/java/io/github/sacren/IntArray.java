/**
 * IntArray class of non-negative integer array.
 *
 * <p>Overload the method with different type and number of parameters.
 *
 * <p>Search the array for elements of boolean and int types.  Return the index
 * of the first found.
 *
 * <p>Private instance data:
 * -intArray:int[]
 *
 * <p>Constructor:
 * +IntArray(intArray:int[])
 *
 * <p>Public methods:
 * +check():void
 * +toString():String
 */
import java.util.Arrays;

public class IntArray {
    /* private instance data */
    private int[] intArray;

    /** IntArray constructor. */
    public IntArray(int[] intArray) {
        this.intArray = intArray;
        check();
    }

    /** IntArray method to validate array items. */
    public void check() {
        for (int num : intArray) {
            if (num < 0) {
                throw new IllegalArgumentException(
                        String.format(
                            "%s is invalid!",
                            Arrays.toString(intArray)));
            }
        }
    }

    /** IntArray instance printout. */
    public String toString() {
        return String.format(
                "%s", Arrays.toString(intArray));
    }
}
