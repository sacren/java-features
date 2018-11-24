/**
 * Prompt the user for the number of students in a class (a non-negative
 * integer) and for the grade of each of them (between 0 and 100).  Compute and
 * print the average (double rounded to 2 decimal places) as well as the lowest
 * and highest grades.  Add standard deviation and both vertical and horizontal
 * histograms.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    /** Prompt for input and display results. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int size;
        int grade;
        for ( ; ; ) {
            System.out.print("Enter the number of students: ");
            size = inStream.nextInt();
            if (size >= 0) {
                break;
            }
            System.out.printf("%d is invalid. Try again.%n", size);
        }

        if (size == 0) {
            System.out.println("No students, no grades.");
            inStream.close();
            return;
        }

        int[] gradeArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the grade of student %d: ", i + 1);
            grade = inStream.nextInt();
            for ( ; ; ) {
                if (grade >= 0 && grade <= 100) {
                    gradeArray[i] = grade;
                    break;
                }
                System.out.printf(
                        "%d is invalid%n"
                                + "Enter the grade of student %d again: ",
                        grade, i + 1);
                grade = inStream.nextInt();
            }
        }

        System.out.printf(
                "List of grades is %s%n"
                        + "Average is %.2f%n"
                        + "Minimum is %d%n"
                        + "Maximum is %d%n"
                        + "Standard deviation is %.2f%n"
                        + "Histogram of grades:%n",
                Arrays.toString(gradeArray), getAverage(gradeArray), getMin(gradeArray),
                getMax(gradeArray), getStdDeviation(gradeArray));
        int[] histogramArray = getHistogram(gradeArray);
        int index = 0;
        for (int count: histogramArray) {
            System.out.printf(
                    "%2d - %3d: %s%n",
                    index * 10,
                    index == 9 ? index * 10 + 10 : index * 10 + 9,
                    addAsterisk(count));
            index++;
        }
        final int maxAsterisk = getMax(histogramArray);
        for (int row = 0; row < maxAsterisk; row++) {
            index = 0;
            for (int count: histogramArray) {
                if (count >= maxAsterisk - row) {
                    if (index == 0) {
                        System.out.printf("%3c%3c", '*', ' ');
                    } else {
                        System.out.printf("%2c%4c", '*', ' ');
                    }
                } else {
                    System.out.printf("%6c", ' ');
                }
                if (index++ == 9) {
                    System.out.println();
                }
            }
        }
        /* Deal with the end bins easily outside of the loop. */
        System.out.printf("%2d-%-2d", 0, 9);
        for (int i = 1; i < 9; i++) {
            System.out.printf("%2d-%-3d", i * 10, i * 10 + 9);
        }
        System.out.printf("%2d-%-3d%n", 90, 100);
        inStream.close();
    }

    private static double getAverage(int[] a) {
        int sum = 0;
        for (int element: a) {
            sum += element;
        }
        return (double) sum / a.length;
    }

    private static int getMin(int[] a) {
        int min = a[0];
        for (int number: a) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    private static int getMax(int[] a) {
        int max = a[0];
        for (int number: a) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    private static double getStdDeviation(int[] a) {
        final int size = a.length;
        int sumOfSquare = 0;
        int sum = 0;
        for (int element: a) {
            sumOfSquare += element * element;
            sum += element;
        }
        return Math.sqrt((double) sumOfSquare / size
                        - ((double) sum / size) * ((double) sum / size));
    }

    private static int[] getHistogram(int[] grades) {
        int[] bins = new int[10]; /* 0..9, 10..19, ... 90..100 */
        for (int grade: grades) {
            if (grade == 100) {
                grade = 90; /* 100 belongs to 90..99 group */
            }
            bins[grade / 10]++; /* Initial values are all 0's, then increment. */
        }
        return bins;
    }

    private static String addAsterisk(int count) {
        String s = "";
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                s += "*";
                continue;
            }
            s += " *";
        }
        return s;
    }
}
