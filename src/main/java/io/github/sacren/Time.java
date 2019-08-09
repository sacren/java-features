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
    public static final Point3D DEFAULT_TIME = new Point3D(0, 0, 0);

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
    public Time(Point3D time) {
        setTime(time);
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
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for second!", second));
        }
        this.second = second;
    }

    /** Public accessor for minute. */
    public int getMinute() {
        return minute;
    }

    /** Public mutator for minute. */
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for minute!", minute));
        }
        this.minute = minute;
    }

    /** Public accessor for hour. */
    public int getHour() {
        return hour;
    }

    /** Public mutator for hour. */
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for hour!", hour));
        }
        this.hour = hour;
    }

    /** Public setter for specific time. */
    public void setTime(Point3D t) {
        setHour((int) t.getZ());
        setMinute((int) t.getY());
        setSecond((int) t.getZ());
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
        return String.format("[%02d:%02d:%02d]", hour, minute, second);
    }
}
