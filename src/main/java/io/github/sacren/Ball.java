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
 * +getPosX():double
 * +setPosX(posX:double):void
 * +getPosY():double
 * +setPosY(posY:double):void
 * +getSpdX():double
 * +setSpdX(spdX:double):void
 * +getSpdY():double
 * +setSpdY(spdY:double):void
 * +getPosition():Point
 * +getSpeed():Point
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

    /** Ball getter for ball position on X-axis. */
    public double getPosX() {
        return position.getX();
    }

    /** Ball setter for ball position on X-axis. */
    public void setPosX(double posX) {
        position.setX(posX);
    }

    /** Ball getter for ball position on Y-axis. */
    public double getPosY() {
        return position.getY();
    }

    /** Ball setter for position on Y-axis. */
    public void setPosY(double posY) {
        position.setY(posY);
    }

    /** Ball getter for speed on X-axis. */
    public double getSpdX() {
        return speed.getX();
    }

    /** Ball setter for speed on X-axis. */
    public void setSpdX(double spdX) {
        speed.setX(spdX);
    }

    /** Ball getter for speed on Y-axis. */
    public double getSpdY() {
        return speed.getY();
    }

    /** Ball setter for speed on Y-axis. */
    public void setSpdY(double spdY) {
        speed.setY(spdY);
    }

    /** Ball getter for the ball position. */
    public Point getPosition() {
        return position;
    }

    /** Ball getter for the ball speed. */
    public Point getSpeed() {
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
        position.setX(getPosX() + getSpdX());
        position.setY(getPosY() + getSpdY());
        return this;
    }
}
