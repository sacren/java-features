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
    }
}
