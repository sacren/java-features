/**
 * Sum of a harmonic series adding from left to right:
 * 1 + 1/2 + 1/3 + ... + 1/50000
 *
 * Sum of a harmonic series adding from right to left:
 * 1/50000 + 1/49999 + 1/49998 + ... + 1/3 + 1/2 + 1
 *
 * Display of the difference.
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
    double difference;

    for (int i = lowerBound + 1; i <= upperBound; i++) {
      sumLeftToRight += (double)lowerBound / i;
    }

    for (int i = upperBound; i > lowerBound; i--) {
      sumRightToLeft += (double)lowerBound / i;
    }

    sumRightToLeft += 1;
    difference = sumRightToLeft - sumLeftToRight;

    System.out.println("Sum of harmonic from left to right is " + sumLeftToRight + "\n"
                       + "Sum of harmonic from right to left is " + sumRightToLeft + "\n"
                       + "Difference is " + difference);
  }
}
