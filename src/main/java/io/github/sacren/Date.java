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
 * +setDate():void
 * +setDate(date:Trio):void
 * +setYear(year:int):void
 * +setMonth(month:int):void
 * +setDay(day:int):void
 * +getDate():Trio
 * +toString():String
 */
public class Date {
    /* private instance variable */
    private Trio date;

    /** Date default constructor of Independence Day. */
    public Date() {
        setDate();
        setDate(new Trio(1776, 7, 4));
    }

    /** Date constructor for any date. */
    public Date(Trio date) {
        setDate();
        setDate(date);
    }

    /** Date setter for date initialization. */
    public void setDate() {
        date = new Trio();
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

    /** Date getter for the date. */
    public Trio getDate() {
        return date;
    }

    /** Date instance formatted string. */
    public String toString() {
        return String.format(
                "Year:  %04d%n"
                        + "Month: %02d%n"
                        + "Day:   %02d",
                date.getFirstInt(),
                date.getSecondInt(),
                date.getThirdInt());
    }
}
