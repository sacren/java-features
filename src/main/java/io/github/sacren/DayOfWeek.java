/**
 * DayOfWeek class.
 *
 * <p>Conversion to day of the week:
 * 0 - Sunday
 * 1 - Monday
 * 2 - Tuesday
 * 3 - Wednesday
 * 4 - Thursday
 * 5 - Friday
 * 6 - Saturday
 *
 * <p>Private data:
 * -day:int
 *
 * <p>Constructor:
 * +DayOfWeek(day:int)
 *
 * <p>Public methods:
 * +setDay(day:int):void
 * +toString():String
 */
public class DayOfWeek {
    /* private data */
    private int day;

    /** DayOfWeek constructor. */
    public DayOfWeek(int day) {
        setDay(day);
    }

    /** DayOfWeek method for the day of the week. */
    public void setDay(int day) {
        if (day < 0 || day > 6) {
            throw new IllegalArgumentException(
                    String.format("%d is out of day range!", day));
        }
        this.day = day;
    }

    /** DayOfWeek instance printout. */
    public String toString() {
        String[] weekDay = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };
        return String.format(
                "%d is for %s",
                day,
                weekDay[day]);
    }
}
