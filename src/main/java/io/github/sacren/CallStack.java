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

public class CallStack {
    /* private data */
    private StringBuilder msg;

    /** CallStack constructor. */
    public CallStack() {
        methodA();
    }

    /** CallStack methodA. */
    public void methodA() {
        out.println("Enter method A");
        methodB();
        out.println("Exit method A");
    }

    /** CallStack methodB. */
    public void methodB() {
        out.println("Enter method B");
        methodC();
        out.println("Exit method B");
    }

    /** CallStack methodC. */
    public void methodC() {
        out.println("Enter method C");
        out.println("Exit method C");
    }

    /** CallStack string method. */
    public String toString() {
        return msg.toString();
    }
}
