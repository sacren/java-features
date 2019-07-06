/**
 * Test driver for Rectangle class.
 */
public class TestRectangle {
    /** Circle test driver. */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=== Default rectangle ===");
        System.out.println();
        /* default rectangle */
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println();
        System.out.println("=== Rectangle with place holder ===");
        System.out.println();
        System.out.println(new Rectangle(r1));
        System.out.println();
        System.out.println(new Rectangle(null));
        System.out.println();
        Shape s = new Rectangle();
        System.out.println(new Rectangle((Rectangle) s));
        Rectangle r2 = new Rectangle(10);
        System.out.println();
        System.out.println(new Rectangle(r2));
        System.out.println();
        System.out.println("=== Rectangle with length ===");
        System.out.println();
        System.out.println(r2);
        System.out.println();
        System.out.println("=== Rectangle with length and width ===");
        Rectangle r3 = new Rectangle(22, 4);
        System.out.println();
        System.out.println(r3);
        System.out.println();
        System.out.println("=== Rectangle with color, length and width ===");
        Rectangle r4 = new Rectangle("orange", 102, 5);
        System.out.println();
        System.out.println(r4);
    }
}
