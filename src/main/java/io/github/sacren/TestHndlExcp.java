/**
 * Test driver for HndlExcp class.
 */
import static java.lang.System.out;

import java.io.FileNotFoundException;

public class TestHndlExcp {
    /** HndlExcp test driver. */
    public static void main(String[] args) {
        out.println();
        try {
            HndlExcp excp = new HndlExcp();
            out.println(excp);
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
    }
}
