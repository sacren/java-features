/**
 * Date class models the date between 1 and 9999 in Unix date format.
 *
 * <p>Day = [1, 31]
 * Month = [1, 12]
 * Year = [1, 9999]
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
 * +getDate():Trio
 * +isLeapYear():boolean
 * +getDayOfWeek():DayOfWeek
 * +getWednesday():DayOfWeek
 * +wedToFri():DayOfWeek
 * +fullDayOfWeek(dow:DayOfWeek):String
 * +shortDayOfWeek(dow:DayOfWeek):String
 * +narrowDayOfWeek(dow:DayOfWeek):String
 * +getMonth(month:int):Month
 * +fullMonthName(month:Month):String
 * +shortMonthName(month:Month):String
 * +narrowMonthName(month:Month):String
 * +toString():String
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Date {
    /** MONTHS static variables of the year. */
    public static final String[] MONTHS = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    /**
     * DAYS_IN_MONTH static variable shows how many days in each month of the
     * year.
     */
    public static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    /* private instance variable */
    private Trio date;

    /** Date default constructor of Unix epoch. */
    public Date() {
        date = new Trio(1970, 1, 1);
    }

    /** Date constructor for any date. */
    public Date(Trio date) {
        this();
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
        if (year < 1 && year > 9999) {
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

    /** Date setDay method sets the day of Date instance. */
    public void setDay(int day) {
        if (isLeapYear() && date.getSecondInt() == 2) {
            if (day < 1 || day > 29) {
                throw new IllegalArgumentException(
                        String.format("%d is invalid!", day));
            }
        } else {
            if (day < 1 || day > DAYS_IN_MONTH[date.getSecondInt() - 1]) {
                throw new IllegalArgumentException(
                        String.format("%d is invalid!", day));
            }
        }
        date.setThird(day);
    }

    /** Date getter for the date. */
    public Trio getDate() {
        return date;
    }

    /** Date isLeapYear method checks if it is a leap year. */
    public boolean isLeapYear() {
        GregorianCalendar gc = new GregorianCalendar();
        return gc.isLeapYear(date.getFirstInt());
    }

    /** Date getDayOfWeek method converts the date to day of the week. */
    public DayOfWeek getDayOfWeek() {
        return LocalDate.of(
                date.getFirstInt(),
                date.getSecondInt(),
                date.getThirdInt())
                .getDayOfWeek();
    }

    /** Date getWednesday method retrieves Wednesday out of DayOfWeek enum. */
    public DayOfWeek getWednesday() {
        return DayOfWeek.WEDNESDAY;
    }

    /** Date wedToFri method advances from Wednesday to Friday. */
    public DayOfWeek wedToFri() {
        DayOfWeek dow = DayOfWeek.WEDNESDAY;
        dow = dow.plus(2);
        return dow;
    }

    /** Date fullDayOfWeek method prints the full name of DayOfWeek. */
    public String fullDayOfWeek(DayOfWeek dow) {
        return dow.getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    /** Date shortDayOfWeek method prints the short name of DayOfWeek. */
    public String shortDayOfWeek(DayOfWeek dow) {
        return dow.getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /** Date narrowDayOfWeek method prints the narrow name of DayOfWeek. */
    public String narrowDayOfWeek(DayOfWeek dow) {
        return dow.getDisplayName(TextStyle.NARROW, Locale.getDefault());
    }

    /** Date getMonth method gets the month. */
    public Month getMonth(int month) {
        return Month.of(month);
    }

    /** Date fullMonthName method prints the full name of the month. */
    public String fullMonthName(Month month) {
        return month.getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    /** Date shortMonthName method prints the short name of the month. */
    public String shortMonthName(Month month) {
        return month.getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /** Date narrowMonthName method prints the narrow name of the month. */
    public String narrowMonthName(Month month) {
        return month.getDisplayName(TextStyle.NARROW, Locale.getDefault());
    }

    /**
     * Date String method shows the date in Unix format, e.g. Thu 1 Jan 1970.
     */
    public String toString() {
        return String.format(
                "%s %d %s %d%n%n"
                        + "=== Enums ===%n%n"
                        + "%s => %d%n"
                        + "%s => %d%n"
                        + "FULL:    %s%n"
                        + "SHORT:   %s%n"
                        + "NARROW:  %s%n"
                        + "FULL:    %s%n"
                        + "SHORT:   %s%n"
                        + "NARROW:  %s",
                shortDayOfWeek(getDayOfWeek()),
                date.getThirdInt(),
                MONTHS[date.getSecondInt() - 1],
                date.getFirstInt(),
                getWednesday(), getWednesday().getValue(),
                wedToFri(), wedToFri().getValue(),
                fullDayOfWeek(DayOfWeek.MONDAY),
                shortDayOfWeek(DayOfWeek.MONDAY),
                narrowDayOfWeek(DayOfWeek.MONDAY),
                fullMonthName(getMonth(date.getSecondInt())),
                shortMonthName(getMonth(date.getSecondInt())),
                narrowMonthName(getMonth(date.getSecondInt())));
    }
}
