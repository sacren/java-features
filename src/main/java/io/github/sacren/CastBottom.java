/**
 * CastBottom subclass extends CastMiddle superclass.
 *
 * <p>Constructor:
 * +CastMiddle()
 *
 * <p>Public methods:
 * +toString():String
 */
public class CastBottom extends CastMiddle {
    /** CastBottom default constructor. */
    public CastBottom() {
        super();
    }

    /** CastBottom description. */
    @Override
    public String toString() {
        return "This is CastBottom subclass.";
    }
}
