/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -i:int
 * -s:String
 *
 * <p>Constructor:
 * +PrimWrap()
 *
 * <p>Public methods:
 * +getInt():Integer
 * +getIntStr():Integer
 * +toString():String
 */
public class PrimWrap {
    /* private instance data */
    private final int i = 5566;
    private String s = "5566";

    /** PrimWrap getter for integer object. */
    public Integer getInt() {
        return new Integer(i);
    }

    /** PrimWrap getter for integer object by string. */
    public Integer getIntStr() {
        return new Integer(s);
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "Integer object by int:    %d%n"
                        + "Integer object by string: %d",
                getInt(),
                getIntStr());
    }
}
