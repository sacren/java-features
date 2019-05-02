/**
 * LeapYears class for all the leap years between AD1 and AD2020.
 *
 * <p>Private instance data:
 * -list:String
 * -count:int
 *
 * <p>Constructor:
 * +LeapYears()
 *
 * <p>Public methods:
 * +calc():void
 * +toString():String
 */
public class LeapYears {
    /* private static data */
    private static final int BEGIN = 1;
    private static final int END = 2020;

    /* private instance data */
    private String list;
    private int count;

    /** LeapYears constructor. */
    public LeapYears() {
        calc();
    }

    /** LeapYears method for list of leap years. */
    public void calc() {
        list = "";
        count = 0;
        for (int year = BEGIN; year <= END; year++) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                list += String.format("%5d", year);
                if (++count % 10 == 0) {
                    list += String.format("%n");
                }
            }
        }
    }

    /** LeapYears instance printout. */
    public String toString() {
        return String.format(
                "%s%n"
                        + "Total leap years: %d",
                list,
                count);
    }
}
