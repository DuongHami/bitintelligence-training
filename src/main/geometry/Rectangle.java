package geometry;

public class Rectangle extends Point implements GeometricObject{
    final private Point p1;
    final private Point p2;

    final private double length;
    final private double height;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;

        this.length = Math.abs(p2.getX() -p1.getX());
        this.height = Math.abs(p2.getY() -p1.getY());
    }

    @Override
    public double calculateCircumference() {
        return 2 * (this.getLength() + this.getHeight());
    }

    @Override
    public double calculateArea() {
        return this.getLength() * this.getHeight();
    }
}
