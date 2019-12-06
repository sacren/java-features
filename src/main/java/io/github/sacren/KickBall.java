/**
 * KickBall subclass by Movable interface.
 *
 * <p>Private data:
 * -ball:Point = {10, 20}
 * -kick:Point = {1, 2}
 *
 * <p>Constructor:
 * +KickBall()
 * +KickBall(ball:Point, kick:Point)
 *
 * <p>Public methods:
 * +moveUp():void
 * +movdeDown():void
 * +moveLeft():void
 * +moveRight():void
 * +toString():String
 */
public class KickBall implements Movable {
    /* private instance data */
    private Point ball;
    private Point kick;

    /** KickBall default constructor. */
    public KickBall() {
        ball = new Point((double) 10, (double) 20);
        kick = new Point((double) 1, (double) 2);
    }

    /** KickBall custom constructor. */
    public KickBall(Point ball, Point kick) {
        this.ball = ball;
        this.kick = kick;
    }

    /** KickBall method to move up ball in y-axis direction. */
    @Override
    public void moveUp() {
        ball.setY(ball.getY() + kick.getY());
    }

    /** KickBall method to move down ball in y-axis direction. */
    @Override
    public void moveDown() {
        ball.setY(ball.getY() - kick.getY());
    }

    /** KickBall method to move ball left in x-axis direction. */
    @Override
    public void moveLeft() {
        ball.setX(ball.getX() - kick.getX());
    }

    /** KickBall method to move ball right in x-axis direction. */
    @Override
    public void moveRight() {
        ball.setX(ball.getX() + kick.getX());
    }

    /** KickBall string method. */
    public String toString() {
        return ball.toString();
    }
}
