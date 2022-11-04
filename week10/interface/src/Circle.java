public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * .
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * .
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * .
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * .
     */
    public String getInfo() {
        String x1 = String.format("%.2f", center.getPointX());
        String y1 = String.format("%.2f", center.getPointY());
        String r1 = String.format("%.2f", radius);
        return "Circle[(" + x1 + "," + y1 + ")," + "r=" + r1 + "]";
    }
}
