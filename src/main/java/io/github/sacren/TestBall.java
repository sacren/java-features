/**
 * Test driver for Ball class.
 */
public class TestBall {
    /** Ball test driver. */
    public static void main(String[] args) {
        /* Ball instance: individual values must be double. */
        Ball ball = new Ball(new Point(11, 12), new Duo((double) 1, (double) 2));
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
                ball.getPosition().getFirstDbl(),
                ball.getPosition().getSecondDbl(),
                ball.getSpeed().getFirstDbl(),
                ball.getSpeed().getSecondDbl(),
                ball.getPosition(),
                ball.getSpeed());
        /* update Ball instance */
        double positionX = ball.getPosition().getFirstDbl() + 4;
        double positionY = ball.getPosition().getSecondDbl() + 4;
        ball.setPosition(new Point(positionX, positionY));
        double speedX = ball.getSpeed().getFirstDbl() + 1;
        double speedY = ball.getSpeed().getSecondDbl() + 1;
        ball.setSpeed(new Duo(speedX, speedY));
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
                ball.getPosition().getFirstDbl(),
                ball.getPosition().getSecondDbl(),
                ball.getSpeed().getFirstDbl(),
                ball.getSpeed().getSecondDbl(),
                ball.getPosition(),
                ball.getSpeed());
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
