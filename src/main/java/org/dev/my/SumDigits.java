/** Sum up the individual digits of a positive integer in command line. */
public class SumDigits {
    /** Display the effect of command argument. */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No argument.");
            return;
        }
        if (Integer.parseInt(args[0]) < 0) {
            System.out.println("Can't be negative number.");
            return;
        }
        String digitString = "";
        int sum = 0;
        int index = 0;
        char[] charArray = args[0].toCharArray();
        for (char c: charArray) {
            sum += Character.digit(c, 10);
            if (index++ == charArray.length - 1) {
                digitString += Character.toString(c);
                break;
            }
            digitString += Character.toString(c) + " + ";
        }
        System.out.printf("Sum of digits: %s = %d%n", digitString, sum);
    }
}
