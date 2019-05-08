/**
 * Test driver for Ball class.
 */
public class TestBall {
    /** Ball test driver. */
    public static void main(String[] args) {
        /* Ball instance */
        Ball ball = new Ball(1, 2, 11, 12);
        System.out.println();
        System.out.println("=== Ball ===");
        System.out.println();
        System.out.println(ball);
        System.out.println();
        System.out.printf(
                "X axis:       %.2f%n"
                        + "Y axis:       %.2f%n"
                        + "X axis speed: %.2f%n"
                        + "Y axis speed: %.2f%n"
                        + "Position:     P%s%n"
                        + "Speed:        %s%n",
                ball.getX(),
                ball.getY(),
                ball.getXStep(),
                ball.getYStep(),
                ball.getPos(),
                ball.getSpeed());
        /* update Ball instance */
        ball.setX(ball.getX() * 2);
        ball.setY(ball.getY() * 2);
        ball.setXStep(ball.getXStep() + 1);
        ball.setYStep(ball.getYStep() + 1);
        ball.setSpeed(ball.getSpeed());
        System.out.println();
        System.out.println("=== Updata ball position and speed ===");
        System.out.println();
        System.out.println(ball);
        System.out.println();
        System.out.printf(
                "X axis:       %.2f%n"
                        + "Y axis:       %.2f%n"
                        + "X axis speed: %.2f%n"
                        + "Y axis speed: %.2f%n"
                        + "Position:     P%s%n"
                        + "Speed:        %s%n",
                ball.getX(),
                ball.getY(),
                ball.getXStep(),
                ball.getYStep(),
                ball.getPos(),
                ball.getSpeed());
        System.out.println();
        System.out.println("=== After we make a move ===");
        System.out.println();
        ball.move();
        System.out.println(ball);
        System.out.println();
        System.out.println("=== Make two additional moves ===");
        System.out.println();
        ball.move().move(); /* effect of chaining */
        System.out.println(ball);
    }
}
