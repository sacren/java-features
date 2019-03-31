/**
 * Test driver for Grades class.
 */
import java.util.Scanner;

public class TestGrades {
    /** Test Grades instance and histogram. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = in.nextInt();
        Grades grades = new Grades(size);
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the grade of Student %d: ", i + 1);
            grades.addGrade(i, in.nextInt()); /* add grades one by one */
        }
        in.close();
        grades.init();
        System.out.println();
        System.out.println(grades);
        System.out.println();
        System.out.println("=== Vertical histogram ===");
        System.out.println(grades.vertHisto());
        System.out.println();
        System.out.println("=== Horizontal histogram ===");
        System.out.println(grades.flatHisto());
    }
}
