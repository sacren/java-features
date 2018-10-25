/** Prompt user for two integers and swap their contents. */
import java.util.Scanner;

public class Swap2Integers {
    /** Implement swap integers in main method. */
    public static void main(String[] args) {
        final String before = "Before";
        final String after = "After";
        int number1;
        int number2;
        int tmp;

        Scanner inputStream = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        number1 = inputStream.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = inputStream.nextInt();

        System.out.println();
        System.out.println("Before:");
        printNumber(number1, number2);

        /* Now we swap the two integers. */
        tmp = number1;
        number1 = number2;
        number2 = tmp;

        System.out.println();
        System.out.println("After:");
        printNumber(number1, number2);
        inputStream.close();
    }

    /** Print out two numbers. */
    public static void printNumber(int number1, int number2) {
        System.out.printf(
                "The first integer is %d%n" + "The second integer is %d%n", number1, number2);
    }
}
