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
        out.println("Enter main");
        try {
            CallStack cs = new CallStack();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        out.println("Exit main");
    }
}
