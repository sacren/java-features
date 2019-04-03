/**
 * GeoSeries class for the sum of geometric series: 1 + 1/2 + 1/4 + 1/8 + ...
 * (1000 for upper bound)
 *
 * <P>Private data:
 * -sum:double
 * -last:int
 *
 * <p>Constructor:
 * +GeoSeries()
 *
 * <P>Public method:
 * +sum():void
 * +toString():void
 */
public class GeoSeries {
    /* private data */
    private double sum;
    private int last;

    /** GeoSeries constructor. */
    public GeoSeries() {
        sum();
    }

    /** GeoSeries method for the sum of geometric series. */
    public void sum() {
        sum = 1;
        for (int i = 2; i <= 1000; i *= 2) {
            sum += 1f / i;
            last = i;
        }
    }

    /** GeoSeries instance printout. */
    public String toString() {
        return String.format(
                "1 + 1/2 + 1/4 + 1/8 + ... + 1/%d = %f",
                last, sum);
    }
}
