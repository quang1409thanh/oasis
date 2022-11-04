public class Rectangle extends Shape {

    protected double width;
    protected double length;

    /** Javadoc1. */
    public Rectangle() {
    }

    /** Javadoc1. */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** Javadoc1. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** Javadoc1. */
    public double getWidth() {
        return this.width;
    }

    /** Javadoc1. */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Javadoc1. */
    public double getLength() {
        return this.length;
    }

    /** Javadoc1. */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + this.width + ",length="
                + this.length + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}
