package geometry;

public class Circle extends Point implements GeometricObject{
    private Point center;
    private double radius;

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

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * this.getRadius();
    }
}
