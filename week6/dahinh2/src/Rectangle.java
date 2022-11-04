public class Rectangle extends Shape {

    protected Point topLeft;
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
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    /** Javadoc1. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
        setColor(color);
        setFilled(filled);
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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** Javadoc1. */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle orther = (Rectangle) obj;
            if (Math.abs(this.width - orther.width) <= 0.001
                    && Math.abs(this.length - orther.length) <= 0.001
                    && this.topLeft.equals(orther.topLeft)) {
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
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + width + ",length="
                + length + ",color=" + color + ",filled=" + filled + "]";

    }
}
