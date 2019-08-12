/**
 * Date class.
 *
 * <p>Private instance data:
 * -date:Cube
 *
 * <p>Constructor:
 * +Date()
 * +Date(date:Cube)
 *
 * <p>Public methods:
 * +getYear():int
 * +setYear(year:int):void
 * +getMonth():int
 * +setMonth(month:int):void
 * +getDay():int
 * +setDay(day:int):void
 * +setDate(date:Cube):void
 * +toString():String
 */
public class Date {
    /* private instance data */
    private Cube date;

    /* initialize instance data */
    {
        date = new Cube(1776, 7, 4); /* Independence Day */
    }

    /** Date default constructor. */
    public Date() {
    }

    /** Date custom constructor. */
    public Date(Cube date) {
        this.date = date;
    }

    /** Date getter for the year. */
    public int getYear() {
        return (int) date.getX();
    }

    /** Date setter for the year. */
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", year));
        }
        date.setX(year);
    }

    /** Date getter for the month. */
    public int getMonth() {
        return (int) date.getY();
    }

    /** Date setter for the month. */
    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", month));
        }
        date.setY(month);
    }

    /** Date getter for the day. */
    public int getDay() {
        return (int) date.getZ();
    }

    /** Date setter for the day. */
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", day));
        }
        date.setZ(day);
    }

    /** Date setter for the date. */
    public void setDate(Cube date) {
        this.date = date;
    }

    /** Date string method. */
    public String toString() {
        return String.format(
                "Year:  %04d%n"
                        + "Month: %02d%n"
                        + "Day:   %02d",
                getYear(),
                getMonth(),
                getDay());
    }
}
