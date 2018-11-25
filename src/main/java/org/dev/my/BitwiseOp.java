/** Test bitwise operation. */
public class BitwiseOp {
    /** Test bitwise opention. */
    public static void main(String[] args) {
        int x = 0xAAAA5555;
        int y = 0x55551111;
        int z = 0x80000000; /* MAX_VALUE + 1 */
        System.out.printf(
                "0xAAAA555 is %d%n"
                        + "0x55551111 is %d%n"
                        + "0xAAAA5555 & 0x55551111 = %9$s%n"
                        + "0xAAAA5555 | 0x55551111 = %10$s%n"
                        + "0xAAAA5555 ^ 0x55551111 = %11$s%n"
                        + "MAX_VALUE in hex  is %6$S%n"
                        + "MAX_VALUE in decimal is %5$d%n"
                        + "0x80000000 is %3$d%n"
                        + "MAX_VALUE in binary is %10$s%n"
                        + "0x80000000 in binary is %11$s%n",
                x, y, z, ~x,
                Integer.MAX_VALUE,
                Integer.toHexString(Integer.MAX_VALUE),
                Integer.toBinaryString(Integer.MAX_VALUE),
                Integer.toBinaryString(z),
                Integer.toBinaryString(x & y),
                Integer.toBinaryString(x | y),
                Integer.toBinaryString(x ^ y));
    }
}
