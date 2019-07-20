/**
 * KickBall subclass by Movable interface.
 *
 * <p>Private data:
 * -ball:Point = {10, 20}
 *
 * <p>Constructor:
 * +KickBall()
 * +KickBall(ball:Point)
 *
 * <p>Public methods:
 * +moveUp():void
 * +movdeDown():void
 * +moveLeft():void
 * +moveRight():void
 * +toString():String
 */
public class KickBall implements Movable {
    /* privata static data */
    private static final Point kick = new Point(1, 2);

    /* private instance data */
    private Point ball;

    /** KickBall default constructor. */
    public KickBall() {
        ball = new Point(10, 20);
    }

    /** KickBall custom constructor. */
    public KickBall(Point ball) {
        this.ball = ball;
    }

    /** KickBall method to move up the point. */
    @Override
    public void moveUp() {
        ball.setY(ball.getY() + kick.getY());
    }

    /** KickBall method to move down the point. */
    @Override
    public void moveDown() {
        ball.setY(ball.getY() - kick.getY());
    }

    /** KickBall method to move the point left. */
    @Override
    public void moveLeft() {
        ball.setX(ball.getX() - kick.getX());
    }

    /** KickBall method to move the point right. */
    @Override
    public void moveRight() {
        ball.setX(ball.getX() + kick.getX());
    }

    /** KickBall string method. */
    public String toString() {
        return String.format("%s", ball);
    }
}
