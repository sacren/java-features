/**
 * Grades class.
 *
 * <p>Private data:
 * -count:int
 * -grades:int[]
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
 * +getSum():double
 * +getSqSum():double
 * +toString():String
 */
import java.util.Arrays;

public class Grades {
    /* private instance data */
    private int count;
    private int[] grades;
    private double average;
    private double stdDevi;
    private int[] bins;
    private int binsMax;
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

    /** Grades getter for the sum of grades. */
    public double getSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    /** Grades getter for square sum of grades. */
    public double getSqSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade * grade;
        }
        return sum;
    }

    /** Grades method for average of grades. */
    public void average() {
        average = getSum() / count;
    }

    /** Grades method for standard deviation of grades. */
    public void stdDevi() {
        stdDevi = Math.sqrt(getSqSum() / count - average * average);
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
        max = intMax(grades);
    }

    /** Grades method for max of bins. */
    public void binsMax() {
        binsMax = intMax(bins);
    }

    /* helper for max of integer array */
    private static int intMax(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (max < i) {
                max = i;
            }
        }
        return max;
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
        this.average();
        this.stdDevi();
        this.bins();
        this.binsMax();
        this.max();
        this.min();
    }

    /** Grades instance description. */
    public String toString() {
        return String.format(
                "Number of students:           %d%n"
                        + "List of grades:               %s%n"
                        + "Average of grades:            %.2f%n"
                        + "Max of grades:                %d%n"
                        + "Min of grades:                %d%n"
                        + "Standard deviation of grades: %.2f%n"
                        + "Bins of grades:               %s",
                count,
                Arrays.toString(grades),
                average,
                max,
                min,
                stdDevi,
                Arrays.toString(bins));
    }

    /** Grades method for vertical histogram. */
    public String vertHisto() {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (int count : bins) {
            sb.append(
                    String.format(
                        "%2d - %3d: %s",
                        i * 10,
                        i == 9 ? i * 10 + 10 : i * 10 + 9,
                        addAsterisk(count)));
            if (++i < bins.length) {
                sb.append(String.format("%n"));
            }
        }
        return sb.toString();
    }

    /* helper for horizontal asterisks */
    private static String addAsterisk(int count) {
        StringBuffer sb = new StringBuffer();
        /* 0 count: the check and loop are skipped.
         * 1 count: loop is skipped.
         * 2 and above: loop through.
         */
        if (count > 0) {
            sb.append("*");
        }
        for (int i = 1; i < count; i++) {
            sb.append(" *");
        }
        return sb.toString();
    }

    /** Grades method for horizontal histogram. */
    public String flatHisto() {
        StringBuffer sb = new StringBuffer(stackAsterisk());
        int size = bins.length;
        for (int i = 0; i < size; i++) {
            sb.append(
                    String.format(
                        i == 0 ? "%d-%-2d" : "%2d-%-3d",
                        i * 10,
                        i == size - 1 ? i * 10 + 10 : i * 10 + 9));
        }
        return sb.toString();
    }

    /** Grades method for vertical graph of asterisks. */
    public String stackAsterisk() {
        StringBuffer sb = new StringBuffer();
        int column;
        for (int row = 0; row < binsMax; row++) {
            /* inner loop for column */
            column = 0;
            for (int count : bins) {
                if (count >= binsMax - row) {
                    if (column == 0) {
                        sb.append(String.format("%2c%2c", '*', ' '));
                    } else {
                        sb.append(String.format("%3c%3c", '*', ' '));
                    }
                } else {
                    if (column == 0) {
                        sb.append(String.format("%4c", ' '));
                    } else {
                        sb.append(String.format("%6c", ' '));
                    }
                }
                if (++column == bins.length) {
                    sb.append(String.format("%n"));
                }
            }
        }
        return sb.toString();
    }
}
