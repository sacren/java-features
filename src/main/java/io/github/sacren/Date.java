/**
 * Date class models the year, the month and the day of the date.
 *
 * <p>Private instance variable:
 * -date:Cube
 *
 * <p>Constructor:
 * +Date()
 * +Date(date:Cube)
 *
 * <p>Public methods:
 * +setDate(date:Cube):void
 * +setYear(year:int):void
 * +setMonth(month:int):void
 * +setDay(day:int):void
 * +getYear():int
 * +getMonth():int
 * +getDay():int
 * +toString():String
 */
public class Date {
    /* private instance variable */
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
        setDate(date);
    }

    /** Date setter for the date. */
    public void setDate(Cube date) {
        setYear((int) date.getX());
        setMonth((int) date.getY());
        setDay((int) date.getZ());
    }

    /** Date setter for the year. */
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", year));
        }
        date.setX(year);
    }

    /** Date setter for the month. */
    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", month));
        }
        date.setY(month);
    }

    /** Date setter for the day. */
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", day));
        }
        date.setZ(day);
    }

    /** Date getter for the year. */
    public int getYear() {
        return (int) date.getX();
    }

    /** Date getter for the month. */
    public int getMonth() {
        return (int) date.getY();
    }

    /** Date getter for the day. */
    public int getDay() {
        return (int) date.getZ();
    }

    /** Date instance formatted string. */
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
