/**
 * Date class.
 *
 * <p>Private data with default values:
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
    /* public static data */
    public static final int DEFAULT_YEAR = 1776;
    public static final int DEFAULT_MONTH = 7;
    public static final int DEFAULT_DAY = 4;

    /* private instance data */
    private int year;
    private int month;
    private int day;

    /** Default constructor. */
    public Date() {
        this.year = DEFAULT_YEAR;
        this.month = DEFAULT_MONTH;
        this.day = DEFAULT_DAY;
    }

    /** Custom constructor. */
    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /** Public accessor of year. */
    public int getYear() {
        return year;
    }

    /** Public mutator of year. */
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", year));
        }
        this.year = year;
    }

    /** Public accessor of month. */
    public int getMonth() {
        return month;
    }

    /** Public mutator of month. */
    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", month));
        }
        this.month = month;
    }

    /** Public accessor of day. */
    public int getDay() {
        return day;
    }

    /** Public mutator of day. */
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", day));
        }
        this.day = day;
    }

    /** Public method for date. */
    public void setDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /** Date description: DD/MM/YYYY. */
    public String toString() {
        return String.format(
                "[%02d/%02d/%04d]",
                day,
                month,
                year);
    }
}
