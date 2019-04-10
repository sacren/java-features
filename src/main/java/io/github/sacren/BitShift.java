/**
 * BitShift class for bit shift operations.
 *
 * <p>Public methods:
 * +toString():String
 */
public class BitShift {
    /** BitShift instance printout. */
    public String toString() {
        int num1 = 0xAAAA_5555;
        String s = "";
        s += String.format("0xAAAA5555       = %d%n", num1);
        s += String.format("0xAAAA5555       = %X%n", num1);
        s += String.format("0xAAAA5555 << 1  = %X%n", num1 << 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(num1));
        s += String.format("0xAAAA5555 << 1  =  %s%n", Integer.toBinaryString(num1 << 1));
        s += String.format("0x7FFFFFFF       = %d%n", Integer.MAX_VALUE);
        s += String.format("0x7FFFFFFF       =  %s%n", Integer.toBinaryString(Integer.MAX_VALUE));
        s += String.format(
                "0x7FFFFFFF << 1  = %s%n",
                Integer.toBinaryString(Integer.MAX_VALUE << 1));
        s += String.format(
                "0x7FFFFFFF << 2  = %s%n",
                Integer.toBinaryString(Integer.MAX_VALUE << 2));
        s += String.format(
                "0x7FFFFFFF << 31        = %s%n",
                Integer.toBinaryString(Integer.MAX_VALUE << 31));
        s += String.format(
                "0x7FFFFFFF << 31 | 0x01 = %s%n",
                Integer.toBinaryString(Integer.MAX_VALUE << 31 | 0x01));
        s += String.format("0x7FFFFFFF << 31 = %X%n", Integer.MAX_VALUE << 31);
        s += String.format("0x7FFFFFFF << 1  = %d%n", Integer.MAX_VALUE << 1);
        s += String.format("0x7FFFFFFF << 2  = %d%n", Integer.MAX_VALUE << 2);
        s += String.format("0x7FFFFFFF << 31        = %d%n", Integer.MAX_VALUE << 31);
        s += String.format("0x7FFFFFFF << 31 | 0x01 = %d%n", Integer.MAX_VALUE << 31 | 0x01);
        s += String.format("0x80000000       = %d%n", Integer.MIN_VALUE);
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(Integer.MIN_VALUE));
        s += String.format(
                "0x80000000 << 1  = %s%n",
                Integer.toBinaryString(Integer.MIN_VALUE << 1));
        s += String.format("0x80000000 << 1  = %d%n", Integer.MIN_VALUE << 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(num1));
        s += String.format("0xAAAA5555 >> 1  = %s%n", Integer.toBinaryString(num1 >> 1));
        s += String.format("0xAAAA5555 >> 1  = %d%n", num1 >> 1);
        s += String.format("0xAAAA5555 >> 1  = %X%n", num1 >> 1);
        /* a different integer */
        int num2 = 0x5555_1111;
        s += String.format("0x55551111       = %s%n", Integer.toBinaryString(num2));
        s += String.format("0x55551111 >> 1  = %d%n", num2 >> 1);
        s += String.format("0x55551111 >> 1  = %X%n", num2 >> 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(num1));
        s += String.format("0xAAAA5555 >>> 1 =  %s%n", Integer.toBinaryString(num1 >>> 1));
        s += String.format("0xAAAA5555 >>> 1 = %d%n", num1 >>> 1);
        s += String.format("0xAAAA5555 >>> 1 = %X%n", num1 >>> 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(num1));
        s += String.format("0x55551111       =  %s%n", Integer.toBinaryString(num2));
        s += String.format("0x55551111 >>> 1 =   %s%n", Integer.toBinaryString(num2 >>> 1));
        s += String.format("0x55551111 >>> 1 = %d%n", num2 >>> 1);
        s += String.format("0x55551111 >>> 1 = %X%n", num2 >>> 1);
        /* another integer */
        int maxPlus1 = 0x80000000; /* MAX_VALUE + 1 */
        int num3 = maxPlus1;
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(num3));
        s += String.format("0x80000000 >> 1  = %s%n", Integer.toBinaryString(num3 >> 1));
        s += String.format("0x80000000 >>> 1 =  %s%n", Integer.toBinaryString(num3 >>> 1));
        s += String.format("0x80000000 >>> 1 = %d%n", num3 >>> 1);
        s += String.format("0x80000000 >>> 1 = %X%n", num3 >>> 1);
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(num3));
        s += String.format("0x80000000 >> 1  = %s%n", Integer.toBinaryString(num3 >> 1));
        s += String.format("0x80000000 / 2   = %s%n", Integer.toBinaryString(num3 / 2));
        s += String.format("0x80000000 >> 2  = %s%n", Integer.toBinaryString(num3 >> 2));
        s += String.format("0x80000000 / 4   = %s%n", Integer.toBinaryString(num3 / 4));
        s += String.format("0x80000000 >> 3  = %s%n", Integer.toBinaryString(num3 >> 3));
        s += String.format("0x80000000 / 8   = %s%n", Integer.toBinaryString(num3 / 8));
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(num3));
        /* unsigned-extended right shift padded with zero */
        int p = maxPlus1 >>> 1;
        s += String.format("0x40000000       =  %s%n", Integer.toBinaryString(p));
        s += String.format("0x40000000 >> 1  =   %s%n", Integer.toBinaryString(p >> 1));
        s += String.format("0x40000000 / 2   =   %s%n", Integer.toBinaryString(p / 2));
        s += String.format("0x40000000 >> 2  =    %s%n", Integer.toBinaryString(p >> 2));
        s += String.format("0x40000000 / 4   =    %s%n", Integer.toBinaryString(p / 4));
        s += String.format("0x40000000 >> 3  =     %s%n", Integer.toBinaryString(p >> 3));
        s += String.format("0x40000000 / 8   =     %s%n", Integer.toBinaryString(p / 8));
        s += String.format("0x00             = %s%n", Integer.toBinaryString(0));
        s += String.format("0x00 >> 1        = %s", Integer.toBinaryString(0 >> 1));
        return s;
    }
}
