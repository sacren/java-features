/**
 * Triangle subclass extends Shape superclass.
 *
 * <p>Private instance data:
 * -sideA:double
 * -sideB:double
 * -sideC:double
 *
 * <p>Constructor:
 * +Triangle()
 * +Triangle(sideA:double, sideB:double, sideC:double)
 *
 * <p>Public methods:
 * +getSideA():double
 * +setSideA(sideA:double):void
 * +getSideB():double
 * +setSideB(sideB:double):void
 * +getSideC():double
 * +setSideC(sideC:double):void
 * +getArea():double
 * +getPerimeter():double
 * +toString():String
 */
public class Triangle extends Shape {
    /* private static data */
    private static final double DEFAULT_SIDE_A = 4;
    private static final double DEFAULT_SIDE_B = 5;
    private static final double DEFAULT_SIDE_C = 6;
    private static final String DEFAULT_COLOR = "brown";

    /* private instance data */
    private double sideA;
    private double sideB;
    private double sideC;

    /** Triangle default constructor. */
    public Triangle() {
        super(DEFAULT_COLOR);
        sideA = DEFAULT_SIDE_A;
        sideB = DEFAULT_SIDE_B;
        sideC = DEFAULT_SIDE_C;
    }

    /** Triangle constructor with color and 3 sides. */
    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        setSides(sideA, sideB, sideC);
    }

    /** Triangle getter for side A. */
    public double getSideA() {
        return sideA;
    }

    /** Triangle setter for side A. */
    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", sideA));
        }
        this.sideA = sideA;
    }

    /** Triangle getter for side B. */
    public double getSideB() {
        return sideB;
    }

    /** Triangle setter for side B. */
    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", sideB));
        }
        this.sideB = sideB;
    }

    /** Triangle getter for side C. */
    public double getSideC() {
        return sideC;
    }

    /** Triangle setter for side C. */
    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", sideC));
        }
        this.sideC = sideC;
    }

    /* helper for setting all 3 sides */
    private void setSides(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    /** Triangle method for area. */
    @Override
    public double getArea() {
        final double halfP = getPerimeter() / 2;
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    /** Triangle method for perimeter. */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /** Triangle string method. */
    public String toString() {
        return String.format(
                "Side A:    %.2f%n"
                        + "Side B:    %.2f%n"
                        + "Side C:    %.2f%n"
                        + "Area:      %.2f%n"
                        + "Perimeter: %.2f%n"
                        + "Color:     %s",
                sideA,
                sideB,
                sideC,
                getArea(),
                getPerimeter(),
                getColor());
    }
}
