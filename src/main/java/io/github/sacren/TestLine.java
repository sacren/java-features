/**
 * Test driver for Line class.
 */
import java.util.Scanner;

public class TestLine {
    /** Line test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beginX;
        System.out.print("Enter x-axis for begin point: ");
        beginX = in.nextInt();
        int beginY;
        System.out.print("Enter y-axis for begin point: ");
        beginY = in.nextInt();
        int endX;
        System.out.print("Enter x-axis for end point: ");
        endX = in.nextInt();
        int endY;
        System.out.print("Enter y-axis for end point: ");
        endY = in.nextInt();
        in.close();
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
        line.setBegin(new Point(line.getBeginX() * 2, line.getBeginY() / 2));
        line.setEnd(new Point(line.getEndX() * 3, line.getEndY() / 3));
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
