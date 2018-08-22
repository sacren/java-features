/**
 * Sum all the numbers from 111 to 8899.
 *
 * Sum only the odd numbers from 1 to 100 and compute the average.
 */
public class SumAndAverage {
  public static void main(String[] args) {
    sumNumbersAndAverage();
    sumOddNumbersAndAverage();
  }

  private static void sumNumbersAndAverage() {
    int upperBound = 8899;
    int lowerBound = 111;
    int sum = 0;
    int count = 0;
    double average;

    for (int i = lowerBound; i <= upperBound; i++) {
      sum += i;
      count++;
    }

    average = (double)sum / count;

    System.out.println("Sum from 111 to 8899 is " + sum + ".\n"
                       + "Average is " + average + ".");
  }

  private static void sumOddNumbersAndAverage() {
    int upperBound = 100;
    int lowerBound = 1;
    int sum = 0;
    int count = 0;
    double average;

    for (int i = lowerBound; i <= upperBound; i++) {
      if (i % 2 == 1) {
        sum += i;
        count++;
      }
    }

    average = (double)sum / count;

    System.out.println("Sum of odd numbers is " + sum + ".\n"
                       + "Average is " + average);
  }
}
