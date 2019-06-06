/**
 * Date class.
 *
 * <p>Private instance data:
 * -year:int
 * -month:int
 * -day:int
 *
 * <p>Constructor:
 * +Date()
 * +Date(year:int, month,int, day:int)
 *
 * <p>Public methods:
 * +getYear():int
 * +setYear(year:int):void
 * +getMonth():int
 * +setMonth(month:int):void
 * +getDay():int
 * +setDay(day:int):void
 * +setDate(year:int, month:int, day:int):void
 * +toString():String
 */
public class Date {
    /* private static data */
    private static final int DEFAULT_YEAR = 1776;
    private static final int DEFAULT_MONTH = 7;
    private static final int DEFAULT_DAY = 4;

    /* private instance data */
    private int year;
    private int month;
    private int day;

    /** Date default constructor. */
    public Date() {
        this.year = DEFAULT_YEAR;
        this.month = DEFAULT_MONTH;
        this.day = DEFAULT_DAY;
    }

    /** Date custom constructor. */
    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /** Date getter of year. */
    public int getYear() {
        return year;
    }

    /** Date setter of year. */
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", year));
        }
        this.year = year;
    }

    /** Date getter of month. */
    public int getMonth() {
        return month;
    }

    /** Date setter of month. */
    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", month));
        }
        this.month = month;
    }

    /** Date getter of day. */
    public int getDay() {
        return day;
    }

    /** Date setter of day. */
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", day));
        }
        this.day = day;
    }

    /** Date method for date. */
    public void setDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /** Date instance printout. */
    public String toString() {
        return String.format(
                "[%02d/%02d/%04d]",
                day,
                month,
                year);
    }
}
