/**
 * CallStack class.
 *
 * <p>Constructor:
 * +CallStack()
 *
 * <p>Public methods:
 * +methodA():void
 * +methodB():void
 * +methodC():void
 * +toString():String
 */
import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CallStack {
    /* private data */
    private StringBuilder msg;

    /** CallStack constructor. */
    public CallStack() throws FileNotFoundException {
        methodA();
    }

    /** CallStack methodA. */
    public void methodA() throws FileNotFoundException {
        out.println("Enter method A");
        methodB();
        out.println("Exit method A");
    }

    /** CallStack methodB. */
    public void methodB() throws FileNotFoundException {
        out.println("Enter method B");
        methodC();
        out.println("Exit method B");
    }

    /** CallStack methodC. */
    public void methodC() throws FileNotFoundException {
        out.println("Enter method C");
        FileInputStream in = new FileInputStream("Ceere9ai");
        out.println("Exit method C");
    }

    /** CallStack string method. */
    public String toString() {
        return msg.toString();
    }
}
