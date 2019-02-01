/**
 * Test driver for Line class.
 */
import java.util.Scanner;

public class TestLine {
    /** Test driver for Line. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        int beginX;
        System.out.print("Enter x-axis for begin point: ");
        beginX = inStream.nextInt();
        int beginY;
        System.out.print("Enter y-axis for begin point: ");
        beginY = inStream.nextInt();
        int endX;
        System.out.print("Enter x-axis for end point: ");
        endX = inStream.nextInt();
        int endY;
        System.out.print("Enter y-axis for end point: ");
        endY = inStream.nextInt();
        inStream.close();
        Line lineBy4 = new Line(beginX, beginY, endX, endY);
        Point from = new Point(beginX, beginY);
        Point to = new Point(endX, endY);
        Line line = new Line(from, to);
        System.out.println();
        System.out.printf(
                "%s%n"
                + "Begin Point %s%n"
                + "End Point %s%n"
                + "Line length is %.2f%n%n",
                lineBy4,
                lineBy4.getBegin(), /* invoke Point's toString() */
                lineBy4.getEnd(), /* invoke Point's toString() */
                lineBy4.getLength());
        System.out.printf("Now by a different constructor.%n%n");
        System.out.printf(
                "%s%n"
                + "Begin Point %s%n"
                + "End Point %s%n"
                + "Line length is %.2f%n%n",
                line,
                line.getBegin(), /* invoke Point's toString() */
                line.getEnd(), /* invoke Point's toString() */
                line.getLength());
        /* Test setter. */
        Point anotherBegin = new Point(beginX * 2, beginY / 2);
        Point anotherEnd = new Point(endX * 3, endY / 3);
        line.setBegin(anotherBegin);
        line.setEnd(anotherEnd);
        System.out.printf(
                "After begin and end points updated.%n%n"
                + "%s%n"
                + "Begin Point %s%n"
                + "End Point %s%n"
                + "Line length is %.2f%n%n",
                line,
                line.getBegin(),
                line.getEnd(),
                line.getLength());
        /* Reset begin and end to 0. */
        line.setBeginX(0);
        line.setBeginY(0);
        line.setEndX(0);
        line.setEndY(0);
        System.out.printf(
                "After begin and end points reset to 0.%n%n"
                + "%s%n"
                + "Begin Point (%d, %d)%n"
                + "End Point (%d, %d)%n"
                + "Line length is %.2f%n",
                line,
                line.getBeginX(),
                line.getBeginY(),
                line.getEndX(),
                line.getEndY(),
                line.getLength());
    }
}
