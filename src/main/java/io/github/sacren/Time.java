/**
 * Time class models the hour, the minute and the second of time.
 *
 * <p>Time display format: hh:mm:ss
 *
 * <p>Hour = [0, 23]
 * Minute = [0, 59]
 * Second = [0, 59]
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
 * +setGoodTime(time:Trio):void
 * +setStartTime():void
 * +setHour(hour:int):void
 * +setMinute(minute:int):void
 * +setSecond(second:int):void
 * +nextSecond():Time
 * +prevSecond():Time
 * +restoreTime():Time
 * +zeroHour():Time
 * +toString():String
 */
public class Time {
    /* declare private instance variables */
    private Trio time;
    private Trio st;

    /** Time default constructor. */
    public Time() {
        setTime();
    }

    /** Time constructor with Trio object for parameter. */
    public Time(Trio time) {
        this();
        setTime(time);
        setStartTime();
    }

    /** Time setter for zero hour. */
    public void setTime() {
        time = new Trio();
        st = new Trio();
    }

    /** Time setter for specific time. */
    public void setTime(Trio time) {
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

    /** Time setGoodTime method resets time with known good value. */
    public void setGoodTime(Trio time) {
        this.time.setFirst(time.getFirstInt());
        this.time.setSecond(time.getSecondInt());
        this.time.setThird(time.getThirdInt());
    }

    /** Time setter for start time. */
    public void setStartTime() {
        st.setFirst(time.getFirstInt());
        st.setSecond(time.getSecondInt());
        st.setThird(time.getThirdInt());
    }

    /** Time method increments time by one second. */
    public Time nextSecond() {
        int hour = time.getFirstInt();
        int minute = time.getSecondInt();
        int second = time.getThirdInt();
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
        setGoodTime(new Trio(hour, minute, second));
        return this;
    }

    /** Time prevSecond method decrements time by one second. */
    public Time prevSecond() {
        int hour = time.getFirstInt();
        int minute = time.getSecondInt();
        int second = time.getThirdInt();
        if (--second == -1) {
            second = 59;
            minute--;
        }
        if (minute == -1) {
            minute = 59;
            hour--;
        }
        if (hour == -1) {
            hour = 23;
        }
        setGoodTime(new Trio(hour, minute, second));
        return this;
    }

    /** Restore Time instance to the start state. */
    public Time restoreTime() {
        setGoodTime(st);
        return this;
    }

    /** Time zeroHour method resets time to zero hour. */
    public Time zeroHour() {
        setGoodTime(new Trio(0, 0, 0));
        return this;
    }

    /** Time getter for the current time. */
    public Trio getTime() {
        return time;
    }

    /** Time instance formatted string. */
    public String toString() {
        return String.format(
                "Current time: %02d:%02d:%02d",
                time.getFirstInt(),
                time.getSecondInt(),
                time.getThirdInt());
    }
}
