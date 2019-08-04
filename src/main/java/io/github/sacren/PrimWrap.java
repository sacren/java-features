/**
 * PrimWrap class.
 *
 * <p>Private instance data:
 * -byteObj:Byte
 * -byteObjStr:Byte
 * -shortObj:Short
 * -shortObjStr:Short
 * -intObj:Integer
 * -intObjStr:Integer
 * -longObj:Long
 * -longObjStr:Long
 * -floatObj:Float
 * -floatObjDbl:Float
 * -floatObjStr:Float
 * -dblObj:Double
 * -dblObjStr:Double
 * -charObj:Character
 * -boolObj:Boolean
 * -boolObjStr:Boolean
 *
 * <p>Constructor:
 * +PrimWrap()
 *
 * <p>Public methods:
 * +toString():String
 */

public class PrimWrap {
    /* private instance data */
    private Byte byteObj;
    private Byte byteObjStr;
    private Short shortObj;
    private Short shortObjStr;
    private Integer intObj;
    private Integer intObjStr;
    private Long longObj;
    private Long longObjStr;
    private Float floatObj;
    private Float floatObjDbl;
    private Float floatObjStr;
    private Double dblObj;
    private Double dblObjStr;
    private Character charObj;
    private Boolean boolObj;
    private Boolean boolObjStr;

    /** PrimWrap constructor. */
    public PrimWrap() {
        byteObj = new Byte(Byte.MAX_VALUE);
        byteObjStr = new Byte(byteObj.toString());
        shortObj = new Short(Short.MAX_VALUE);
        shortObjStr = new Short(shortObj.toString());
        intObj = new Integer(2019);
        intObjStr = new Integer("2019");
        longObj = new Long(Long.MAX_VALUE);
        longObjStr = new Long(longObj.toString());
        floatObj = new Float(Float.MAX_VALUE);
        floatObjDbl = new Float(Math.E);
        floatObjStr = new Float(floatObj.toString());
        dblObj = new Double(Math.PI);
        dblObjStr = new Double(dblObj.toString());
        charObj = new Character('X');
        boolObj = new Boolean(true);
        boolObjStr = new Boolean(boolObj.toString());
    }

    /** PrimWrap string method. */
    public String toString() {
        return String.format(
                "Byte object (byte):       %d%n"
                        + "Byte object (String):     %d%n"
                        + "Byte object value:        %d%n"
                        + "Short object (short):     %d%n"
                        + "Short object (String):    %d%n"
                        + "Short object value:       %d%n"
                        + "Integer object (int):     %d%n"
                        + "Integer object (String):  %d%n"
                        + "Integer object value:     %d%n"
                        + "Long object (long):       %d%n"
                        + "Long object (String):     %d%n"
                        + "Long object value:        %d%n"
                        + "Float object (float):     %f%n"
                        + "Float object (double):    %f%n"
                        + "Float object (String):    %f%n"
                        + "Float object value:       %f%n"
                        + "Double object (double):   %f%n"
                        + "Double object (String):   %f%n"
                        + "Double object value:      %f%n"
                        + "Character object:         %c%n"
                        + "Character object value:   %c%n"
                        + "Boolean object (boolean): %b%n"
                        + "Boolean object (String):  %b%n"
                        + "Boolean object value:     %b",
                byteObj,
                byteObjStr,
                byteObj.byteValue(),
                shortObj,
                shortObjStr,
                shortObj.shortValue(),
                intObj,
                intObjStr,
                intObj.intValue(),
                longObj,
                longObjStr,
                longObj.longValue(),
                floatObj,
                floatObjDbl,
                floatObjStr,
                floatObj.floatValue(),
                dblObj,
                dblObjStr,
                dblObj.doubleValue(),
                charObj,
                charObj.charValue(),
                boolObj,
                boolObjStr,
                boolObj.booleanValue());
    }
}
