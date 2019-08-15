/**
 * Test driver for Exception class.
 */
import static java.lang.System.out;

import java.io.FileNotFoundException;

public class TestException {
    /** Exception test driver. */
    public static void main(String[] args) {
        out.println();
        try {
            Exception instance = new Exception();
            out.println(instance);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
