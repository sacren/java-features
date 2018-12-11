/**
 * Cylinder class
 *
 * <p>Private data with default value:
 * -radius:double = 1.0
 * -height:double = 1.0
 *
 * <p>Constructor:
 * +Cylinder()
 * +Cylinder(radius:double, height:double)
 *
 * <p>Public methods:
 * +getBaseArea(radius:double):double
 * +getSurfaceArea(radius:double, height:double):double
 * +getVolume(radius:double):double
 */
public class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    public double getSurfaceArea() {
        return getBaseArea() * 2 + height * Math.PI * radius * 2;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }
}
