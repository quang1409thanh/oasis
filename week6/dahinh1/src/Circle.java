public class Circle extends Shape {

    protected double radius;

    /** Javadoc1. */
    public Circle() {
    }

    /** Javadoc1. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Javadoc1. */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Javadoc1. */
    public double getRadius() {
        return this.radius;
    }

    /** Javadoc1. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + this.radius
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}
