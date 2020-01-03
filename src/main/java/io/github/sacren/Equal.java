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
        this.array1 = new int[array1.length];
        this.array2 = new int[array2.length];
        setArray(array1, this.array1);
        setArray(array2, this.array2);
    }

    /** Equal setter for both intance arrays. */
    public void setArray(int[] from, int[] to) {
        int i = 0;
        for (int n : from) {
            to[i++] = n;
        }
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
