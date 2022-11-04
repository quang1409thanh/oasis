public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * .
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1) || p1.check(p2, p3)) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * .
     */
    public double getArea() {
        double x1 = p1.distance(p2);
        double x2 = p2.distance(p3);
        double x3 = p3.distance(p1);
        double p = (x1 + x2 + x3) / 2;
        double s = Math.sqrt(p * (p - x1) * (p - x2) * (p - x3));
        return s;
    }

    /**
     * .
     */
    public double getPerimeter() {
        double x1 = p1.distance(p2);
        double x2 = p2.distance(p3);
        double x3 = p3.distance(p1);
        return x1 + x2 + x3;
    }

    /**
     * .
     */
    public String getInfo() {
        String x1 = String.format("%.2f", p1.getPointX());
        String y1 = String.format("%.2f", p1.getPointY());
        String x2 = String.format("%.2f", p2.getPointX());
        String y2 = String.format("%.2f", p2.getPointY());
        String x3 = String.format("%.2f", p3.getPointX());
        String y3 = String.format("%.2f", p3.getPointY());
        return "Triangle[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + "),(" + x3 + "," + y3 + ")]";
    }
}
