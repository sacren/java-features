/**
 * ListFile class for the contents of directory.
 *
 * <p>Private instance data:
 * -dir:File
 *
 * <p>Constructor:
 * +ListFile()
 *
 * <p>Public methods:
 * +getList():String
 * +toString():String
 */
import java.io.File;

public class ListFile {
    /* private instance data */
    private File dir;

    /** ListFile constructor. */
    public ListFile(String path) {
        dir = new File(path);
    }

    /** ListFile getter for directory contents. */
    public String getList() {
        StringBuilder sb = new StringBuilder();
        boolean once = true;
        for (File name : dir.listFiles()) {
            if (once) {
                once = false;
                sb.append(name);
                continue;
            }
            sb.append(String.format("%n")).append(name);
        }
        return sb.toString();
    }

    /** ListFile string method. */
    public String toString() {
        return String.format(
                "=== List current directory ===%n%n"
                        + "%s",
                getList());
    }
}
