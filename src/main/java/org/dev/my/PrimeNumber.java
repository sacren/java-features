/**
 * Prompt the user for an upper bound (a positive integer) and list all the
 * prime numbers less than or equal to this upper bound.
 *
 * Display all the numbers that is equal to the product of all its prime
 * factors less than the number itself.
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
        int[] list = getListOfNumbers(number);
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
        for (int i = 2; i < number; i++) { /* prime number starts from 2 */
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int countPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static int[] getPrimeArray(int number) {
        int[] primeArray = new int[countPrime(number)];
        int index = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                primeArray[index++] = i;
            }
        }
        return primeArray;
    }

    private static int countFactor(int number) {
        int count = 0;
        for (int prime: getPrimeArray(number)) {
            if (number % prime == 0) {
                count++;
            }
        }
        return count;
    }

    /* All array elements are prime numbers and now they are factors. */
    private static int[] getFactorArray(int number) {
        int[] factorArray = new int[countFactor(number)];
        int index = 0;
        for (int prime: getPrimeArray(number)) {
            if (number % prime == 0) {
                factorArray[index++] = prime;
            }
        }
        return factorArray;
    }

    /* Prime has no other prime factors, thus the number parameter is not a
     * prime. Further product variable doesn't contain the number as a factor
     * since all the factors are prime.
     */
    private static boolean isProductOfPrimeFactors(int number) {
        int product = 1;
        for (int factor: getFactorArray(number)) {
            product *= factor;
        }
        if (product == number) {
            return true;
        }
        return false;
    }

    private static int countListOfNumbers(int number) {
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

    private static int[] getListOfNumbers(int number) {
        int[] list = new int[countListOfNumbers(number)];
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
