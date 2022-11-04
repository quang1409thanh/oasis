public class Cylinder extends Circle {
    private double height = 1.0;

    /** Javadoc1. */
    public Cylinder() {
    }

    /** Javadoc1. */
    public Cylinder(double radius) {
        setRadius(radius);
    }

    /** Javadoc1. */
    public Cylinder(double radius, double height) {
        this.height = height;
        setRadius(radius);
    }

    /** Javadoc1. */
    public Cylinder(double radius, double height, String color) {
        setRadius(radius);
        setColor(color);
        this.height = height;
    }

    /** Javadoc1. */
    public double getHeight() {
        return height;
    }

    /** Javadoc1. */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Javadoc1. */
    public double getVolume() {
        return getArea() * height;
    }

    /** Javadoc1. */
    @Override
    public String toString() {
        // super;
        String rs = "Cylinder[" + toString() + ",height=" + height + "]";
        return rs;
    }

    /** Javadoc1. */
    @Override
    public double getArea() {
        return 2 * getArea();
    }
}
