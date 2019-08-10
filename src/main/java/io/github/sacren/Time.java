/**
 * Time class.
 *
 * <p>Private instance data:
 * -time:Point3D
 * -st:Point3D
 *
 * <p>Constructor:
 * +Time()
 * +Time(time:Point3D)
 *
 * <p>Public methods:
 * +setTime(time:Point3D):void
 * +setStartTime():void
 * +nextSecond():Time
 * +toString():String
 */
public class Time {
    /* public static data */
    public static final Point3D DEFAULT_TIME = new Point3D(0, 0, 0);

    /* private instance data */
    private Point3D time;
    private Point3D st;

    /** Default constructor. */
    public Time() {
        time = DEFAULT_TIME;
        st = DEFAULT_TIME;
    }

    /** Custom constructor. */
    public Time(Point3D time) {
        setTime(time);
        setStartTime();
    }

    /** Public setter for specific time. */
    public void setTime(Point3D time) {
        if (time.getX() < 0 || time.getX() >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for second!", (int) time.getX()));
        }
        if (time.getY() < 0 || time.getY() >= 60) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for minute!", (int) time.getY()));
        }
        if (time.getZ() < 0 || time.getZ() >= 24) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid value for hour!", (int) time.getZ()));
        }
        this.time = time;
    }

    /** Public setter for start time. */
    public void setStartTime() {
        st = new Point3D(time.getX(), time.getY(), time.getZ());
    }

    /** Public getter for time by one second. */
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

    /** Restore time to the original state. */
    public void setOriginalState() {
        time = st;
    }

    /** Time string method. */
    public String toString() {
        return String.format(
                "Current time: %02d:%02d:%02d",
                (int) time.getZ(),
                (int) time.getY(),
                (int) time.getX());
    }
}
