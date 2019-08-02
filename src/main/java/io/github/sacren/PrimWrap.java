/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -intObj:Integer
 * -strObj:Integer
 *
 * <p>Constructor:
 * +PrimWrap()
 *
 * <p>Public methods:
 * +toString():String
 */

public class PrimWrap {
    /* private instance data */
    private Integer intObj;
    private Integer strObj;

    /** PrimWrap constructor. */
    public PrimWrap() {
        intObj = new Integer(2019);
        strObj = new Integer("2019");
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "Integer object (int):    %d%n"
                        + "Integer object (String): %d",
                intObj,
                strObj);
    }
}
