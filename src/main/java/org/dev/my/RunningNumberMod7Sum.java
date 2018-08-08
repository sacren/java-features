/**
 * Sum all the numbers between 1 to 1000 that are divisible by 7.
 * Answer: 71071
 */
public class RunningNumberMod7Sum {
  public static void main(String[] args) {
    sumMod7Numbers();
  }

  private static void sumMod7Numbers() {
    int upperBound = 1000;
    int lowerBound = 7;
    int sum = 0;

    for (int i = lowerBound; i <= upperBound; i += 7) {
      sum += i;
    }

    System.out.println("Sum of numbers divisible by 7 is " + sum + ".");
  }
}
