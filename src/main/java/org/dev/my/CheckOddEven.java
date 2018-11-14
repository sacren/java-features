/** Prompt the user for an integer and check if it is odd or even. */
import java.util.Scanner;

public class CheckOddEven {
    /** Prompt the user for an integer and check if it is odd or even. */
    public static void main(String[] args) {
        int number;

        Scanner inputStream = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = inputStream.nextInt();
        System.out.printf(
                "%d is %s%n",
                number, isOdd(number) ? "odd" : "even");

        inputStream.close();
    }

    private static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }

        return true;
    }
}
