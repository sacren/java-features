/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -byteObj:Byte
 * -shortObj:Short
 * -intObj:Integer
 * -longObj:Long
 * -floatObj:Float
 * -dblObj:Double
 * -charObj:Character
 * -boolObj:Boolean
 *
 * <p>Constructor:
 * +PrimWrap()
 *
 * <p>Public methods:
 * +set():void
 * +getByte():byte
 * +toString():String
 */

public class PrimWrap {
    /* private instance data */
    private Byte byteObj;
    private Short shortObj;
    private Integer intObj;
    private Long longObj;
    private Float floatObj;
    private Double dblObj;
    private Character charObj;
    private Boolean boolObj;

    /** PrimWrap constructor. */
    public PrimWrap() {
        set();
    }

    /** PrimWrap setter of instance data. */
    public void set() {
        byteObj = new Byte(Byte.MAX_VALUE);
        shortObj = new Short(Short.MAX_VALUE);
        intObj = new Integer(Integer.MAX_VALUE);
        longObj = new Long(Long.MAX_VALUE);
        floatObj = new Float(Float.MAX_VALUE);
        dblObj = new Double(Double.MAX_VALUE);
        charObj = new Character('X');
        boolObj = new Boolean(true);
    }

    /** PrimWrap getter for Byte object. */
    public byte getByte() {
        Number num = new Byte(byteObj.toString());
        return num.byteValue();
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "Byte object:            %d%n"
                        + "Byte object value:      %d%n"
                        + "Short object:           %d%n"
                        + "Short object value:     %d%n"
                        + "Integer object:         %d%n"
                        + "Integer object value:   %d%n"
                        + "Long object:            %d%n"
                        + "Long object value:      %d%n"
                        + "Float object:           %f%n"
                        + "Float object value:     %f%n"
                        + "Double object:          %f%n"
                        + "Double object value:    %f%n"
                        + "Character object:       %c%n"
                        + "Character object value: %c%n"
                        + "Boolean object:         %b%n"
                        + "Boolean object value:   %b%n%n"
                        + "=== Number and Byte wrappers ===%n%n"
                        + "Number object in Byte value: %d",
                byteObj,
                byteObj.byteValue(),
                shortObj,
                shortObj.shortValue(),
                intObj,
                intObj.intValue(),
                longObj,
                longObj.longValue(),
                floatObj,
                floatObj.floatValue(),
                dblObj,
                dblObj.doubleValue(),
                charObj,
                charObj.charValue(),
                boolObj,
                boolObj.booleanValue(),
                getByte());
    }
}
