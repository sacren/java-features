/**
 * Test driver for GeoSeries class.
 */
public class TestGeoSeries {
    /** GeoSeries test dirver. */
    public static void main(String[] args) {
        GeoSeries sum1000 = new GeoSeries(1000);
        System.out.println();
        System.out.println("=== Sum of geometric series to 1000 ===");
        System.out.println();
        System.out.println(sum1000);
        GeoSeries sum5000 = new GeoSeries(5000);
        System.out.println();
        System.out.println("=== Sum of geometric series to 5000 ===");
        System.out.println();
        System.out.println(sum5000);
    }
}
