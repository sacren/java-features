/**
 * Prompt the user for an integer and print it in reverse order as well as the sum of each digit.
 */
import java.util.Scanner;

public class ReverseSumInt {
    /** Entry point of ReverseInt class. It also prompts the user for an integer. */
    public static void main(String[] args) {
        int number;

        Scanner inputStream = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = inputStream.nextInt();
        System.out.printf("Reversed integer is %d%n", reverseNumber(number));
        System.out.printf("Sum of each digit is %d%n", sumDigit(number));

        inputStream.close();
    }

    /** Reverse the order of integer. */
    public static int reverseNumber(int number) {
        int remainder;
        int reversed = 0;

        for (; ; ) {
            remainder = number % 10;
            number /= 10;
            reversed *= 10;
            reversed += remainder;

            if (number == 0) {
                break;
            }
        }

        return reversed;
    }

    /** Sum each digit of integer. */
    public static int sumDigit(int number) {
        int remainder;
        int sum = 0;

        for (; ; ) {
            remainder = number % 10;
            sum += remainder;
            number /= 10;

            if (number == 0) {
                break;
            }
        }

        return sum;
    }
}
