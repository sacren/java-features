/**
 * ListDir class for the contents of directory.
 *
 * <p>Private instance data:
 * -dir:File
 *
 * <p>Constructor:
 * +ListDir()
 *
 * <p>Public methods:
 * +getList():String
 * +toString():String
 */
import java.io.File;

public class ListDir {
    /* private instance data */
    private File dir;
    private String path;

    /** ListDir constructor. */
    public ListDir() {
        path = "/tmp";
        dir = new File(path);
    }

    /** ListDir getter for directory contents. */
    public String getList() {
        if (!dir.isDirectory()) {
            return String.format("%s: No such file or directory", path);
        }
        StringBuilder sb = new StringBuilder();
        boolean once = true;
        for (String name : dir.list()) {
            if (once) {
                once = false;
                sb.append(name);
                continue;
            }
            sb.append(String.format("%n")).append(name);
        }
        return sb.toString();
    }

    /** ListDir string method. */
    public String toString() {
        return String.format(
                "=== List directory ===%n%n"
                        + "%s",
                getList());
    }
}
