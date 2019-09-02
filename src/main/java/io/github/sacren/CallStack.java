/**
 * CallStack class.
 *
 * <p>Constructor:
 * +CallStack()
 *
 * <p>Public methods:
 * +methodA():void
 * +methodA():void
 * +methodA():void
 * +toString():String
 */
public class CallStack {
    /* private data */
    private StringBuilder msg;

    /** CallStack constructor. */
    public CallStack() {
        msg = new StringBuilder();
        methodA();
    }

    /** CallStack method for methodA. */
    public void methodA() {
        msg.append(String.format("Enter method A%n"));
        methodB();
        msg.append("Exit method A");
    }

    /** CallStack method for methodB. */
    public void methodB() {
        msg.append(String.format("Enter method B%n"));
        methodC();
        msg.append(String.format("Exit method B%n"));
    }

    /** CallStack method for methodC. */
    public void methodC() {
        msg.append(String.format("Enter method C%n"));
        msg.append(String.format("Exit method C%n"));
    }

    /** CallStack string method. */
    public String toString() {
        return msg.toString();
    }
}
