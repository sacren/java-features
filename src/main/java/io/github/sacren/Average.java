/**
 * Average class for average score of 3 students.
 *
 * <p>Private instance data:
 * -scores:int[]
 *
 * <p>Constructor:
 * +Average(scores:int[])
 *
 * <p>Public methods:
 * +check(scores:int[]);
 * +getAverage():double
 * +toString():String
 */
public class Average {
    /* private static data */
    public static final int STUDENT_COUNT = 3;
    public static final String[] STUDENT_LIST = {"One", "Two", "Three"};

    /* private instance data */
    private int[] scores;

    /** Average constructor. */
    public Average(int[] scores) {
        check(scores);
    }

    /** Average method to validate the scores. */
    public void check(int[] scores) {
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException(
                        String.format("%d is invalid!", score));
            }
        }
        this.scores = scores;
    }

    /** Average getter for the average score. */
    public double getAverage() {
        double sum = 0;
        for (int score : scores) {
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
