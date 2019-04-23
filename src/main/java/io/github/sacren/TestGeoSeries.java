/**
 * Test driver for GeoSeries class.
 */
public class TestGeoSeries {
    /** GeoSeries test dirver. */
    public static void main(String[] args) {
        /* 1000 */
        System.out.println();
        System.out.println("=== Sum of geometric series to 1000 ===");
        System.out.println();
        System.out.println(new GeoSeries(1000));
        /* 5000 */
        System.out.println();
        System.out.println("=== Sum of geometric series to 5000 ===");
        System.out.println();
        System.out.println(new GeoSeries(5000));
        /* 50000 but MAX_VALUE takes too long */
        System.out.println();
        System.out.println("=== Sum of geometric series to 50000 ===");
        System.out.println();
        System.out.println(new GeoSeries(50000));
    }
}
