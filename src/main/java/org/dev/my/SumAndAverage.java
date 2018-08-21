/**
 * Sum all the numbers from 9 to 888.
 * Answer: 394680.
 */
public class SumAndAverage {
  public static void main(String[] args) {
    sumNumbersAndAverage();
  }

  private static void sumNumbersAndAverage() {
    int upperBound = 888;
    int lowerBound = 9;
    int sum = 0;
    int count = 0;
    double average;

    for (int i = lowerBound; i <= upperBound; i++) {
      sum += i;
      count++;
    }

    average = (double)sum / count;

    System.out.println("Sum from 9 to 888 is " + sum + ".\n"
                       + "Average is " + average + ".");
  }
}
