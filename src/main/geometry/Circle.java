package geometry;

public class Circle extends GeometricObject{
    final private Point center;
    final private double radius;

    /**
     *
     * @return radius of the object
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Constructor for Circle-object
     * @param center of the circle
     * @param radius of the circle
     */
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    /**
     * Implements the calculateArea method from the interface GeometricObject
     * @return area of the circle
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    /**
     * Implements the calculateCircumference method from the interface GeometricObject
     * @return circumference of the circle
     */
    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * this.getRadius();
    }
}
