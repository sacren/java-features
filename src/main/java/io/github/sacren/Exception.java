/**
 * Exception class for exception handling.
 *
 * <p>Private instance data:
 * -name:File
 *
 * <p>Constructor:
 * +Exception()
 *
 * <p>Public methods:
 * +handleExp():void
 * +toString():String
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    /* private instance data */
    private File name = new File("/timbuktu");

    /** Exception constructor. */
    public Exception() {
        handleExp();
    }

    /** Exception method to handle exception. */
    public void handleExp() {
        try {
            Scanner in = new Scanner(name);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /** Exception string method. */
    public String toString() {
        return  String.format("%nException handling");
    }
}
