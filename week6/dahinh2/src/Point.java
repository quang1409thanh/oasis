public class Point {

    private double pointX;
    private double pointY;

    /** Javadoc1. */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /** Javadoc1. */
    public double getPointX() {
        return this.pointX;
    }

    /** Javadoc1. */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /** Javadoc1. */
    public double getPointY() {
        return this.pointY;
    }

    /** Javadoc1. */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /** Javadoc1. */
    public double distance(Point point) {
        double rs;
        rs = Math.sqrt((point.pointX - this.pointX) * (point.pointX - this.pointX)
                + (point.pointY - this.pointY) * (point.pointY - this.pointY));
        return rs;
    }

    /** Javadoc1. */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point orther = (Point) obj;
            if (this.pointX == orther.pointX && this.pointY == orther.pointY) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /** Javadoc1. */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
