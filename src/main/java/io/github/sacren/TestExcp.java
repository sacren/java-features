/**
 * Test driver for SuperExcep and SubExcp.
 */
import static java.lang.System.out;

import java.io.FileNotFoundException;

public class TestExcp {
    /** SuperExcp, SubExcp test driver. */
    public static void main(String[] args) {
        try {
            SubExcp subExcp = new SubExcp();
        } catch (FileNotFoundException excp) {
            excp.printStackTrace();
            out.println(excp.getMessage());
            out.println(excp.toString());
        }
    }
}
