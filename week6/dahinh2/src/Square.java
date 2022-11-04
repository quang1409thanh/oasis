public class Square extends Rectangle {

    /** Javadoc1. */
    public Square() {
    }

    /** Javadoc1. */
    public Square(double size) {
        this.width = size;
        this.length = size;
    }

    /** Javadoc1. */
    public Square(double size, String color, boolean filled) {
        this.width = size;
        this.length = size;
        setColor(color);
        setFilled(filled);
    }

    /** Javadoc1. */
    public Square(Point topLeft, double size, String color, boolean filled) {
        this.width = size;
        this.length = size;
        this.topLeft = topLeft;
        setColor(color);
        setFilled(filled);
    }

    /** Javadoc1. */
    public double getSide() {
        return this.width;
    }

    /** Javadoc1. */
    public void setSide(double size) {
        this.width = size;
        this.length = size;
    }

    /** Javadoc1. */
    public void setWidth(double size) {
        this.width = size;
    }

    /** Javadoc1. */
    public void setLength(double size) {
        this.length = size;
    }

    /** Javadoc1. */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square orther = (Square) obj;
            if (Math.abs(this.width - orther.width) <= 0.001) {
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
        return "Square[topLeft=" + topLeft.toString() + ",side=" + width
                + ",color=" + color + ",filled=" + filled + "]";
    }

}
