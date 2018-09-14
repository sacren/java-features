/**
 * Prompt the user for three integers and compute the sum, product, minimum and
 * maximum.
 */
import java.util.Scanner;

public class SumProductMinMax3 {
  public static void main(String[] args) {
    compute3Numbers();
  }

  private static void compute3Numbers() {
    Scanner inputStream = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int number1 = inputStream.nextInt();
    System.out.print("Enter the second integer: ");
    int number2 = inputStream.nextInt();
    System.out.print("Enter the third integer: ");
    int number3 = inputStream.nextInt();

    final int sum = number1 + number2 + number3;
    final int product = number1 * number2 * number3;
    int max;
    int min;

    if (number1 >= number2) {
      max = number1;
      min = number2;
    } else {
      max = number2;
      min = number1;
    }

    if (max < number3) {
      max = number3;
    }

    if (min > number3) {
      min = number3;
    }

    System.out.printf("The sum of %d, %d and %d is %d%n"
                      + "The product of %d, %d and %d is %d%n"
                      + "The max of %d, %d and %d is %d%n"
                      + "The min of %d, %d and %d is %d%n",
                      number1, number2, number3, sum,
                      number1, number2, number3, product,
                      number1, number2, number3, max,
                      number1, number2, number3, min);

    inputStream.close();
  }
}
