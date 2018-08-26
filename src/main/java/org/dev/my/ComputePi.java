/**
 * Compute the value of π using the serial expansion.
 * <p>
 * π = 4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * </p>
 */
public class ComputePi {
  public static void main(String[] args) {
    printPi();
  }

  private static void printPi() {
    int upperBound = 999999999;
    double sum = 1;
    double pi;

    for (int i = 3; i <= upperBound; i += 2) {
      if (i % 4 == 1) {
        sum += (double)1 / i;
        continue;
      }

      if (i % 4 == 3) {
        sum -= (double)1 / i;
        continue;
      }

      System.out.println("The machine runs out of control!");
    }

    pi = 4 * sum;
    System.out.println("π = " + pi);
  }
}
