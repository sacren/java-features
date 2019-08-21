/**
 * NumFormat class for exception handling.
 *
 * <p>Constructor:
 * +NumFormat()
 *
 * <p>Public methods:
 * +toString():String
 */
public class NumFormat {
    /** NumFormat constructor. */
    public NumFormat() {
    }

    /** NumFormat string method. */
    public String toString() {
        return String.format("%d%n", Integer.parseUnsignedInt("xyz"));
    }
}
