/**
 * Ball class.
 *
 * <p>Private instance variables:
 * -position:Point
 * -speed:Duo
 *
 * <p>Constructor:
 * +Ball(position:Point, speed:Duo)
 *
 * <p>Public methods:
 * +setPosition():void
 * +setPosition(position:Point):void
 * +setSpeed():void
 * +setSpeed(speed:Duo):void
 * +getPosition():Point
 * +getSpeed():Duo
 * +toString():String
 * +move():Ball
 */
public class Ball {
    /* private instance variables */
    private Point position;
    private Duo speed;

    /** Ball constructor by Point. */
    public Ball(Point position, Duo speed) {
        setPosition();
        setPosition(position);
        setSpeed();
        setSpeed(speed);
    }

    /** Ball setter for initial ball position. */
    public void setPosition() {
        /* avoid origin (0, 0) to initialize point */
        position = new Point(1, 1);
    }

    /** Ball setter to update ball position. */
    public void setPosition(Point position) {
        this.position.setFirst(position.getFirstDbl());
        this.position.setSecond(position.getSecondDbl());
    }

    /** Ball setter for initial ball speed. */
    public void setSpeed() {
        speed = new Duo((double) 0, (double) 0);
    }

    /** Ball setter to update ball speed. */
    public void setSpeed(Duo speed) {
        this.speed.setFirst(speed.getFirstDbl());
        this.speed.setSecond(speed.getSecondDbl());
    }

    /** Ball getter for the ball position. */
    public Point getPosition() {
        return position;
    }

    /** Ball getter for the ball speed. */
    public Duo getSpeed() {
        return speed;
    }

    /** Ball formatted string. */
    public String toString() {
        return String.format(
                "Position: P%s%n"
                        + "Speed:     %s",
                position,
                speed);
    }

    /**
     * Ball public method for making steps.
     *
     * <p>Move a step by adding speed on X-axis and on Y-axis to the position.
     *
     * <p>Return the updated object for chaining.
     */
    public Ball move() {
        position.setFirst(position.getFirstDbl() + speed.getFirstDbl());
        position.setSecond(position.getSecondDbl() + speed.getSecondDbl());
        return this;
    }
}
