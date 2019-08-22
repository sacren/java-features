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
    /** IoStream constructor. */
    public IoStream() {
        copy();
    }

    /** IoStream method to copy the file. */
    public void copy() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/tmp/foo");
            out = new FileOutputStream("/tmp/bar");
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
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /** IoStream string method. */
    public String toString() {
        return "Copy file.";
    }
}
