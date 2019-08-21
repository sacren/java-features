/**
 * Test driver for NullPointer class.
 */
import static java.lang.System.out;

public class TestNullPointer {
    /** NullPointer test driver. */
    public static void main(String[] args) {
        out.println();
        out.println("=== NullPointerException ===");
        out.println();
        NullPointer np = new NullPointer();
        try {
            out.println(np);
        } catch (NullPointerException excp) {
            excp.printStackTrace();
        } finally {
            out.println();
            out.println("=== NullPointerException ===");
        }
    }
}
