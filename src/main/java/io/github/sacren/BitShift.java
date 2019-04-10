/**
 * BitShift class for bit shift operations.
 *
 * <p>Public methods:
 * +toString():String
 */
public class BitShift {
    /** BitShift instance printout. */
    public String toString() {
        int x = 0xAAAA_5555;
        int y = 0x5555_1111;
        int z = 0x80000000; /* MAX_VALUE + 1 */
        int p = z >>> 1;
        String s = "";
        s += String.format("0xAAAA5555       = %d%n", x);
        s += String.format("0xAAAA5555       = %X%n", x);
        s += String.format("0xAAAA5555 << 1  = %X%n", x << 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        s += String.format("0xAAAA5555 << 1  =  %s%n", Integer.toBinaryString(x << 1));
        s += String.format("0x7FFFFFFF       = %d%n", Integer.MAX_VALUE);
        s += String.format("0x7FFFFFFF       =  %s%n", Integer.toBinaryString(Integer.MAX_VALUE));
        s += String.format("0x7FFFFFFF << 1  = %s%n",
                                                Integer.toBinaryString(Integer.MAX_VALUE << 1));
        s += String.format("0x7FFFFFFF << 2  = %s%n",
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
        s += String.format(
                "0x7FFFFFFF << 31        = %d%n",
                Integer.MAX_VALUE << 31);
        s += String.format(
                "0x7FFFFFFF << 31 | 0x01 = %d%n",
                Integer.MAX_VALUE << 31 | 0x01);
        s += String.format("0x80000000       = %d%n", Integer.MIN_VALUE);
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(Integer.MIN_VALUE));
        s += String.format("0x80000000 << 1  = %s%n",
                                                Integer.toBinaryString(Integer.MIN_VALUE << 1));
        s += String.format("0x80000000 << 1  = %d%n", Integer.MIN_VALUE << 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        s += String.format("0xAAAA5555 >> 1  = %s%n", Integer.toBinaryString(x >> 1));
        s += String.format("0xAAAA5555 >> 1  = %d%n", x >> 1);
        s += String.format("0xAAAA5555 >> 1  = %X%n", x >> 1);
        s += String.format("0x55551111       = %s%n", Integer.toBinaryString(y));
        s += String.format("0x55551111 >> 1  = %d%n", y >> 1);
        s += String.format("0x55551111 >> 1  = %X%n", y >> 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        s += String.format("0xAAAA5555 >>> 1 =  %s%n", Integer.toBinaryString(x >>> 1));
        s += String.format("0xAAAA5555 >>> 1 = %d%n", x >>> 1);
        s += String.format("0xAAAA5555 >>> 1 = %X%n", x >>> 1);
        s += String.format("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        s += String.format("0x55551111       =  %s%n", Integer.toBinaryString(y));
        s += String.format("0x55551111 >>> 1 =   %s%n", Integer.toBinaryString(y >>> 1));
        s += String.format("0x55551111 >>> 1 = %d%n", y >>> 1);
        s += String.format("0x55551111 >>> 1 = %X%n", y >>> 1);
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(z));
        s += String.format("0x80000000 >> 1  = %s%n", Integer.toBinaryString(z >> 1));
        s += String.format("0x80000000 >>> 1 =  %s%n", Integer.toBinaryString(z >>> 1));
        s += String.format("0x80000000 >>> 1 = %d%n", z >>> 1);
        s += String.format("0x80000000 >>> 1 = %X%n", z >>> 1);
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(z));
        s += String.format("0x80000000 >> 1  = %s%n", Integer.toBinaryString(z >> 1));
        s += String.format("0x80000000 / 2   = %s%n", Integer.toBinaryString(z / 2));
        s += String.format("0x80000000 >> 2  = %s%n", Integer.toBinaryString(z >> 2));
        s += String.format("0x80000000 / 4   = %s%n", Integer.toBinaryString(z / 4));
        s += String.format("0x80000000 >> 3  = %s%n", Integer.toBinaryString(z >> 3));
        s += String.format("0x80000000 / 8   = %s%n", Integer.toBinaryString(z / 8));
        s += String.format("0x80000000       = %s%n", Integer.toBinaryString(z));
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
