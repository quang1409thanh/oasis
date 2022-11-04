public class Square extends Rectangle {

    /** Javadoc1. */
    public Square() {
    }

    /** Javadoc1. */
    public Square(double side) {
        width = side;
        length = side;
    }

    /** Javadoc1. */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /** Javadoc1. */
    public double getSide() {
        return this.width;
    }

    /** Javadoc1. */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /** Javadoc1. */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    /** Javadoc1. */
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + this.width + ",color="
                + this.color + ",filled=" + this.filled + "]";
    }

}
