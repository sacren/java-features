/**
 * Test driver for Pension class.
 */
import java.util.Scanner;

public class TestPension {
    /** Pension test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary;
        System.out.print("Enter monthly salary: ");
        salary = in.nextDouble();
        int age;
        System.out.print("Enter employee age: ");
        age = in.nextInt();
        in.close();
        System.out.println();
        System.out.println("=== Pension contribution ===");
        System.out.println();
        System.out.println(new Pension(salary, age));
    }
}
