/**
 * Ball class.
 *
 * <p>Private instance variables:
 * -position:Point
 * -speed:Point
 *
 * <p>Constructor:
 * +Ball(position:Point, speed:Point)
 *
 * <p>Public methods:
 * +setInitPos(position:Point):void
 * +setInitSpd(speed:Duo):void
 * +getX():double
 * +setX(axisX:double):void
 * +getY():double
 * +setY(axisY:double):void
 * +getSpdX():double
 * +setSpdX(spdX:double):void
 * +getSpdY():double
 * +setSpdY(spdY:double):void
 * +getPos():Point
 * +getSpd():Point
 * +toString():String
 * +move():Ball
 */
public class Ball {
    /* private instance variables */
    private Point position;
    private Point speed;

    /** Ball constructor by Point. */
    public Ball(Point position, Point speed) {
        setInitPos(position);
        setInitSpd(speed);
    }

    /** Ball setter for ball initial position. */
    public void setInitPos(Point position) {
        this.position = new Point(position.getX(), position.getY());
    }

    /** Ball setter for ball initial speed. */
    public void setInitSpd(Point speed) {
        this.speed = new Point(speed.getX(), speed.getY());
    }

    /** Ball getter for axisX. */
    public double getX() {
        return position.getX();
    }

    /** Ball setter for axisX. */
    public void setX(double axisX) {
        position.setX(axisX);
    }

    /** Ball getter for axisY. */
    public double getY() {
        return position.getY();
    }

    /** Ball setter for axisY. */
    public void setY(double axisY) {
        position.setY(axisY);
    }

    /** Ball getter for speed on x-axis. */
    public double getSpdX() {
        return speed.getX();
    }

    /** Ball setter for speed on x-axis. */
    public void setSpdX(double spdX) {
        speed.setX(spdX);
    }

    /** Ball getter for speed on y-axis. */
    public double getSpdY() {
        return speed.getY();
    }

    /** Ball setter for speed on y-axis. */
    public void setSpdY(double spdY) {
        speed.setY(spdY);
    }

    /** Ball getter for the ball position. */
    public Point getPos() {
        return position;
    }

    /** Ball getter for ball speed. */
    public Point getSpd() {
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
     * <p>Move a step by adding speed on x-axis and on y-axis to the position.
     *
     * <p>Return this for chaining.
     */
    public Ball move() {
        position.setX(getX() + getSpdX());
        position.setY(getY() + getSpdY());
        return this;
    }
}
