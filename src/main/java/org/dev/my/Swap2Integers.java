/**
 * Prompt user for two integers and swap their contents.
 */
import java.util.Scanner;

public class Swap2Integers {
  /**
   * Implement swap integers in main method.
   */
  public static void main(String[] args) {
    Scanner inputStream = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    int number1 = inputStream.nextInt();
    System.out.print("Enter the second integer: ");
    int number2 = inputStream.nextInt();
    final String before = "Before";
    final String after = "After";

    System.out.println();
    printNumber(before, number1, number2);

    /* Now we swap the two integers. */
    int tmp = number1;
    number1 = number2;
    number2 = tmp;

    System.out.println();
    printNumber(after, number1, number2);
    inputStream.close();
  }

  /**
   * Print out the numbers before and after swap.
   */
  public static void printNumber(String beforeOrAfter, int number1, int number2) {
    System.out.printf("%s:%n"
                      + "The first integer is %d%n"
                      + "The second integer is %d%n",
                      beforeOrAfter, number1, number2);
  }
}
