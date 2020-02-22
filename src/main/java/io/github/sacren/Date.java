/**
 * Date class models the date of Gregorian canlendar in Unix date format.
 *
 * <p>Day = [1, 31]
 * Month = [1, 12]
 * Year = [MIN_VALUE, MAX_VALUE]
 *
 * <p>Private instance variable:
 * -date:Trio
 * -localDate:LocalDate
 * -currentDate:LocalDate
 *
 * <p>Constructor:
 * +Date()
 * +Date(date:Trio)
 *
 * <p>Public methods:
 * +setDate(date:Trio):void
 * +getDate():Trio
 * +fullDayOfWeek(dow:DayOfWeek):String
 * +shortDayOfWeek(dow:DayOfWeek):String
 * +narrowDayOfWeek(dow:DayOfWeek):String
 * +fullMonthName(month:Month):String
 * +shortMonthName(month:Month):String
 * +narrowMonthName(month:Month):String
 * +dateOfNow():String
 * +toString():String
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

public class Date {
    /**
     * DAYS_IN_MONTH static variable shows how many days in each month of the
     * year.
     */
    public static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    /* private instance variables */
    private Trio date;
    private LocalDate localDate;
    private LocalDate currentDate;

    /** Date default constructor of Unix epoch. */
    public Date() {
        date = new Trio(1970, 1, 1);
        localDate = LocalDate.of(date.getFirstInt(), date.getSecondInt(), date.getThirdInt());
        currentDate = LocalDate.now();
    }

    /** Date constructor for any date. */
    public Date(Trio date) {
        this.date = new Trio();
        setDate(date);
    }

    /** Date setter for the date. */
    public void setDate(Trio date) {
        this.date.setFirst(date.getFirstInt());
        this.date.setSecond(date.getSecondInt());
        this.date.setThird(date.getThirdInt());
        localDate = LocalDate.of(
                this.date.getFirstInt(),
                this.date.getSecondInt(),
                this.date.getThirdInt());
        currentDate = LocalDate.now();
    }

    /** Date getter for the date. */
    public Trio getDate() {
        return date;
    }

    /** Date fullDayOfWeek method prints the full name of DayOfWeek. */
    public String fullDayOfWeek() {
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    /** Date shortDayOfWeek method prints the short name of DayOfWeek. */
    public String shortDayOfWeek() {
        return localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /** Date narrowDayOfWeek method prints the narrow name of DayOfWeek. */
    public String narrowDayOfWeek() {
        return localDate.getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.getDefault());
    }

    /** Date fullMonthName method prints the full name of the month. */
    public String fullMonthName() {
        return Month.of(date.getSecondInt()).getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    /** Date shortMonthName method prints the short name of the month. */
    public String shortMonthName() {
        return Month.of(date.getSecondInt()).getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /** Date narrowMonthName method prints the narrow name of the month. */
    public String narrowMonthName() {
        return Month.of(date.getSecondInt()).getDisplayName(TextStyle.NARROW, Locale.getDefault());
    }

    /** Date dateOfNow method prints the date of now. */
    public String dateOfNow() {
        return String.format(
                "%s %d %s %d",
                currentDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()),
                currentDate.getDayOfMonth(),
                currentDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()),
                currentDate.getYear());
    }

    /**
     * Date String method prints the date in Unix format, e.g. Thu 1 Jan 1970.
     */
    public String toString() {
        return String.format(
                "%s %d %s %d",
                shortDayOfWeek(),
                date.getThirdInt(),
                shortMonthName(),
                date.getFirstInt());
    }
}
