/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -intObj:Integer
 * -intObjStr:Integer
 * -dblObj:Double
 * -dblObjStr:Double
 * -charObj:Character
 * -byteObj:Byte
 * -byteObjStr:Byte
 * -boolObj:Boolean
 * -boolObjStr:Boolean
 *
 * <p>Constructor:
 * +PrimWrap()
 *
 * <p>Public methods:
 * +toString():String
 */
import static java.lang.Byte.MAX_VALUE;

public class PrimWrap {
    /* private instance data */
    private Integer intObj;
    private Integer intObjStr;
    private Double dblObj;
    private Double dblObjStr;
    private Character charObj;
    private Byte byteObj;
    private Byte byteObjStr;
    private Boolean boolObj;
    private Boolean boolObjStr;

    /** PrimWrap constructor. */
    public PrimWrap() {
        intObj = new Integer(2019);
        intObjStr = new Integer("2019");
        dblObj = new Double(Math.PI);
        dblObjStr = new Double(dblObj.toString());
        charObj = new Character('X');
        byteObj = new Byte(MAX_VALUE);
        byteObjStr = new Byte(byteObj.toString());
        boolObj = new Boolean(true);
        boolObjStr = new Boolean(boolObj.toString());
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "Integer object (int):     %d%n"
                        + "Integer object (String):  %d%n"
                        + "Double object (double):   %f%n"
                        + "Double object (String):   %f%n"
                        + "Character object:         %c%n"
                        + "Byte object (byte):       %d%n"
                        + "Byte object (String):     %d%n"
                        + "Boolean object (boolean): %b%n"
                        + "Boolean object (String):  %b",
                intObj,
                intObjStr,
                dblObj,
                dblObjStr,
                charObj,
                byteObj,
                byteObjStr,
                boolObj,
                boolObjStr);
    }
}
