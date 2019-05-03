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
        System.out.println();
        System.out.println("=== Line by 4 integers ===");
        System.out.println();
        System.out.println(new Line(beginX, beginY, endX, endY));
        System.out.println();
        System.out.println("=== Line by 2 points ===");
        System.out.println();
        Line line = new Line(new Point(beginX, beginY), new Point(endX, endY));
        System.out.println(line);
        /* update line points. */
        line.setBegin(new Point(beginX * 2, beginY / 2));
        line.setEnd(new Point(endX * 3, endY / 3));
        System.out.println();
        System.out.println("=== Update line points ===");
        System.out.println();
        System.out.println(line);
        /* reset line points to all 0's. */
        line.setBeginX(0);
        line.setBeginY(0);
        line.setEndX(0);
        line.setEndY(0);
        System.out.println();
        System.out.println("=== Reset points to 0 ===");
        System.out.println();
        System.out.println(line);
    }
}
