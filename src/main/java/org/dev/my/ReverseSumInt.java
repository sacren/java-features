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

    /* Reverse the order of integer. */
    private static int reverseNumber(int number) {
        int remainder;
        int reversed = 0;

        /* Decrement through division by 10. */
        for (int i = number; i != 0; i /= 10) {
            remainder = i % 10;
            reversed *= 10;
            reversed += remainder;
        }

        return reversed;
    }

    /* Sum each digit of integer. */
    private static int sumDigit(int number) {
        int sum = 0;

        /* Decrement through division by 10. */
        for (int i = number; i != 0; i /= 10) {
            sum += i % 10;
        }

        return sum;
    }
}
