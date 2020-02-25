/**
 * Date class models the date of Gregorian canlendar in Unix date format.
 *
 * <p>Day = [1, 31]
 * Month = [1, 12]
 * Year = [MIN_VALUE, MAX_VALUE]
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
 * +getDate():Trio
 * +fullDayOfWeek(dow:DayOfWeek):String
 * +shortDayOfWeek(dow:DayOfWeek):String
 * +narrowDayOfWeek(dow:DayOfWeek):String
 * +fullMonthName(month:Month):String
 * +shortMonthName(month:Month):String
 * +narrowMonthName(month:Month):String
 * +dateOfNow():String
 * +nextMonday():String
 * +toString():String
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Date {
    /* private instance variables */
    private Trio date;

    /** Date default constructor of Unix epoch. */
    public Date() {
        date = new Trio(1970, 1, 1);
    }

    /** Date constructor for any date. */
    public Date(Trio date) {
        this.date = new Trio();
        setDate(date);
    }

    /** Date setter for the date. */
    public void setDate(Trio date) {
        /* first check if date object has valid values */
        LocalDate.of(date.getFirstInt(), date.getSecondInt(), date.getThirdInt());
        this.date.setFirst(date.getFirstInt());
        this.date.setSecond(date.getSecondInt());
        this.date.setThird(date.getThirdInt());
    }

    /** Date getter for the date. */
    public Trio getDate() {
        return date;
    }

    /** Date fullDayOfWeek method prints the full name of DayOfWeek. */
    public String fullDayOfWeek() {
        return LocalDate.of(date.getFirstInt(), date.getSecondInt(), date.getThirdInt())
            .getDayOfWeek()
            .getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    /** Date shortDayOfWeek method prints the short name of DayOfWeek. */
    public String shortDayOfWeek() {
        return LocalDate.of(date.getFirstInt(), date.getSecondInt(), date.getThirdInt())
            .getDayOfWeek()
            .getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /** Date narrowDayOfWeek method prints the narrow name of DayOfWeek. */
    public String narrowDayOfWeek() {
        return LocalDate.of(date.getFirstInt(), date.getSecondInt(), date.getThirdInt())
            .getDayOfWeek()
            .getDisplayName(TextStyle.NARROW, Locale.getDefault());
    }

    /** Date fullMonthName method prints the full name of the month. */
    public String fullMonthName() {
        return Month.of(date.getSecondInt())
            .getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    /** Date shortMonthName method prints the short name of the month. */
    public String shortMonthName() {
        return Month.of(date.getSecondInt())
            .getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /** Date narrowMonthName method prints the narrow name of the month. */
    public String narrowMonthName() {
        return Month.of(date.getSecondInt())
            .getDisplayName(TextStyle.NARROW, Locale.getDefault());
    }

    /** Date dateOfNow static method prints the date of now. */
    public static String dateOfNow() {
        LocalDate cd = LocalDate.now();
        return String.format(
                "%s %d %s %d",
                cd.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()),
                cd.getDayOfMonth(),
                cd.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()),
                cd.getYear());
    }

    /** Date nextMonday static method prints the date of next Wednesday. */
    public static String nextMonday() {
        LocalDate nm = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        return String.format(
                "%s %d %s %d",
                nm.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()),
                nm.getDayOfMonth(),
                nm.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()),
                nm.getYear());
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
