/**
 * Sum of geometric series: 1 + 1/2 + 1/4 + 1/8 + ... (1000 for upper bound)
 */
public class TestGeoSeries {
    /** Sum of geometric series. */
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 2; i <= 1000; i *= 2) {
            sum += 1f / i;
        }
        System.out.println();
        System.out.println("=== Sum of geometric series to 1000 ===");
        System.out.println();
        System.out.printf("1 + 1/2 + 1/4 + 1/8 + ... = %f%n", sum);
    }
}
