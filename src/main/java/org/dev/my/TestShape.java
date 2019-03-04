/**
 * Test driver of Shape abstract superclass.
 */
public class TestShape {
    /** Test various shapes. */
    public static void main(String[] args) {
        /* custom Rectangle instance */
        final double length = 300.0;
        final double width = 200.0;
        String color = "red";
        Shape rectangle = new Rectangle(color, length, width);
        System.out.println();
        System.out.println("=== Custom Rectangle ===");
        System.out.println();
        System.out.println(rectangle);
        System.out.printf(
                "Rectangle area is %.2f%n"
                        + "Rectangle perimeter is %.2f%n"
                        + "Rectangle color is %s%n",
                rectangle.getArea(),
                rectangle.getPerimeter(),
                rectangle.getColor());
        /* default Rectangle instance */
        Shape defRectangle = new Rectangle();
        System.out.println();
        System.out.println("=== Default Rectangle ===");
        System.out.println();
        System.out.println(defRectangle);
        System.out.printf(
                "Default rectangle area is %.2f%n"
                        + "Default rectangle perimeter is %.2f%n"
                        + "Default rectangle color is %s%n",
                defRectangle.getArea(),
                defRectangle.getPerimeter(),
                defRectangle.getColor());
        /* Rectangle instance with null parameter */
        Shape nullRectangle = new Rectangle(null);
        System.out.println();
        System.out.println("=== Rectangle with null parameter  ===");
        System.out.println();
        System.out.println(nullRectangle);
        System.out.printf(
                "The null rectangle area is %.2f%n"
                        + "The null rectangle perimeter is %.2f%n"
                        + "The null rectangle color is %s%n",
                nullRectangle.getArea(),
                nullRectangle.getPerimeter(),
                nullRectangle.getColor());
        /* custom Rectangle instance with length */
        Shape lengthRectangle = new Rectangle(length);
        System.out.println();
        System.out.println("=== Rectangle with length ===");
        System.out.println();
        System.out.println(lengthRectangle);
        System.out.printf(
                "The length rectangle area is %.2f%n"
                        + "The length rectangle perimeter is %.2f%n"
                        + "The length rectangle color is %s%n",
                lengthRectangle.getArea(),
                lengthRectangle.getPerimeter(),
                lengthRectangle.getColor());
        /* custom Rectangle instance with length and width */
        Shape sideRectangle = new Rectangle(length, width);
        System.out.println();
        System.out.println("=== Rectangle with both sides ===");
        System.out.println();
        System.out.println(sideRectangle);
        System.out.printf(
                "Rectangle area is %.2f%n"
                        + "Rectangle perimeter is %.2f%n"
                        + "Rectangle color is %s%n",
                sideRectangle.getArea(),
                sideRectangle.getPerimeter(),
                sideRectangle.getColor());
        /* custom Circle instance with radius and color */
        final double radius = 100.0;
        Shape circle = new Circle(radius, color);
        System.out.println();
        System.out.println("=== Circle ===");
        System.out.println();
        System.out.println(circle);
        System.out.printf(
                "Circle area is %.2f%n"
                        + "Circle circumference is %.2f%n"
                        + "Circle color is %s%n",
                circle.getArea(),
                /* getPerimeter() is a wrapper for getCircumference() in Circle */
                circle.getPerimeter(),
                circle.getColor());
        /* default Circle instance */
        Shape defCircle = new Circle();
        System.out.println();
        System.out.println("=== Default Circle ===");
        System.out.println();
        System.out.println(defCircle);
        System.out.printf(
                "Default Circle area is %.2f%n"
                        + "Default Circle circumference is %.2f%n"
                        + "Default Circle color is %s%n",
                defCircle.getArea(),
                defCircle.getPerimeter(),
                defCircle.getColor());
        /* custom Circle instance with radius */
        Shape radiusCircle = new Circle(radius);
        System.out.println();
        System.out.println("=== Circle with radius ===");
        System.out.println();
        System.out.println(radiusCircle);
        System.out.printf(
                "Circle area is %.2f%n"
                        + "Circle circumference is %.2f%n"
                        + "Circle color is %s%n",
                radiusCircle.getArea(),
                radiusCircle.getPerimeter(),
                radiusCircle.getColor());
        /* composite circle with center Point and radius */
        final int centerX = 40;
        final int centerY = -5;
        Circle originalCircle = new Circle(new Point(centerX, centerY), radius);
        Shape shapeCircle = (Shape)originalCircle;
        System.out.println();
        System.out.println("=== Composite Circle with center Point and radius ===");
        System.out.println();
        System.out.println(originalCircle);
        System.out.println(shapeCircle);
        System.out.printf(
                "Composite Circle area is %.2f%n"
                        + "Upcast composite Circle area is %.2f%n"
                        + "Composite Circle circumference is %.2f%n"
                        + "Composite Circle color is %s%n"
                        + "Composite Circle diameter is %.2f%n"
                        + "Composite Circle center is %s%n",
                originalCircle.getArea(),
                shapeCircle.getArea(),
                shapeCircle.getPerimeter(),
                shapeCircle.getColor(),
                originalCircle.getDiameter(),
                originalCircle.getCenter());
        /* Triple the radius and change circle color. */
        originalCircle.setRadius(radius * 3);
        originalCircle.setColor(Circle.FAVORITE_COLOR);
        originalCircle.setCenter(new Point(centerX - 99, centerY * 3));
        System.out.println();
        System.out.println("=== Composite Circle with center, radius and color updated ===");
        System.out.println();
        System.out.println(originalCircle);
        System.out.println(shapeCircle);
        System.out.printf(
                "Composite Circle area is %.2f%n"
                        + "Upcast composite Circle area is %.2f%n"
                        + "Composite Circle circumference is %.2f%n"
                        + "Composite Circle color is %s%n"
                        + "Composite Circle diameter is %.2f%n"
                        + "Composite Circle center is %s%n",
                originalCircle.getArea(),
                shapeCircle.getArea(),
                shapeCircle.getPerimeter(),
                shapeCircle.getColor(),
                originalCircle.getDiameter(),
                originalCircle.getCenter());
        /* custom Triangle instance with color and 3 sides */
        final double sideA = 30;
        final double sideB = 40;
        final double sideC = 50;
        Shape triangle = new Triangle(color, sideA, sideB, sideC);
        System.out.println();
        System.out.println("=== Custom Triangle ===");
        System.out.println();
        System.out.println(triangle);
        System.out.printf(
                "Triangle area is %.2f%n"
                        + "Triangle perimeter is %.2f%n"
                        + "Triangle color is %s%n",
                triangle.getArea(),
                triangle.getPerimeter(),
                triangle.getColor());
        /* default Triangle instance */
        Shape defTriangle = new Triangle();
        System.out.println();
        System.out.println("=== Default Triangle ===");
        System.out.println();
        System.out.println(defTriangle);
        System.out.printf(
                "Default triangle area is %.2f%n"
                        + "Default triangle perimeter is %.2f%n"
                        + "Default triangle color is %s%n",
                defTriangle.getArea(),
                defTriangle.getPerimeter(),
                defTriangle.getColor());
        /* default Cylinder instance */
        System.out.println();
        System.out.println("=== Default Cylinder ===");
        System.out.println();
        Cylinder defCylinder = new Cylinder();
        System.out.println((Shape)defCylinder);
        System.out.println((Circle)defCylinder);
        System.out.printf(
                "Default cylinder base area is %.2f%n"
                        + "Default cylinder surface area is %.2f%n"
                        + "Default cylinder volume is %.2f%n"
                        + "Default cylinder color is %s%n",
                defCylinder.getBaseArea(), /* default cylinder base area */
                defCylinder.getArea(), /* default cylinder surface area */
                defCylinder.getVolume(), /* default cylinder volume */
                defCylinder.getColor());
        /* custom Cylinder instance */
        System.out.println();
        System.out.println("=== Custom Cylinder ===");
        System.out.println();
        final double height = 12;
        Shape shapeCylinder = new Cylinder(radius, height, color);
        System.out.println(shapeCylinder);
        Cylinder cylinder = (Cylinder)shapeCylinder;
        System.out.printf(
                "Custom cylinder base area is %.2f%n"
                        + "Custom cylinder surface area is %.2f%n"
                        + "Custom cylinder volume is %.2f%n"
                        + "Custom cylinder color is %s%n",
                cylinder.getBaseArea(), /* custom cylinder base area */
                cylinder.getArea(), /* custom cylinder surface area */
                cylinder.getVolume(), /* custom cylinder volume */
                cylinder.getColor()); /* custom cylinder color */
        /* default Sphere instance */
        System.out.println();
        System.out.println("=== Default Sphere ===");
        System.out.println();
        Shape shapeSphere = new Sphere();
        System.out.println(shapeSphere);
        Sphere defSphere = (Sphere)shapeSphere;
        System.out.println(defSphere);
        System.out.printf(
                "Default sphere radius is %.2f%n"
                        + "Default sphere surface area is %.2f%n"
                        + "Default sphere volume is %.2f%n"
                        + "Default sphere color is %s%n"
                        + "Default sphere favorite color is %s%n",
                defSphere.getRadius(),
                defSphere.getArea(),
                defSphere.getVolume(),
                defSphere.getColor(),
                defSphere.getFavoriteColor());
        /* custom Sphere instance */
        System.out.println();
        System.out.println("=== Custom Sphere ===");
        System.out.println();
        Shape shapeCustomSphere = new Sphere(radius);
        System.out.println(shapeCustomSphere);
        Sphere customSphere = (Sphere)shapeCustomSphere;
        System.out.println(customSphere);
        System.out.printf(
                "Custom sphere radius is %.2f%n"
                        + "Custom sphere surface area is %.2f%n"
                        + "Custom sphere volume is %.2f%n"
                        + "Custom sphere color is %s%n"
                        + "Custom sphere favorite color is %s%n",
                customSphere.getRadius(),
                customSphere.getArea(),
                customSphere.getVolume(),
                customSphere.getColor(),
                customSphere.getFavoriteColor());
    }
}
