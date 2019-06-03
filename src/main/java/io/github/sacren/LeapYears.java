/**
 * LeapYears class for all the leap years between AD1 and AD2020.
 *
 * <p>Private instance data:
 * -count:int
 *
 * <p>Constructor:
 * +LeapYears()
 *
 * <p>Public methods:
 * +getLeap():String
 * +toString():String
 */
public class LeapYears {
    /* private static data */
    private static final int BEGIN = 1;
    private static final int END = 2020;

    /* private instance data */
    private int count;

    /** LeapYears constructor. */
    public LeapYears() {
        count = 0;
    }

    /** LeapYears getter for leap years in the range. */
    public String getLeap() {
        StringBuffer sb = new StringBuffer();
        for (int year = BEGIN; year <= END; year++) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                sb.append(String.format("%5d", year));
                if (++count % 10 == 0) {
                    sb.append(String.format("%n"));
                }
            }
        }
        return sb.toString();
    }

    /** LeapYears instance printout. */
    public String toString() {
        return String.format(
                "%s%n"
                        + "Total leap years: %d",
                getLeap(),
                count);
    }
}
