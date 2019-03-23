/**
 * For employee aged 55 and below, the employee contributes 20% of the monthly salary (subjected to
 * the max of $6000) and the employer contributes 17%. For employee aged above 55 to 60, the
 * employee contributes 13% and the employer contributes 13%. For employee aged above 60 to 65, the
 * employee contributes 7.5% and the employer contributes 9%. For employee aged above 65, the
 * employee contributes 5% and the employer contributes 7.5%.
 */
import java.util.Scanner;

public class TestPensionContribution {
    /** Entry point to PensionContribution. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;
        int age;

        for (; ; ) {
            System.out.print("Enter monthly salary: $");
            salary = input.nextDouble();

            if (salary < 0) {
                System.out.println("Negative salary. Bye!");
                break;
            }

            System.out.print("Enter employee age: ");
            age = input.nextInt();

            if (age < 20) {
                System.out.println("Too young to contribute. Bye!");
                break;
            }

            calculateContribution(salary, age);
        }

        input.close();
    }

    /** Contribution calculation. */
    public static void calculateContribution(double salary, int age) {
        final int maxContribSalary = 6000;
        final double employeeContribution55Below = 0.2;
        final double employerContribution55Below = 0.17;
        final double employeeContribution55To60 = 0.13;
        final double employerContribution55To60 = 0.13;
        final double employeeContribution60To65 = 0.075;
        final double employerContribution60To65 = 0.09;
        final double employeeContribution65Above = 0.05;
        final double employerContribution65Above = 0.075;
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        if (salary > maxContribSalary) {
            salary = maxContribSalary;
        }

        for (; ; ) {
            if (age > 65) {
                employeeContribution = salary * employeeContribution65Above;
                employerContribution = salary * employerContribution65Above;
                totalContribution = employeeContribution + employerContribution;
                break;
            }

            if (age > 60) {
                employeeContribution = salary * employeeContribution60To65;
                employerContribution = salary * employerContribution60To65;
                totalContribution = employeeContribution + employerContribution;
                break;
            }

            if (age > 55) {
                employeeContribution = salary * employeeContribution55To60;
                employerContribution = salary * employerContribution55To60;
                totalContribution = employeeContribution + employerContribution;
                break;
            }

            employeeContribution = salary * employeeContribution55Below;
            employerContribution = salary * employerContribution55Below;
            totalContribution = employeeContribution + employerContribution;
            break;
        }

        System.out.printf(
                "Employee contribution is %.2f%n"
                        + "Employer contribution is %.2f%n"
                        + "Total contribution is %.2f%n%n",
                employeeContribution, employerContribution, totalContribution);
    }
}
