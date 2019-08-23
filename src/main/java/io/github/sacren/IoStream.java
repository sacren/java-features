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
        String inFile = "/tmp/foo";
        String outFile = "/tmp/bar";
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(inFile);
            out = new FileOutputStream(outFile);
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
            } catch (NullPointerException ex) {
                ex.printStackTrace();
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
