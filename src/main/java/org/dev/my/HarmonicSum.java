/**
 * Sum of a harmonic series 1 + 1/2 + 1/3 + ... + 1/n, where n = 50000.
 */
public class HarmonicSum {
  public static void main(String[] args) {
    getHarmonicSum();
  }

  private static void getHarmonicSum() {
    int upperBound = 50000;
    int lowerBound = 1;
    double sumLeftToRight = lowerBound;
    double sumRightToLeft = 0;

    for (int i = lowerBound + 1; i <= upperBound; i++) {
      sumLeftToRight += (double)lowerBound / i;
    }

    for (int i = upperBound; i > lowerBound; i--) {
      sumRightToLeft += (double)lowerBound / i;
    }

    sumRightToLeft += 1;

    System.out.println("Sum of harmonic from left to right is " + sumLeftToRight + "\n"
                       + "Sum of harmonic from right to left is " + sumRightToLeft);
  }
}
