/** Bit-shift operation. */
public class Bitshift {
    /** Test bit-shift. */
    public static void main(String[] args) {
        int x = 0xAAAA_5555;
        int y = 0x5555_1111;
        int z = 0x80000000; /* MAX_VALUE + 1 */
        System.out.printf("0xAAAA5555      = %d%n", x);
        System.out.printf("0xAAAA5555      = %X%n", x);
        System.out.printf("0xAAAA5555 << 1 = %X%n", x << 1);
        System.out.printf("0xAAAA5555      = %s%n", Integer.toBinaryString(x));
        System.out.printf("0xAAAA5555 << 1 =  %s%n", Integer.toBinaryString(x << 1));
    }
}
