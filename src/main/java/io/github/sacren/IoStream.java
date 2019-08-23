/**
 * IoStream class.
 *
 * Constructor:
 * +IoStream()
 *
 * Public methods:
 * +copy():void
 * +toString():String
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream {
    /* private instance data */
    private String inFile = "/tmp/foo";
    private String outFile = "/tmp/bar";

    /** IoStream constructor. */
    public IoStream() {
        copy();
    }

    /** IoStream method to copy the file. */
    public void copy() {
        try (FileInputStream in = new FileInputStream(inFile);
             FileOutputStream out = new FileOutputStream(outFile)) {
            int oneByte;
            for ( ; ; ) {
                oneByte = in.read();
                if (oneByte == -1) {
                    break;
                }
                out.write(oneByte);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /** IoStream string method. */
    public String toString() {
        return "Copy file.";
    }
}
