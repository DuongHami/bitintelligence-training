package geometry;

public class Rectangle extends GeometricObject{
    final private Point p1;
    final private Point p2;

    final private double length;
    final private double height;

    /**
     *
     * @return first corner of the rectangle
     */
    public Point getP1() {
        return p1;
    }

    /**
     *
     * @return second corner of the rectangle
     */
    public Point getP2() {
        return p2;
    }

    /**
     *
     * @return length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     *
     * @return height of the rectangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * Constructor for Rectangle object
     * calculates height and length during instantiation
     * @param p1 first corner of the regtangle
     * @param p2 second corner of the regtangle
     */
    public Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;

        this.length = Math.abs(p2.getX() - p1.getX());
        this.height = Math.abs(p2.getY() - p1.getY());
    }

    /**
     * Formula: 2 * (length + height)
     * @return circumference of the rectangle
     */
    @Override
    public double calculateCircumference() {
//        return 2 * (Math.abs(p2.getX() - p1.getX()) + Math.abs(p2.getY() - p1.getY()));
        return 2 * (this.getLength() + this.getHeight());
    }

    /**
     * Formula: length * height
     * @return area of the rectangle
     */
    @Override
    public double calculateArea() {
        return this.getLength() * this.getHeight();
    }
}
