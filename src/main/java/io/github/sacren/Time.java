/**
 * Time class.
 *
 * <p>Private instance data:
 * -time:Cube
 * -st:Cube
 *
 * <p>Constructor:
 * +Time()
 * +Time(time:Cube)
 *
 * <p>Public methods:
 * +setTime(time:Cube):void
 * +setStartTime():void
 * +setSecond(second:int):void
 * +setMinute(minute:int):void
 * +setHour(hour:int):void
 * +nextSecond():Time
 * +restoreTime():void
 * +getSecond():int
 * +getMinute():int
 * +getHour():int
 * +toString():String
 */
public class Time {
    /* private instance data */
    private Cube time;
    private Cube st;

    /** Time default constructor. */
    public Time() {
        setDefTime();
        setStartTime();
    }

    /** Time custom constructor. */
    public Time(Cube time) {
        setTime(time);
        setStartTime();
    }

    /** Time setter for default time. */
    public void setDefTime() {
        time = new Cube(0, 0, 0);
    }

    /** Time setter for specific time. */
    public void setTime(Cube time) {
        this.time = new Cube();
        setSecond((int) time.getX());
        setMinute((int) time.getY());
        setHour((int) time.getZ());
    }

    /** Time setter for the second. */
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for second!", second));
        }
        time.setX(second);
    }

    /** Time setter for the minute. */
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for minute!", minute));
        }
        time.setY(minute);
    }

    /** Time setter for the hour. */
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for hour!", hour));
        }
        time.setZ(hour);
    }

    /** Time setter for start time. */
    public void setStartTime() {
        st = new Cube(time.getX(), time.getY(), time.getZ());
    }

    /** Time getter for time by one second increment. */
    public Time nextSecond() {
        time.setX(time.getX() + 1);
        if (time.getX() == 60) {
            time.setX(0);
            time.setY(time.getY() + 1);
        }
        if (time.getY() == 60) {
            time.setY(0);
            time.setZ(time.getZ() + 1);
        }
        if (time.getZ() == 24) {
            time.setZ(0);
        }
        return this;
    }

    /** Restore time to the start value. */
    public void restoreTime() {
        time = st;
    }

    /** Time getter for the second. */
    public int getSecond() {
        return (int) time.getX();
    }

    /** Time getter for the minute. */
    public int getMinute() {
        return (int) time.getY();
    }

    /** Time getter for the hour. */
    public int getHour() {
        return (int) time.getZ();
    }

    /** Time string method. */
    public String toString() {
        return String.format(
                "Current time: %02d:%02d:%02d",
                getHour(),
                getMinute(),
                getSecond());
    }
}
