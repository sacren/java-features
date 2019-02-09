/** Test arithmetic operations. */
public class TestArithmetic {
    /** Run elementary arithmetic. */
    public static void main(String[] args) {
        final int number1 = 98;
        final int number2 = 5;
        final int sum = number1 + number2;
        final int difference = number1 - number2;
        final int product = number1 * number2;
        final int quotient = number1 / number2;
        final int remainder = number1 % number2;
        final int multiSum = number1 * 31 + number2 * 17;

        System.out.printf(
                "The sum, difference, product, quotient and remainder:%n"
                        + "98 + 5 = %d%n"
                        + "98 - 5 = %d%n"
                        + "98 × 5 = %d%n"
                        + "98 ÷ 5 = %d%n"
                        + "98 %% 5 = %d%n%n"
                        + "98 × 31 + 5 × 17 = %d%n",
                        sum, difference, product, quotient, remainder, multiSum);
    }
}
