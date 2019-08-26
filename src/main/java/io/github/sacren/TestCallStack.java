/**
 * Test driver for CallStack class.
 */
import static java.lang.System.out;

import java.io.FileNotFoundException;

public class TestCallStack {
    /** CallStack test driver. */
    public static void main(String[] args) {
        out.println();
        out.println("=== Call stack ===");
        out.println();
        out.println("Enter main method");
        out.println();
        try {
            CallStack cs = new CallStack();
        } catch (FileNotFoundException ex) {
            out.println("Execution path diverges at this point...");
            out.println(ex.getMessage());
        } finally {
            out.println("Do cleanup in finally block");
        }
        out.println();
        out.println("Exit main method");
    }
}
