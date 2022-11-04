public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected static final double PI = 3.14;

    /** Javadoc1. */
    public Circle() {
    }

    /** Javadoc1. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Javadoc1. */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Javadoc1. */
    public double getRadius() {
        return this.radius;
    }

    /** Javadoc1. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Javadoc1. */
    public String getColor() {
        return this.color;
    }

    /** Javadoc1. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Javadoc1. */
    public double getArea() {
        return PI * radius * radius;
    }

    /** Javadoc1. */
    public String toString() {
        String rs = "Circle[radius=" + radius + ",color=" + color + "]";
        return rs;
    }
}
