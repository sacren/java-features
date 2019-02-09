/** Prompt user for two integers and print the sum. */
import java.util.Scanner;

public class TestAdd2Integers {
    /** Prompt the user for two integers and print the sum. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        final int n1 = inStream.nextInt();
        System.out.print("Enter the second integer: ");
        final int n2 = inStream.nextInt();
        System.out.printf(
                "The sum of %d and %d is %d%n",
                n1, n2, n1 + n2);
        inStream.close();
    }
}
