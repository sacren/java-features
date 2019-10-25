/**
 * Time class models the hour, the minute and the second of time.
 *
 * <p>Private instance variables:
 * -time:Trio
 * -st:Trio
 *
 * <p>Constructor:
 * +Time()
 * +Time(time:Trio)
 *
 * <p>Public methods:
 * +setTime():void
 * +setTime(time:Trio):void
 * +setStartTime():void
 * +setHour(hour:int):void
 * +setMinute(minute:int):void
 * +setSecond(second:int):void
 * +nextSecond():Time
 * +restoreTime():void
 * +getSecond():int
 * +getMinute():int
 * +getHour():int
 * +toString():String
 */
public class Time {
    /* declare private instance variables */
    private Trio time;
    private Trio st;

    /** Time default constructor. */
    public Time() {
        setTime();
        setStartTime();
    }

    /** Time constructor with Trio object for parameter. */
    public Time(Trio time) {
        setTime(time);
        setStartTime();
    }

    /** Time setter for zero hour. */
    public void setTime() {
        time = new Trio();
    }

    /** Time setter for specific time. */
    public void setTime(Trio time) {
        setTime();
        setHour(time.getFirstInt());
        setMinute(time.getSecondInt());
        setSecond(time.getThirdInt());
    }

    /** Time setter for the hour. */
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for hour!", hour));
        }
        time.setFirst(hour);
    }

    /** Time setter for the minute. */
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for minute!", minute));
        }
        time.setSecond(minute);
    }

    /** Time setter for the second. */
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for second!", second));
        }
        time.setThird(second);
    }

    /** Time setter for start time. */
    public void setStartTime() {
        st = new Trio(time.getFirstInt(), time.getSecondInt(), time.getThirdInt());
    }

    /** Time getter for time by one second increment. */
    public Time nextSecond() {
        int second = getSecond();
        int minute = getMinute();
        int hour = getHour();

        if (++second == 60) {
            second = 0;
            minute++;
        }

        if (minute == 60) {
            minute = 0;
            hour++;
        }

        if (hour == 24) {
            hour = 0;
        }

        setTime(new Trio(hour, minute, second));
        return this;
    }

    /** Restore Time instance to the start state. */
    public void restoreTime() {
        setTime(st);
    }

    /** Time getter for the hour. */
    public int getHour() {
        return time.getFirstInt();
    }

    /** Time getter for the minute. */
    public int getMinute() {
        return time.getSecondInt();
    }

    /** Time getter for the second. */
    public int getSecond() {
        return time.getThirdInt();
    }

    /** Time instance formatted string. */
    public String toString() {
        return String.format(
                "Current time: %02d:%02d:%02d",
                getHour(),
                getMinute(),
                getSecond());
    }
}
