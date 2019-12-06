/**
 * Test driver for KickBall.
 */
public class TestKickBall {
    /** KickBall test driver. */
    public static void main(String[] args) {
        /* default KickBall */
        Movable ball = new KickBall();
        System.out.println();
        System.out.println("=== Start point ===");
        System.out.println();
        System.out.println(ball);
        System.out.println();
        System.out.println("=== Move up ===");
        System.out.println();
        ball.moveUp();
        System.out.println(ball);
        System.out.println();
        System.out.println("=== Move right ===");
        System.out.println();
        ball.moveRight();
        System.out.println(ball);
        System.out.println();
        System.out.println("=== Move down ===");
        System.out.println();
        ball.moveDown();
        System.out.println(ball);
        System.out.println();
        System.out.println("=== Move left ===");
        System.out.println();
        ball.moveLeft();
        System.out.println(ball);
        Movable another = new KickBall(new Point((double) 3, (double) 4), new Point());
        System.out.println();
        System.out.println("=== Another Ball ===");
        System.out.println();
        System.out.println(another);
    }
}
