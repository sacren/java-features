/** Test bitwise operation. */
public class BitwiseOp {
    /** Test bitwise opention. */
    public static void main(String[] args) {
        int x = 0xAAAA5555;
        int y = 0x55551111;
        int z = 0x80000000; /* MAX_VALUE + 1 */
        System.out.printf(
                "0xAAAA555 is %d%n"
                        + "~0xAAAA5555 = %4$8X%n"
                        + "~0xAAAA5555 = %17$s%n"
                        + "~0xAAAA5555 = %4$d%n"
                        + "0x55551111 is %d%n"
                        + "0xAAAA5555 & 0x55551111 = %12$S%n"
                        + "0xAAAA5555 = %15$s%n"
                        + "0x55551111 = %16$s%n"
                        + "0xAAAA5555 & 0x55551111 = %9$s%n"
                        + "0xAAAA5555 | 0x55551111 = %13$S%n"
                        + "0xAAAA5555 = %15$s%n"
                        + "0x55551111 = %16$s%n"
                        + "0xAAAA5555 | 0x55551111 = %10$s%n"
                        + "0xAAAA5555 ^ 0x55551111 = %14$S%n"
                        + "0xAAAA5555 = %15$S%n"
                        + "0x55551111 = %16$S%n"
                        + "0xAAAA5555 ^ 0x55551111 = %11$s%n"
                        + "MAX_VALUE (hex) = %6$S%n"
                        + "MAX_VALUE (decimal) = %5$d%n"
                        + "0x80000000 (decimal) = %3$d%n"
                        + "MAX_VALUE  = 0%7$s%n"
                        + "0x80000000 = %8$s%n",
                x, y, z, ~x,
                Integer.MAX_VALUE,
                Integer.toHexString(Integer.MAX_VALUE),
                Integer.toBinaryString(Integer.MAX_VALUE),
                Integer.toBinaryString(z),
                Integer.toBinaryString(x & y),
                Integer.toBinaryString(x | y),
                Integer.toBinaryString(x ^ y),
                Integer.toHexString(x & y),
                Integer.toHexString(x | y),
                Integer.toHexString(x ^ y),
                Integer.toBinaryString(x),
                Integer.toBinaryString(y),
                Integer.toBinaryString(~x));
    }
}
