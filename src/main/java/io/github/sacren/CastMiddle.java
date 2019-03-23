/**
 * CastMiddle subclass extends CastTop superclass.
 *
 * <p>Constructor:
 * +CastMiddle()
 *
 * <p>Public methods:
 * +toString():String
 */
public class CastMiddle extends CastTop {
    /** CastMiddle default constructor. */
    public CastMiddle() {
        super();
    }

    /** CastMiddle description. */
    @Override
    public String toString() {
        return "This is CastMiddle subclass and superclass.";
    }
}
