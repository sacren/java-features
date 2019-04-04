/**
 * GeoSeries class.
 *
 * <p>Obtain the sum of geometric series: 1 + 1/2 + 1/4 + 1/8 + ...
 *
 * <P>Private data:
 * -sum:double
 * -last:int
 * -bounds:int
 *
 * <p>Constructor:
 * +GeoSeries(bounds:int)
 *
 * <P>Public method:
 * +sum():void
 * +toString():void
 */
public class GeoSeries {
    /* private instance data */
    private double sum;
    private int last;
    private int bounds;

    /** GeoSeries constructor. */
    public GeoSeries(int bounds) {
        this.bounds = bounds;
        sum(bounds);
    }

    /** GeoSeries method for the sum of geometric series. */
    public void sum(int bounds) {
        sum = 1;
        for (int i = 2; i <= bounds; i *= 2) {
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
