/**
 * Triangle subclass extends Shape superclass.
 *
 * <p>Private instance data:
 * -bh:Point
 *
 * <p>Constructor:
 * +Triangle()
 * +Triangle(bh:Point)
 *
 * <p>Public methods:
 * +getBase():double
 * +setBase(base:double):void
 * +getHeight():double
 * +setHeight(height:double):void
 * +setTriangle(base:double, height:double):void
 * +setTriangle(bh:Point):void
 * +toString():String
 */
public class Triangle extends Shape {
    /* private instance data */
    private Point bh;

    /** Triangle default constructor. */
    public Triangle() {
        super("brown"); /* triangle instance default color */
        bh = new Point(3, 4);
    }

    /** Triangle constructor with Point. */
    public Triangle(Point bh) {
        this();
        setTriangle(bh);
    }

    /** Triangle getter for the base. */
    public double getBase() {
        return bh.getX();
    }

    /** Triangle setter for the base. */
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", base));
        }
        bh.setX(base);
    }

    /** Triangle getter for the height. */
    public double getHeight() {
        return bh.getY();
    }

    /** Triangle setter for the height. */
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", height));
        }
        bh.setY(height);
    }

    /** Triangle setter for both base and height. */
    public void setTriangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    /** Triangle setter using Point for base and height. */
    public void setTriangle(Point bh) {
        setTriangle(bh.getX(), bh.getY());
    }

    /** Triangle method for triangle area. */
    @Override
    public double area() {
        return getBase() * getHeight() / 2;
    }

    /**
     * Triangle method for triangle perimeter.
     *
     * <p>With given base and height, the perimeter is indeterministic.  The
     * calculation gives the smallest value.
     */
    @Override
    public double perimeter() {
        return Math.hypot(bh.getX() / 2, bh.getY()) * 2 + bh.getX();
    }

    /** Triangle string method. */
    public String toString() {
        return String.format(
                "Base:      %.2f%n"
                        + "Height:    %.2f%n"
                        + "Area:      %.2f%n"
                        + "Perimeter: %.2f%n"
                        + "Color:     %s",
                getBase(),
                getHeight(),
                area(),
                perimeter(),
                getColor());
    }
}
