/**
 * HndlExcp class for exception handling.
 *
 * <p>Private instance data:
 * -name:File
 *
 * <p>Constructor:
 * +HndlExcp()
 *
 * <p>Public methods:
 * +set():void
 * +toString():String
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HndlExcp {
    /* private instance data */
    private File name = new File("/timbuktu");

    /** HndlExcp constructor. */
    public HndlExcp() throws FileNotFoundException {
        set();
    }

    /** HndlExcp setter for exception handling. */
    public void set() throws FileNotFoundException {
        Scanner in = new Scanner(name);
    }

    /** HndlExcp string method. */
    public String toString() {
        return  String.format("Exception handling");
    }
}
