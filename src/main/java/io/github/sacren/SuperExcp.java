/**
 * SuperExcp class.
 */
import java.io.FileNotFoundException;

public class SuperExcp {
    /** SuperExcp constructor. */
    public SuperExcp() throws FileNotFoundException {
        hndlExcp();
    }

    /** SuperExcp method for exception. */
    public void hndlExcp() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /** SuperExcp string method. */
    public String toString() {
        return "SuperExcp";
    }
}
