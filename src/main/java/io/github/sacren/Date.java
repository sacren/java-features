/**
 * Date class models the year, the month and the day of the date.
 *
 * <p>Private instance variable:
 * -date:Trio
 *
 * <p>Constructor:
 * +Date()
 * +Date(date:Trio)
 *
 * <p>Public methods:
 * +setDate(date:Trio):void
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
    private Trio date;

    /* initialize instance data */
    {
        date = new Trio(1776, 7, 4); /* Independence Day */
    }

    /** Date default constructor. */
    public Date() {
    }

    /** Date custom constructor. */
    public Date(Trio date) {
        setDate(date);
    }

    /** Date setter for the date. */
    public void setDate(Trio date) {
        setYear(date.getFirstInt());
        setMonth(date.getSecondInt());
        setDay(date.getThirdInt());
    }

    /** Date setter for the year. */
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", year));
        }
        date.setFirst(year);
    }

    /** Date setter for the month. */
    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", month));
        }
        date.setSecond(month);
    }

    /** Date setter for the day. */
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", day));
        }
        date.setThird(day);
    }

    /** Date getter for the year. */
    public int getYear() {
        return date.getFirstInt();
    }

    /** Date getter for the month. */
    public int getMonth() {
        return date.getSecondInt();
    }

    /** Date getter for the day. */
    public int getDay() {
        return date.getThirdInt();
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
