/**
 * IntArray class of non-negative integer array.
 *
 * <p>Overload the method with different type and number of parameters.
 *
 * <p>Search int array for element of array length value.
 *
 * <p>Private instance data:
 * -list:int[]
 *
 * <p>Constructor:
 * +IntArray(list:int[])
 *
 * <p>Public methods:
 * +check():void
 * +hasInt():boolean
 * +getDbl():double[]
 * +toStr(a:int[]):String
 * +toStr(a:double[]):String
 * +toStr(a1:int[], a2:double[]):String
 * +toString():String
 */
import java.util.Arrays;

public class IntArray {
    /* private instance data */
    private int[] list;

    /** IntArray constructor. */
    public IntArray(int[] list) {
        this.list = list;
        check();
    }

    /** IntArray method to validate array items. */
    public void check() {
        for (int num : list) {
            if (num < 0) {
                throw new IllegalArgumentException(
                        String.format(
                            "%s is invalid!",
                            Arrays.toString(list)));
            }
        }
    }

    /** IntArray method for array length value. */
    public boolean hasInt() {
        for (int num : list) {
            if (num == list.length) {
                return true;
            }
        }
        return false;
    }

    /** IntArray getter for double array. */
    public double[] getDbl() {
        double[] a = new double[list.length];
        int i = 0;
        for (double num : list) {
            a[i++] = num * Math.E;
        }
        return a;
    }

    /** IntArray overloaded method for integer array to string. */
    public String toStr(int[] a) {
        return Arrays.toString(a);
    }

    /** IntArray overloaded method for double array to string. */
    public String toStr(double[] a) {
        return Arrays.toString(a);
    }

    /** IntArray overloaded method for integer and double arrays to strings. */
    public String toStr(int[] a1, double[] a2) {
        return String.format(
                "Integer array: %s%n"
                        + "Double aray:   %s",
                Arrays.toString(a1),
                Arrays.toString(a2));
    }

    /** IntArray instance printout. */
    public String toString() {
        return String.format(
                "Integer array: %s%n%n"
                        + "%s %s %d%n%n"
                        + "Double array:  %s%n%n"
                        + "=== Another approach ===%n%n"
                        + "%s",
                toStr(list),
                toStr(list),
                hasInt() ? "has" : "doesn't have",
                list.length,
                toStr(getDbl()),
                toStr(list, getDbl()));
    }
}
