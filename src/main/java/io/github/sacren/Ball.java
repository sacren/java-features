/**
 * Ball class shows the position of the ball and the speed at that position.
 * Position is represented by Point instance and speed by Duo instance.
 *
 * <p>Private instance variables:
 * -position:Point
 * -speed:Duo
 *
 * <p>Constructor:
 * +Ball()
 * +Ball(position:Point, speed:Duo)
 *
 * <p>Public methods:
 * +setPosition(position:Point):void
 * +setSpeed(speed:Duo):void
 * +getPosition():Point
 * +getSpeed():Duo
 * +move():Ball
 * +toString():String
 */
public class Ball {
    /* private instance variables */
    private Point position;
    private Duo speed;

    /** Ball default constructor. */
    public Ball() {
        position = new Point();
        speed = new Duo((double) 0, (double) 0);
    }

    /** Ball constructor with Point and Duo parameter. */
    public Ball(Point position, Duo speed) {
        this();
        setPosition(position);
        setSpeed(speed);
    }

    /** Ball setPosition method sets new position of the ball. */
    public void setPosition(Point position) {
        this.position.setFirst(position.getFirstDbl());
        this.position.setSecond(position.getSecondDbl());
    }

    /** Ball setSpeed method sets new speed of the ball. */
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

    /**
     * Ball move method moves the ball by steps.
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

    /** Ball String method shows the formatted string of Ball instance. */
    public String toString() {
        return String.format(
                "Position: P%s%n"
                        + "Speed:     %s",
                position,
                speed);
    }
}
