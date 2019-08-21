/**
 * Test driver for NumFormat class.
 */
import static java.lang.System.out;

public class TestNumFormat {
    /** NumFormat test driver. */
    public static void main(String[] args) {
        out.println();
        out.println("=== NumberFormatException ===");
        out.println();
        NumFormat nf = new NumFormat();
        try {
            out.println(nf);
        } catch (NumberFormatException excp) {
            excp.printStackTrace();
        } finally {
            out.println();
            out.println("=== NumberFormatException ===");
        }
    }
}
