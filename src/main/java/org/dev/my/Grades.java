/**
 * Prompt the user for the number of students in a class (a non-negative
 * integer) and for the grade of each of them (between 0 and 100).  Compute and
 * print the average (double rounded to 2 decimal places) as well as the lowest
 * and highest grades.
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

        int[] bins = new int[10]; /* 0..9, 10..19, ... 90..100 */
        for (int element: gradeArray) {
            if (element == 100) {
                element = 90; /* 100 belongs to 90..99 group */
            }
            bins[element / 10]++; /* Initial values are all 0's, then increment. */
        }

        System.out.printf(
                "List of grades is %s%n"
                        + "Average is %.2f%n"
                        + "Minimum is %d%n"
                        + "Maximum is %d%n"
                        + "Standard deviation is %.2f%n"
                        + "Histogram in bins is %s%n",
                Arrays.toString(gradeArray), getAverage(gradeArray), getMinimum(gradeArray),
                getMaximum(gradeArray), getStdDeviation(gradeArray), Arrays.toString(bins));
        inStream.close();
    }

    private static double getAverage(int[] a) {
        int sum = 0;
        for (int element: a) {
            sum += element;
        }
        return (double) sum / a.length;
    }

    private static int getMinimum(int[] a) {
        int minimum = 100;
        for (int element: a) {
            if (minimum > element) {
                minimum = element;
            }
        }
        return minimum;
    }

    private static int getMaximum(int[] a) {
        int maximum = 0;
        for (int element: a) {
            if (maximum < element) {
                maximum = element;
            }
        }
        return maximum;
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
}
