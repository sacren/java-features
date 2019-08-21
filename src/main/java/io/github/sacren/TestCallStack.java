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
        try {
            CallStack cs = new CallStack();
        } catch (ArithmeticException excp) {
            excp.printStackTrace();
        } catch (Exception excp) {
            out.println(excp.getMessage());
        } finally {
            out.println();
            out.println("=== Exception or not, finally block is certain to execute! ===");
            out.println();
        }
        out.println("Exit main");
    }
}