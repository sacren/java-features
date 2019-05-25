/**
 * Ball class.
 *
 * <p>Private instance data:
 * -position:Point
 * -speed:Point
 *
 * <p>Constructor:
 * +Ball(position:Point, speed:Point)
 *
 * <p>Public methods:
 * +getX():double
 * +setX(axisX:double):void
 * +getY():double
 * +setY(axisY:double):void
 * +getXStep():double
 * +setXStep(axisXStep:double):void
 * +getYStep():double
 * +setYStep(axisYStep:double):void
 * +getPos():Point
 * +getSpeed():Point
 * +toString():String
 * +move():Ball
 */
public class Ball {
    /* private instance data */
    private Point position;
    private Point speed;

    /** Ball constructor by Point. */
    public Ball(Point position, Point speed) {
        this.position = position;
        this.speed = speed;
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

    /** Ball getter for axisXStep. */
    public double getXStep() {
        return speed.getX();
    }

    /** Ball setter for axisXStep. */
    public void setXStep(double axisXStep) {
        speed.setX(axisXStep);
    }

    /** Ball getter for axisYStep. */
    public double getYStep() {
        return speed.getY();
    }

    /** Ball setter for axisYStep. */
    public void setYStep(double axisYStep) {
        speed.setY(axisYStep);
    }

    /** Ball getter for the ball position. */
    public Point getPos() {
        return position;
    }

    /** Ball getter for ball speed. */
    public Point getSpeed() {
        return speed;
    }

    /** Ball string method. */
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
     * <p>Move a step incrementing x-axis by speed on x-axis and y-axis by
     * speed on y-axis.
     *
     * <p>Return this for chaining.
     */
    public Ball move() {
        position.setX(getX() + getXStep());
        position.setY(getY() + getYStep());
        return this;
    }
}
