/**
 * Prompt the user for an upper bound (a positive integer) and list all the
 * prime numbers less than or equal to this upper bound.
 */
import java.util.Arrays;
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
        int[] primeArray = getPrimeArray(number);
        System.out.printf(
                "List of prime numbers:%n"
                        + "%s%n"
                        + "%d prime numbers (%.2f%%)%n",
                Arrays.toString(primeArray),
                primeArray.length, (double) primeArray.length / number * 100);
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

    private static int countPrime(int upperBound) {
        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static int[] getPrimeArray(int number) {
        int[] primeArray = new int[countPrime(number)];
        int index = 0;
        for (int i = 2; i <= number; i++) { /* prime number starts from 2 */
            if (isPrime(i)) {
                primeArray[index++] = i;
            }
        }
        return primeArray;
    }
}
