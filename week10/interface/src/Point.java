public class Point {
    private double pointX;
    private double pointY;

    /**
     * .
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * .
     */
    public double distance(Point other) {
        return Math.sqrt((other.pointX - this.pointX) * (other.pointX - this.pointX)
                + (other.pointY - this.pointY) * (other.pointY - this.pointY));
    }

    /**
     * .
     */
    public boolean equals(Point other) {
        if (this.pointX == other.pointX && this.pointY == other.pointY) {
            return true;
        }
        return false;
    }

    /**
     * .
     */

    public boolean check(Point p1, Point p2) {
        if (!this.equals(p1) && !this.equals(p2) && !p1.equals(p2)) {
            Point x1 = new Point((this.pointX - p1.pointX), (this.pointY - p1.pointY));
            Point x2 = new Point((this.pointX - p2.pointX), (this.pointY - p2.pointY));
            if (x1.pointX * x2.pointY == x2.pointX * x1.pointY) {
                return true;
            }
        }
        return false;
    }

}
