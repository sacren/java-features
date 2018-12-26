/**
 * Time class.
 *
 * <p>Private data with default values:
 * -originalSecond:int
 * -originalMinute:int
 * -originalHour:int
 * -second:int = 0
 * -minute:int = 0
 * -hour:int = 0
 *
 * <p>Constructor:
 * +Time()
 * +Time(second:int, minute:int, hour:int)
 *
 * <p>Public methods:
 * +getSecond():int
 * +setSecond(second:int):void
 * +getMinute():int
 * +setMinute(minute:int):void
 * +getHour():int
 * +setHour(hour:int):void
 * +setTime(second:int, minute:int, hour:int):void
 * +nextSecond():Time
 * +toString():String
 */
public class Time {
    /* public static data */
    public static final int DEFAULT_SECOND = 0;
    public static final int DEFAULT_MINUTE = 0;
    public static final int DEFAULT_HOUR = 0;

    /* private instance data */
    private int originalSecond;
    private int originalMinute;
    private int originalHour;
    private int second;
    private int minute;
    private int hour;

    /** Default constructor. */
    public Time() {
        this.second = DEFAULT_SECOND;
        this.minute = DEFAULT_MINUTE;
        this.hour = DEFAULT_HOUR;
    }

    /** Custom constructor. */
    public Time(int second, int minute, int hour) {
        this.originalSecond = second;
        this.originalMinute = minute;
        this.originalHour = hour;
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    /** Public accessor for original second. */
    public int getOriginalSecond() {
        return originalSecond;
    }

    /** Public accessor for original minute. */
    public int getOriginalMinute() {
        return originalMinute;
    }

    /** Public accessor for original hour. */
    public int getOriginalHour() {
        return originalHour;
    }

    /** Public accessor for second. */
    public int getSecond() {
        return second;
    }

    /** Public mutator for second. */
    public void setSecond(int second) {
        this.second = second;
    }

    /** Public accessor for minute. */
    public int getMinute() {
        return minute;
    }

    /** Public mutator for minute. */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /** Public accessor for hour. */
    public int getHour() {
        return hour;
    }

    /** Public mutator for hour. */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /** Public method to set time. */
    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    /** Public method to advance time by one second. */
    public Time nextSecond() {
        if (++second == 60) {
            second = 0;
            if (++minute == 60) {
                minute = 0;
                if (++hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    /** Time description. */
    public String toString() {
        return String.format("[%02d:%02d:%02d]%n", hour, minute, second);
    }
}
