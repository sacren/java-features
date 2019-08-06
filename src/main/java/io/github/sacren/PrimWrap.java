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
        byteObj = Byte.MAX_VALUE;
        shortObj = Short.MAX_VALUE;
        intObj = Integer.MAX_VALUE;
        longObj = Long.MAX_VALUE;
        floatObj = Float.MAX_VALUE;
        dblObj = Double.MAX_VALUE;
        charObj = 'X';
        boolObj = true;
    }

    /** PrimWrap getter for Byte object. */
    public Byte getByte() {
        Number num = byteObj;
        return num.byteValue(); /* auto-box to Byte */
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "=== Wrapper classes for primitive types ===%n%n"
                        + "Byte object:            %d%n"
                        + "Short object:           %d%n"
                        + "Integer object:         %d%n"
                        + "Long object:            %d%n"
                        + "Float object:           %f%n"
                        + "Double object:          %f%n"
                        + "Character object:       %c%n"
                        + "Boolean object:         %b%n%n"
                        + "=== Number and Byte wrappers ===%n%n"
                        + "Number object in Byte value: %d%n%n"
                        + "=== Parse Byte string ===%n%n"
                        + "%d",
                byteObj,
                shortObj,
                intObj,
                longObj,
                floatObj,
                dblObj,
                charObj,
                boolObj,
                getByte(),
                Byte.parseByte(byteObj.toString()));
    }
}
