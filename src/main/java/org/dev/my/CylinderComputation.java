/** Print the surface area, base area, and volume of a cylinder. */
public class CylinderComputation {
    public static void main(String[] args) {
        printCylinder();
    }

    private static void printCylinder() {
        final double pi = 3.14159265;
        double radius = 12.5;
        double height = 4.0;
        double baseArea = pi * radius * radius;
        double surfaceArea = baseArea * 2 + height * pi * radius * 2;
        double volume = baseArea * height;

        System.out.println(
                "Surface area = "
                        + surfaceArea
                        + "\n"
                        + "Base area = "
                        + baseArea
                        + "\n"
                        + "Volume = "
                        + volume);
    }
}
