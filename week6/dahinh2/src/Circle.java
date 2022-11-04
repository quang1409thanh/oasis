public class Circle extends Shape {

    protected Point center;
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
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Javadoc1. */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /** Javadoc1. */
    public Point getCenter() {
        return this.center;
    }

    /** Javadoc1. */
    public void setCenter(Point center) {
        this.center = center;
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
        return 2 * radius * Math.PI;
    }

    /** Javadoc1. */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle orther = (Circle) obj;
            if (Math.abs(this.radius - orther.radius) <= 0.001) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius="
                + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
