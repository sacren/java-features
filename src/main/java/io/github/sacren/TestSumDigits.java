/**
 * Sum up the individual digits of a positive integer in command line.
 */
public class TestSumDigits {
    /** SumDigits test driver. */
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Invalid argument!");
        }
        if (Integer.parseInt(args[0]) < 0) {
            throw new IllegalArgumentException(
                    "Can't have negative number!");
        }
        System.out.println();
        System.out.println("=== Sum of digits ===");
        System.out.println();
        System.out.println(new SumDigits(args[0].toCharArray()));
    }
}
