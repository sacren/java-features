/**
 * Prompt the user for five integers and compute the sum, product, minimum and
 * maximum.
 */
import java.util.Scanner;

public class SumProductMinMax5 {
  public static void main(String[] args) {
    compute5Numbers();
  }

  private static void compute5Numbers() {
    Scanner inputStream = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int number1 = inputStream.nextInt();
    System.out.print("Enter the second integer: ");
    int number2 = inputStream.nextInt();
    System.out.print("Enter the third integer: ");
    int number3 = inputStream.nextInt();
    System.out.print("Enter the fourth integer: ");
    int number4 = inputStream.nextInt();
    System.out.print("Enter the fifth integer: ");
    int number5 = inputStream.nextInt();

    final int sum = number1 + number2 + number3 + number4 + number5;
    final int product = number1 * number2 * number3 * number4 * number5;
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

    if (max < number4) {
      max = number4;
    }

    if (max < number5) {
      max = number5;
    }

    if (min > number3) {
      min = number3;
    }

    if (min > number4) {
      min = number4;
    }

    if (min > number5) {
      min = number5;
    }

    System.out.printf("The sum of %d, %d, %d, %d and %d is %d%n"
                      + "The product of %d, %d, %d, %d and %d is %d%n"
                      + "The max of %d, %d, %d, %d and %d is %d%n"
                      + "The min of %d, %d, %d, %d and %d is %d%n",
                      number1, number2, number3, number4, number5, sum,
                      number1, number2, number3, number4, number5, product,
                      number1, number2, number3, number4, number5, max,
                      number1, number2, number3, number4, number5, min);

    inputStream.close();
  }
}
