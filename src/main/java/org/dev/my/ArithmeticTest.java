/** Test arithmetic operations. */
public class ArithmeticTest {
    public static void main(String[] args) {
        testArithmetic();
    }

    private static void testArithmetic() {
        int number1 = 98;
        int number2 = 5;
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        int multiSum = number1 * 31 + number2 * 17;

        System.out.println(
                "The sum, difference, product, quotient and remainder:\n"
                        + "98 + 5 = "
                        + sum
                        + "\n"
                        + "98 - 5 = "
                        + difference
                        + "\n"
                        + "98 × 5 = "
                        + product
                        + "\n"
                        + "98 ÷ 5 = "
                        + quotient
                        + "\n"
                        + "98 % 5 = "
                        + remainder
                        + "\n\n"
                        + "98 × 31 + 5 × 17 = "
                        + multiSum);
    }
}
