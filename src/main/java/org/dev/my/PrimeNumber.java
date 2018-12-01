/**
 * Prompt the user for an upper bound (a positive integer) and list all the
 * prime numbers less than or equal to this upper bound.
 */
import java.util.Scanner;

public class PrimeNumber {
    /** Imperfect way to check if the number is prime. */
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int number;
        for ( ; ; ) {
            System.out.print("Enter a positive integer for upper bound: ");
            number = inputStream.nextInt();
            if (number > 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", number);
        }
        int count = 0;
        System.out.println("List of prime numbers:");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.printf("%d%n", i);
                count++;
            }
        }
        System.out.printf("%d prime numbers (%.2f%%)%n%n", count, (double) count / number * 100);
        inputStream.close();
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
