/**
 * Triangle subclass extends Shape superclass.
 *
 * <p>Private instance data:
 *
 * <p>Constructor:
 * +Triangle()
 * +Triangle(p:Point)
 *
 * <p>Public methods:
 * +getBase():double
 * +setBase(base:double):void
 * +getHeight():double
 * +setHeight(height:double):void
 * +setBaseHeight(base:double, height:double):void
 * +setBaseHeight(p:Point):void
 * +toString():String
 */
public class Triangle extends Shape {
    /* private static data */
    private static final String DEFAULT_COLOR = "brown";

    /* private instance data */
    private Point bh;

    /** Triangle default constructor. */
    public Triangle() {
        super(DEFAULT_COLOR);
        setBaseHeight(new Point(3, 4));
    }

    /** Triangle constructor with Point. */
    public Triangle(Point p) {
        this();
        setBaseHeight(p);
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
    public void setBaseHeight(double base, double height) {
        bh = new Point();
        setBase(base);
        setHeight(height);
    }

    /** Triangle setter using Point for base and height. */
    public void setBaseHeight(Point p) {
        setBaseHeight(p.getX(), p.getY());
    }

    /** Triangle getter for the area. */
    @Override
    public double getArea() {
        return getBase() * getHeight() / 2;
    }

    /**
     * Triangle getter for the perimeter.
     *
     * <p>With given base and height, the perimeter is indeterministic.  The
     * calculation gives the smallest value.
     */
    @Override
    public double getPerimeter() {
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
                getArea(),
                getPerimeter(),
                getColor());
    }
}
