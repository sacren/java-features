/**
 * Average class for average score of 3 students.
 *
 * <p>Private instance data:
 * -scores:double[]
 *
 * <p>Constructor:
 * +Average(scores:double[])
 *
 * <p>Public methods:
 * +check();
 * +average():double
 * +toString():String
 */
public class Average {
    /* private static data */
    public static final int STUDENT_COUNT = 3;

    /* private instance data */
    private double[] scores;

    /** Average constructor. */
    public Average(double[] scores) {
        this.scores = scores;
        check();
    }

    /** Average method to check for valid score. */
    public void check() {
        for (double score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException(
                        String.format("%f is invalid!", score));
            }
        }
    }

    /** Average method for the average score. */
    public double average() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / STUDENT_COUNT;
    }

    /** Average instance printout. */
    public String toString() {
        return String.format(
                "Average score: %.2f",
                average());
    }
}
