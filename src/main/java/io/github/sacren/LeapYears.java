/**
 * LeapYears class for all the leap years between AD1 and AD2020.
 *
 * <p>Constructor:
 * +LeapYears()
 *
 * <p>Public methods:
 * +toString():String
 */
public class LeapYears {
    /* private static data */
    private static final int BEGIN = 1;
    private static final int END = 2020;

    /** LeapYears instance printout. */
    public String toString() {
        String s = "";
        int count = 0;
        for (int year = BEGIN; year <= END; year++) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                s += String.format("%-5d", year);
                if (++count % 20 == 0) {
                    s += String.format("%n");
                }
            }
        }
        return s;
    }
}
