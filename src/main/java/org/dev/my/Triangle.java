/**
 * Triangle subclass extends Shape superclass.
 *
 * <p>Private data with default values:
 * -sideA:double = 1.0
 * -sideB:double = 2.0
 * -sideC:double = 3.0
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
    private static final double DEFAULT_SIDE_A = 1.0;
    private static final double DEFAULT_SIDE_B = 2.0;
    private static final double DEFAULT_SIDE_C = 3.0;
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

    /** getter of Triangle side A. */
    public double getSideA() {
        return sideA;
    }

    /** setter of Triangle side A. */
    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", sideA));
        }
        this.sideA = sideA;
    }

    /** getter of Triangle side B. */
    public double getSideB() {
        return sideB;
    }

    /** setter of Triangle side B. */
    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException(
                    String.format("%f is invalid!", sideB));
        }
        this.sideB = sideB;
    }

    /** getter of Triangle side C. */
    public double getSideC() {
        return sideC;
    }

    /** setter of Triangle side C. */
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

    /** Triangle description. */
    public String toString() {
        return String.format(
                "[Triangle (Color=%s, Side A=%.2f, Side B=%.2f, Side C=%.2f)]",
                getColor(), sideA, sideB, sideC);
    }

    /** Public method for Triangle area. */
    @Override
    public double getArea() {
        final double halfP = getPerimeter() / 2;
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    /** Public method for Triangle perimeter. */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
