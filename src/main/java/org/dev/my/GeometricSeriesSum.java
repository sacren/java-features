/**
 * Sum of geometric series: 1 + 1/2 + 1/4 + 1/8 + ... (1000 for upper bound)
 */
public class GeometricSeriesSum {
  public static void main(String[] args) {
    getGeometricSum();
  }

  private static void getGeometricSum() {
    int upperBound = 1000;
    int lowerBound = 1;
    double sum = lowerBound;

    for (int i = lowerBound * 2; i <= upperBound; i *= 2) {
      sum += (double)lowerBound / i;
    }

    System.out.println("Sum of geometric series is " + sum + ".");
  }
}
