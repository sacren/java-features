/**
 * All the leap years between AD1 and AD2010 and the number of those leap
 * years.
 */
public class LeapYears {
    /** Find all the leap years. */
    public static void main(String[] args) {
        final int begin = 1;
        final int end = 2010;
        int total = 0;
        int count = 1;
        System.out.println();
        System.out.printf("List of leap years between AD1 and AD2010:%n%n");
        for (int year = begin; year <= end; year++) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.printf("%-5d", year);
                if (count++ % 20 == 0) {
                    System.out.println();
                }
                total++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("Number of leap years is %d%n", total);
    }
}
