/**
 * Grades class.
 *
 * <p>Private data:
 * -count:int
 * -grades:int[]
 * -average:double
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
    private double average;
    private int max;
    private int min;

    /** Grades constructor. */
    public Grades(int count) {
        stuCount(count);
        grades = new int[count];
    }

    /** Grades setter for statudent count. */
    public void stuCount(int count) {
        if (count < 0) {
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

    /** Grades method for the sum of grades. */
    public void sum() {
        sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
    }

    /** Grades method for average of grades. */
    public void average() {
        average = sum / count;
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

    /** Grades wrapper method. */
    public void init() {
        this.sum();
        this.average();
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
                        + "Min of grades: %d",
                count,
                Arrays.toString(grades),
                average,
                max,
                min);
    }
}
