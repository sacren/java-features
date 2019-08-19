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
    public CallStack() throws ArithmeticException {
        methodA();
    }

    /** CallStack methodA. */
    public void methodA() throws ArithmeticException {
        out.println("Enter method A");
        methodB();
        out.println("Exit method A");
    }

    /** CallStack methodB. */
    public void methodB() throws ArithmeticException {
        out.println("Enter method B");
        methodC();
        out.println("Exit method B");
    }

    /** CallStack methodC. */
    public void methodC() throws ArithmeticException {
        out.println("Enter method C");
        int div = 1 / 0;
        out.println("Exit method C");
    }

    /** CallStack string method. */
    public String toString() {
        return msg.toString();
    }
}
