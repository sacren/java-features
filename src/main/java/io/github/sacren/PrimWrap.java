/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -intObj:Integer
 * -strObj:Integer
 * -dblObj:Double
 * -charObj:Character
 * -boolObj:Boolean
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
    private Double dblObj;
    private Character charObj;
    private Boolean boolObj;

    /** PrimWrap constructor. */
    public PrimWrap() {
        intObj = new Integer(2019);
        strObj = new Integer("2019");
        dblObj = new Double(Math.PI);
        charObj = new Character('X');
        boolObj = new Boolean(true);
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "Integer object (int):    %d%n"
                        + "Integer object (String): %d%n"
                        + "Double object:           %f%n"
                        + "Character object:        %c%n"
                        + "Boolean object:          %b",
                intObj,
                strObj,
                dblObj,
                charObj,
                boolObj);
    }
}
