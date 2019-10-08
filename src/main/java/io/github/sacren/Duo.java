/**
 * Duo class for object with a pair of variables.
 *
 * <p>We identify Duo object by (doubleX, doubleY).  Broadly the pair could be
 * used for any object of two variables.  See Pension class for details.
 *
 * <p>Private instance variables with default values:
 * -doubleX:double = 0
 * -doubleY:double = 0
 *
 * <p>Constructor:
 * +Duo()
 * +Duo(intX:int, intY:int)
 * +Duo(doubleX:double, doubleY:double)
 *
 * <p>Public methods:
 * +setX(intX:int):void
 * +setX(doubleX:double):void
 * +setY(intY:int):void
 * +setY(doubleY:double):void
 * +getIntX():int
 * +getIntY():int
 * +getDoubleX():double
 * +getDoubleY():double
 * +getIntDuo():String
 * +getDoubleDuo():String
 * +toString():String
 */
public class Duo {
    /* private instance variables */
    private int intX;
    private int intY;
    private double doubleX;
    private double doubleY;
    private int which;

    /** Duo default constructor. */
    public Duo() {
        setX(0);
        setY(0);
    }

    /** Duo custom constructor for int. */
    public Duo(int intX, int intY) {
        setX(intX);
        setY(intY);
        which = 1;
    }

    /** Duo custom constructor. */
    public Duo(double doubleX, double doubleY) {
        setX(doubleX);
        setY(doubleY);
        which = 0;
    }

    /** Duo setter for integer variable on X-axis. */
    public void setX(int intX) {
        this.intX = intX;
    }

    /** Duo setter for variable on X-axis. */
    public void setX(double doubleX) {
        this.doubleX = doubleX;
    }

    /** Duo setter for integer variable on Y-axis. */
    public void setY(int intY) {
        this.intY = intY;
    }

    /** Duo setter for variable on Y-axis. */
    public void setY(double doubleY) {
        this.doubleY = doubleY;
    }

    /** Duo getter for integer variable on X-axis. */
    public int getIntX() {
        return intX;
    }

    /** Duo getter for integer variable on Y-axis. */
    public int getIntY() {
        return intY;
    }

    /** Duo getter for double variable on X-axis. */
    public double getDoubleX() {
        return doubleX;
    }

    /** Duo getter for double variable on Y-axis. */
    public double getDoubleY() {
        return doubleY;
    }

    /** Duo getter for integer string. */
    public String getIntDuo() {
        StringBuilder duo = new StringBuilder();
        duo.append(String.format("(%02d, %02d)", intX, intY));
        return duo.toString();
    }

    /** Duo getter for double string. */
    public String getDoubleDuo() {
        StringBuilder duo = new StringBuilder();
        duo.append(String.format("(%.2f, %.2f)", doubleX, doubleY));
        return duo.toString();
    }

    /** Duo instance formatted string. */
    public String toString() {
        StringBuilder duo = new StringBuilder();
        switch (which) {
            case 1:
                duo.append(getIntDuo());
                break;
            default:
                duo.append(getDoubleDuo());
                break;
        }
        return duo.toString();
    }
}
