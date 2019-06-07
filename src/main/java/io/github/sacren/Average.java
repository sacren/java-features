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
 * +check(scores:double[]);
 * +getAverage():double
 * +toString():String
 */
public class Average {
    /* private static data */
    public static final int STUDENT_COUNT = 3;

    /* private instance data */
    private double[] scores;

    /** Average constructor. */
    public Average(double[] scores) {
        check(scores);
    }

    /** Average method to validate the scores. */
    public void check(double[] scores) {
        for (double score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException(
                        String.format("%f is invalid!", score));
            }
        }
        this.scores = scores;
    }

    /** Average getter for the average score. */
    public double getAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / STUDENT_COUNT;
    }

    /** Average string method. */
    public String toString() {
        return String.format(
                "Average score: %.2f",
                getAverage());
    }
}
