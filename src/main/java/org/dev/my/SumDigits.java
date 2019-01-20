/**
 * Sum up the individual digits of a positive integer in command line.
 */
public class SumDigits {
    /** Show the effect of command argument. */
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Missing argument!");
        }
        if (Integer.parseInt(args[0]) < 0) {
            throw new IllegalArgumentException("Argument can't be negative number!");
        }
        char[] charArray = args[0].toCharArray();
        int sum;
        sum = Character.digit(charArray[0], 10);
        String digitString;
        digitString = Character.toString(charArray[0]);
        int index = 0;
        for (char c: charArray) {
            if (index++ == 0) {
                continue;
            }
            sum += Character.digit(c, 10);
            digitString += " + " + Character.toString(c);
        }
        System.out.printf("Sum of digits: %s = %d%n", digitString, sum);
    }
}
