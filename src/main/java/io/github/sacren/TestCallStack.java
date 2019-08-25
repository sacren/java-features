/**
 * Test driver for CallStack class.
 */
import static java.lang.System.out;

public class TestCallStack {
    /** CallStack test driver. */
    public static void main(String[] args) {
        out.println();
        out.println("=== Call stack ===");
        out.println();
        out.println("Enter main");
        CallStack cs = new CallStack();
        out.println("Exit main");
    }
}
