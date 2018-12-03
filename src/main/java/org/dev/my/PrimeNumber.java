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
        int[] list = getNumberOfPrimeFactor(number);
        System.out.printf(
                "List of prime numbers:%n"
                        + "%s%n"
                        + "%d prime numbers (%.2f%%)%n"
                        + "List of numbers equal to the product of prime factors:%n"
                        + "%s%n"
                        + "%d numbers (%.2f%%)%n",
                Arrays.toString(primeArray),
                primeArray.length, (double) primeArray.length / number * 100,
                Arrays.toString(list), list.length, (double) list.length / number * 100);
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

    private static int countFactors(int number) {
        int[] primeArray = getPrimeArray(number);
        int count = 0;
        for (int prime: primeArray) {
            if (prime == number) {
                break;
            }
            if (number % prime == 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] getFactorArray(int number) {
        int[] primeArray = getPrimeArray(number);
        int[] factorArray = new int[countFactors(number)];
        int index = 0;
        for (int prime: primeArray) {
            if (number % prime == 0) {
                factorArray[index++] = prime;
            }
        }
        return factorArray;
    }

    private static boolean isProductOfPrimeFactors(int number) {
        int[] factorArray = getFactorArray(number);
        int product = 1;
        for (int factor: factorArray) {
            product *= factor;
        }
        if (product == number) {
            return true;
        }
        return false;
    }

    private static int countPrimeFactor(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                continue;
            }
            if (isProductOfPrimeFactors(i)) {
                count++;
            }
        }
        return count;
    }

    private static int[] getNumberOfPrimeFactor(int number) {
        int[] list = new int[countPrimeFactor(number)];
        int index = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                continue;
            }
            if (isProductOfPrimeFactors(i)) {
                list[index++] = i;
            }
        }
        return list;
    }
}
