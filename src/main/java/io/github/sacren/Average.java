/**
 * Average class for average score of 3 students.
 *
 * <p>Private instance variable:
 * -scores:int[]
 *
 * <p>Constructor:
 * +Average(scores:int[])
 *
 * <p>Public methods:
 * +setScores():void
 * +setScores(scores:int[]):void;
 * +average():double
 * +toString():String
 */
public class Average {
    /* private static constants */
    public static final int STUDENT_COUNT = 3;
    public static final String[] STUDENT_LIST = {"One", "Two", "Three"};

    /* private instance variable */
    private int[] scores;

    /** Average constructor. */
    public Average(int[] scores) {
        setScores();
        setScores(scores);
    }

    /** Average setter for the size of scores array. */
    public void setScores() {
        scores = new int[STUDENT_COUNT];
    }

    /** Average setter for the individual value of scores array. */
    public void setScores(int[] scores) {
        int i = 0;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException(
                        String.format("%d is invalid!", score));
            }
            this.scores[i++] = score;
        }
    }

    /** Average method for the average of all scores. */
    public double average() {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / STUDENT_COUNT;
    }

    /** Average instance formatted string. */
    public String toString() {
        return String.format(
                "Average score: %.2f",
                average());
    }
}
