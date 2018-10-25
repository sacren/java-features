/** Prompt user for two integers and print their sum. */
import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {
        add2Integer();
    }

    private static void add2Integer() {
        Scanner stream = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = stream.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = stream.nextInt();
        stream.close();
        System.out.printf("The sum of %d and %d is %d.%n", n1, n2, n1 + n2);
    }
}
