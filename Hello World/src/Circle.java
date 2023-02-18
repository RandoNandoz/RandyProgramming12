public class Circle {
    private final double PI = Math.PI;
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double r) {
        return PI * r * r;
    }

    public double getCircumference(double r) {
        return 2 * PI * r;
    }
}
