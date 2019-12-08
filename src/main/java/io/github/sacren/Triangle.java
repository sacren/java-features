/**
 * Triangle subclass extends Shape superclass.
 *
 * <p>Private instance data:
 * -bh:Duo
 *
 * <p>Constructor:
 * +Triangle()
 * +Triangle(bh:Duo)
 *
 * <p>Public methods:
 * +getBase():double
 * +setBase(base:double):void
 * +getHeight():double
 * +setHeight(height:double):void
 * +setTriangle(base:double, height:double):void
 * +setTriangle(bh:Duo):void
 * +toString():String
 */
public class Triangle extends Shape {
    /* private instance data */
    private Duo bh;

    /** Triangle default constructor. */
    public Triangle() {
        super("brown"); /* triangle instance default color */
        bh = new Duo((double) 3, (double) 4);
    }

    /** Triangle constructor with Duo object for parameter. */
    public Triangle(Duo bh) {
        this();
        setTriangle(bh);
    }

    /** Triangle getter for the base. */
    public double getBase() {
        return bh.getFirstDbl();
    }

    /** Triangle setter for the base. */
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", base));
        }
        bh.setFirst(base);
    }

    /** Triangle getter for the height. */
    public double getHeight() {
        return bh.getSecondDbl();
    }

    /** Triangle setter for the height. */
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", height));
        }
        bh.setSecond(height);
    }

    /** Triangle setter for both base and height. */
    public void setTriangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    /** Triangle setter using Duo object for base and height. */
    public void setTriangle(Duo bh) {
        setTriangle(bh.getFirstDbl(), bh.getSecondDbl());
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
        return Math.hypot(bh.getFirstDbl() / 2, bh.getSecondDbl()) * 2 + bh.getFirstDbl();
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
