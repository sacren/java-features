/**
 * Sum all the odd numbers between 1 to 1000.
 * Answer: 250000
 */
public class RunningNumberOddSum {
  public static void main(String[] args) {
    sumOddNumbers();
  }

  private static void sumOddNumbers() {
    int upperBound = 1000;
    int lowerBound = 1;
    int sum = 0;
    int firstOddNumber;

    if (lowerBound % 2 == 1) {
      firstOddNumber = lowerBound;
    } else {
      firstOddNumber = lowerBound + 1;
    }

    for (int i = firstOddNumber; i <= upperBound; i += 2) {
      sum += i;
    }

    System.out.println("Sum of all odd numbers is " + sum + ".");
  }
}
