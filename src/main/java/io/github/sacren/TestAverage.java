/**
 * Test driver for Average class.
 */
import java.util.Scanner;

public class TestAverage {
    /** Average test driver. */
    public static void main(String[] args) {
        int[] scores = new int[Average.STUDENT_COUNT];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < Average.STUDENT_COUNT; i++) {
            System.out.printf(
                    "Enter the score of Student %s: ",
                    Average.STUDENT_LIST[i]);
            scores[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        System.out.println("=== Average score ===");
        System.out.println();
        System.out.println(new Average(scores));
    }
}
