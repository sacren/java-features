/** Bit-shift operation. */
public class TestBitshift {
    /** Test bit-shift. */
    public static void main(String[] args) {
        int x = 0xAAAA_5555;
        int y = 0x5555_1111;
        int z = 0x80000000; /* MAX_VALUE + 1 */
        int p = z >>> 1;
        System.out.printf("0xAAAA5555       = %d%n", x);
        System.out.printf("0xAAAA5555       = %X%n", x);
        System.out.printf("0xAAAA5555 << 1  = %X%n", x << 1);
        System.out.printf("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        System.out.printf("0xAAAA5555 << 1  =  %s%n", Integer.toBinaryString(x << 1));
        System.out.printf("0x7FFFFFFF       = %d%n", Integer.MAX_VALUE);
        System.out.printf("0x7FFFFFFF       =  %s%n", Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.printf("0x7FFFFFFF << 1  = %s%n",
                                                Integer.toBinaryString(Integer.MAX_VALUE << 1));
        System.out.printf("0x7FFFFFFF << 2  = %s%n",
                                                Integer.toBinaryString(Integer.MAX_VALUE << 2));
        System.out.printf(
                "0x7FFFFFFF << 31        = %s%n",
                Integer.toBinaryString(Integer.MAX_VALUE << 31));
        System.out.printf(
                "0x7FFFFFFF << 31 | 0x01 = %s%n",
                Integer.toBinaryString(Integer.MAX_VALUE << 31 | 0x01));
        System.out.printf("0x7FFFFFFF << 31 = %X%n", Integer.MAX_VALUE << 31);
        System.out.printf("0x7FFFFFFF << 1  = %d%n", Integer.MAX_VALUE << 1);
        System.out.printf("0x7FFFFFFF << 2  = %d%n", Integer.MAX_VALUE << 2);
        System.out.printf(
                "0x7FFFFFFF << 31        = %d%n",
                Integer.MAX_VALUE << 31);
        System.out.printf(
                "0x7FFFFFFF << 31 | 0x01 = %d%n",
                Integer.MAX_VALUE << 31 | 0x01);
        System.out.printf("0x80000000       = %d%n", Integer.MIN_VALUE);
        System.out.printf("0x80000000       = %s%n", Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.printf("0x80000000 << 1  = %s%n",
                                                Integer.toBinaryString(Integer.MIN_VALUE << 1));
        System.out.printf("0x80000000 << 1  = %d%n", Integer.MIN_VALUE << 1);
        System.out.printf("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        System.out.printf("0xAAAA5555 >> 1  = %s%n", Integer.toBinaryString(x >> 1));
        System.out.printf("0xAAAA5555 >> 1  = %d%n", x >> 1);
        System.out.printf("0xAAAA5555 >> 1  = %X%n", x >> 1);
        System.out.printf("0x55551111       = %s%n", Integer.toBinaryString(y));
        System.out.printf("0x55551111 >> 1  = %d%n", y >> 1);
        System.out.printf("0x55551111 >> 1  = %X%n", y >> 1);
        System.out.printf("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        System.out.printf("0xAAAA5555 >>> 1 =  %s%n", Integer.toBinaryString(x >>> 1));
        System.out.printf("0xAAAA5555 >>> 1 = %d%n", x >>> 1);
        System.out.printf("0xAAAA5555 >>> 1 = %X%n", x >>> 1);
        System.out.printf("0xAAAA5555       = %s%n", Integer.toBinaryString(x));
        System.out.printf("0x55551111       =  %s%n", Integer.toBinaryString(y));
        System.out.printf("0x55551111 >>> 1 =   %s%n", Integer.toBinaryString(y >>> 1));
        System.out.printf("0x55551111 >>> 1 = %d%n", y >>> 1);
        System.out.printf("0x55551111 >>> 1 = %X%n", y >>> 1);
        System.out.printf("0x80000000       = %s%n", Integer.toBinaryString(z));
        System.out.printf("0x80000000 >> 1  = %s%n", Integer.toBinaryString(z >> 1));
        System.out.printf("0x80000000 >>> 1 =  %s%n", Integer.toBinaryString(z >>> 1));
        System.out.printf("0x80000000 >>> 1 = %d%n", z >>> 1);
        System.out.printf("0x80000000 >>> 1 = %X%n", z >>> 1);
        System.out.printf("0x80000000       = %s%n", Integer.toBinaryString(z));
        System.out.printf("0x80000000 >> 1  = %s%n", Integer.toBinaryString(z >> 1));
        System.out.printf("0x80000000 / 2   = %s%n", Integer.toBinaryString(z / 2));
        System.out.printf("0x80000000 >> 2  = %s%n", Integer.toBinaryString(z >> 2));
        System.out.printf("0x80000000 / 4   = %s%n", Integer.toBinaryString(z / 4));
        System.out.printf("0x80000000 >> 3  = %s%n", Integer.toBinaryString(z >> 3));
        System.out.printf("0x80000000 / 8   = %s%n", Integer.toBinaryString(z / 8));
        System.out.printf("0x80000000       = %s%n", Integer.toBinaryString(z));
        System.out.printf("0x40000000       =  %s%n", Integer.toBinaryString(p));
        System.out.printf("0x40000000 >> 1  =   %s%n", Integer.toBinaryString(p >> 1));
        System.out.printf("0x40000000 / 2   =   %s%n", Integer.toBinaryString(p / 2));
        System.out.printf("0x40000000 >> 2  =    %s%n", Integer.toBinaryString(p >> 2));
        System.out.printf("0x40000000 / 4   =    %s%n", Integer.toBinaryString(p / 4));
        System.out.printf("0x40000000 >> 3  =     %s%n", Integer.toBinaryString(p >> 3));
        System.out.printf("0x40000000 / 8   =     %s%n", Integer.toBinaryString(p / 8));
        System.out.printf("0x00             = %s%n", Integer.toBinaryString(0));
        System.out.printf("0x00 >> 1        = %s%n", Integer.toBinaryString(0 >> 1));
    }
}
