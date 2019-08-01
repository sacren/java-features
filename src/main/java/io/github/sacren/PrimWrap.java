/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -num:int
 * -str:String
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
    private final int num = 5566;
    private String str = "5566";

    /** PrimWrap getter for integer object. */
    public Integer getInt() {
        return new Integer(num);
    }

    /** PrimWrap getter for integer object by string. */
    public Integer getIntStr() {
        return new Integer(str);
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
