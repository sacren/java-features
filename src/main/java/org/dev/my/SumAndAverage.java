/**
 * Sum all the numbers from 111 to 8899.
 */
public class SumAndAverage {
  public static void main(String[] args) {
    sumNumbersAndAverage();
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
}
