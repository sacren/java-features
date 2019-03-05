/** Overflow demo. */
public class TestOverFlow {
    /** Display various overflows. */
    public static void main(String[] args) {
        System.out.printf(
                "int(max)            = %d%n"
                        + "int(max) + 1        = %d%n"
                        + "int(max) + 2        = %d%n"
                        + "int(max) * int(max) = %d%n"
                        + "int(max) + 1L       = %d%n"
                        + "int(min)            = %d%n"
                        + "int(min) + 1        = %d%n"
                        + "int(min) + 2        = %d%n"
                        + "int(min) * int(min) = %d%n"
                        + "int(min) - 1L       = %d%n",
                Integer.MAX_VALUE,
                Integer.MAX_VALUE + 1,
                Integer.MAX_VALUE + 2,
                Integer.MAX_VALUE + Integer.MAX_VALUE,
                Integer.MAX_VALUE + 1L,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE + 1,
                Integer.MIN_VALUE + 2,
                Integer.MIN_VALUE * Integer.MIN_VALUE,
                Integer.MIN_VALUE - 1L);
    }
}
