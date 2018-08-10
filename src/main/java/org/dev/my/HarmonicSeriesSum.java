/**
 * Sum of a harmonic series 1 + 1/2 + 1/3 + ... + 1/n, where n = 1000.
 */
public class HarmonicSeriesSum {
  public static void main(String[] args) {
    getHarmonicSum();
  }

  private static void getHarmonicSum() {
    int upperBound = 1000;
    int lowerBound = 1;
    double sum = 0;
    double one = 1;

    for (int i = lowerBound; i <= upperBound; i++) {
      sum += one / i;
    }

    System.out.println("Sum of harmonic series is " + sum + ".");
  }
}
