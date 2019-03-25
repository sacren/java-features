/**
 * Grades class.
 *
 * <p>Private data:
 * -count:int
 * -grades:int[]
 * -sum:double
 * -sqSum:double
 * -average:double
 * -stdDevi:double
 * -bins:int[]
 * -max:int
 * -min:int
 *
 * <p>Constructor:
 * +Grades(count:int)
 *
 * <p>Public methods:
 * +toString():String
 */
import java.util.Arrays;

public class Grades {
    /* private instance data */
    private int count;
    private int[] grades;
    private double sum;
    private double sqSum;
    private double average;
    private double stdDevi;
    private int[] bins;
    private int max;
    private int min;

    /** Grades constructor. */
    public Grades(int count) {
        stuCount(count);
        grades = new int[count];
        bins = new int[10]; /* 0..9, 10..19, ... 90..100 */
    }

    /** Grades setter for student count. */
    public void stuCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid.", count));
        }
        this.count = count;
    }

    /** Grades method to fill grades. */
    public void addGrade(int index, int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", grade));
        }
        grades[index] = grade;
    }

    /** Grades method for the sum and square sum of grades. */
    public void sum() {
        sum = 0;
        sqSum = 0;
        for (int grade : grades) {
            sum += grade;
            sqSum += grade * grade;
        }
    }

    /** Grades method for average of grades. */
    public void average() {
        average = sum / count;
    }

    /** Grades method for standard deviation of grades. */
    public void stdDevi() {
        stdDevi = Math.sqrt(sqSum / count - average * average);
    }

    /** Grades method for bins of grades. */
    public void bins() {
        for (int grade : grades) {
            if (grade == 100) {
                grade = 90; /* 100 belongs to 90..99 group */
            }
            grade /= 10;
            bins[grade]++; /* Initial values are all 0's, then increment. */
        }
    }

    /** Grades method for max of grades. */
    public void max() {
        max = grades[0];
        for (int grade : grades) {
            if (max < grade) {
                max = grade;
            }
        }
    }

    /** Grades method for min of grades. */
    public void min() {
        min = grades[0];
        for (int grade : grades) {
            if (min > grade) {
                min = grade;
            }
        }
    }

    /** Grades helper for instance data. */
    public void init() {
        this.sum();
        this.average();
        this.stdDevi();
        this.bins();
        this.max();
        this.min();
    }

    /** Grades instance description. */
    public String toString() {
        return String.format(
                "Number of students: %d%n"
                        + "List of grades: %s%n"
                        + "Average of grades: %.2f%n"
                        + "Max of grades: %d%n"
                        + "Min of grades: %d%n"
                        + "Standard deviation of grades: %.2f%n"
                        + "Bins of grades: %s",
                count,
                Arrays.toString(grades),
                average,
                max,
                min,
                stdDevi,
                Arrays.toString(bins));
    }
}
