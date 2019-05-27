/**
 * Test driver for Ball class.
 */
public class TestBall {
    /** Ball test driver. */
    public static void main(String[] args) {
        /* Ball instance */
        Ball ball = new Ball(new Point(11, 12), new Point(1, 2));
        System.out.println();
        System.out.println("=== Ball ===");
        System.out.println();
        System.out.println(ball);
        System.out.println();
        System.out.printf(
                "X-axis:       %.2f%n"
                        + "Y-axis:       %.2f%n"
                        + "X-axis speed: %.2f%n"
                        + "Y-axis speed: %.2f%n"
                        + "Position:     P%s%n"
                        + "Speed:         %s%n",
                ball.getX(),
                ball.getY(),
                ball.getSpdX(),
                ball.getSpdY(),
                ball.getPos(),
                ball.getSpd());
        /* update Ball instance */
        ball.setX(ball.getX() + 4);
        ball.setY(ball.getY() + 4);
        ball.setSpdX(ball.getSpdX() + 1);
        ball.setSpdY(ball.getSpdY() + 1);
        System.out.println();
        System.out.println("=== Update ball position and speed ===");
        System.out.println();
        System.out.println(ball);
        System.out.println();
        System.out.printf(
                "X-axis:       %.2f%n"
                        + "Y-axis:       %.2f%n"
                        + "X-axis speed: %.2f%n"
                        + "Y-axis speed: %.2f%n"
                        + "Position:     P%s%n"
                        + "Speed:         %s%n",
                ball.getX(),
                ball.getY(),
                ball.getSpdX(),
                ball.getSpdY(),
                ball.getPos(),
                ball.getSpd());
        System.out.println();
        System.out.println("=== Make one move ===");
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
