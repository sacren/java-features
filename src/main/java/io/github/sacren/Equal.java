/**
 * Equal class checks if two arrays are equal.
 *
 * <p>Private instance data:
 * -array1:int[]
 * -array2:int[]
 *
 * <p>Equal constructor:
 * +Equal()
 *
 * <p>Public methods:
 * +isEqual():boolean
 * +toString():String
 */
import java.util.Arrays;

public class Equal {
    /* private instance data */
    private int[] array1;
    private int[] array2;

    /** Equal constructor. */
    public Equal(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    /** Equal method to see if arrays are equal. */
    public boolean isEqual() {
        int index = 0;
        if (array1.length != array2.length) {
            return false;
        }
        for (int number : array1) {
            if (number != array2[index++]) {
                return false;
            }
        }
        return true;
    }

    /** Equal instance printout. */
    public String toString() {
        return String.format(
                "%s %s %s",
                Arrays.toString(array1),
                isEqual() ? "equals" : "doesn't equal",
                Arrays.toString(array2));
    }
}
