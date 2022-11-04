public abstract class Shape {

    protected String color;
    protected boolean filled;

    /** Javadoc1. */
    public Shape() {
    }

    /** Javadoc1. */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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
    public boolean isFilled() {
        return this.filled;
    }

    /** Javadoc1. */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Javadoc1. */
    public abstract double getArea();

    /** Javadoc1. */
    public abstract double getPerimeter();

    /** Javadoc1. */
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
