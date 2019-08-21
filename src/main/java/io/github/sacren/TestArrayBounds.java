/**
 * Test driver for ArrayBounds class.
 */
import static java.lang.System.out;

public class TestArrayBounds {
    /** ArrayBounds test driver. */
    public static void main(String[] args) {
        out.println();
        try {
            ArrayBounds bounds = new ArrayBounds();
            out.println(bounds);
        } catch (ArrayIndexOutOfBoundsException excp) {
            excp.printStackTrace();
        }
    }
}
