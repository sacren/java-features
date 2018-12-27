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
        setTime(second, minute, hour);
        this.originalSecond = second;
        this.originalMinute = minute;
        this.originalHour = hour;
    }

    /** Public accessor for second. */
    public int getSecond() {
        return second;
    }

    /** Public mutator for second. */
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid value for second!");
        }
    }

    /** Public accessor for minute. */
    public int getMinute() {
        return minute;
    }

    /** Public mutator for minute. */
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid value for minute!");
        }
    }

    /** Public accessor for hour. */
    public int getHour() {
        return hour;
    }

    /** Public mutator for hour. */
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid value for hour!");
        }
    }

    /** Public method to set time. */
    public void setTime(int second, int minute, int hour) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
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

    /** Restore instance to the original state. */
    public void setOriginalState() {
        second = originalSecond;
        minute = originalMinute;
        hour = originalHour;
    }

    /** Time description. */
    public String toString() {
        return String.format("[%02d:%02d:%02d]%n", hour, minute, second);
    }
}
