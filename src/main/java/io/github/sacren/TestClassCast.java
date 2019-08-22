/**
 * Test driver for ClassCast class.
 */
import static java.lang.System.out;

public class TestClassCast {
    /** ClassCast test driver. */
    public static void main(String[] args) {
        out.println();
        out.println("=== ClassCastException ===");
        out.println();
        ClassCast cc = new ClassCast();
        try {
            out.println(cc);
        } catch (ClassCastException excp) {
            excp.printStackTrace();
        } finally {
            out.println();
            out.println("=== ClassCastException ===");
        }
    }
}
