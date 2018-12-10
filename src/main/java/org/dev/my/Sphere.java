/**
 * Sphere class
 *
 * <p>Private variable:
 * -radius:double = 1.0
 *
 * <p>Constructor:
 * +Sphere()
 * +Sphere(radius:double)
 *
 * <p>Public methods:
 * +getSurfaceArea():double
 * +getVolume():double
 * +setRadius(radius:double):void
 */
public class Sphere {
    private double radius;

    public Sphere() {
        this.radius = 1.0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return Math.PI * radius * radius * 4;
    }

    public double getVolume() {
        return Math.PI * radius * radius * radius * 4 / 3;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
