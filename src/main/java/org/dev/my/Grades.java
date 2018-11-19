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
        int[] gradeArray; /* This references an array. */
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

        gradeArray = new int[size];
        if (size == 0) {
            System.out.println("Empty class.");
        } else {
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
        }

        System.out.printf(
                "List of grades is %s%n"
                        + "Average is %.2f%n"
                        + "Minimum is %d%n"
                        + "Maximum is %d%n",
                Arrays.toString(gradeArray), getAverage(gradeArray), getMinimum(gradeArray),
                getMaximum(gradeArray));
        inStream.close();
    }

    private static double getAverage(int[] a) {
        final int size = a.length;
        int sum = 0;

        for (int val: a) {
            sum += val;
        }

        return (double) sum / size;
    }

    private static int getMinimum(int[] a) {
        int minimum = 100;

        for (int val: a) {
            if (minimum > val) {
                minimum = val;
            }
        }

        return minimum;
    }

    private static int getMaximum(int[] a) {
        int maximum = 0;

        for (int val: a) {
            if (maximum < val) {
                maximum = val;
            }
        }

        return maximum;
    }
}
