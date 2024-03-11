package geometry;

public class Triangle extends Point implements GeometricObject{
    final private Point p1;
    final private Point p2;
    final private Point p3;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * // (1/2) |x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)|
     * @return area of the triangle
     */
    @Override
    public double calculateArea() {
        double n1 = this.getP1().getX() * (this.getP2().getY() - this.getP3().getY());
        double n2 = this.getP2().getX() * (this.getP3().getY() - this.getP1().getY());
        double n3 = this.getP3().getX() * (this.getP1().getY() - this.getP2().getY());
        return 0.5 * Math.abs(n1 + n2 + n3);
    }

    /**
     *
     * @return circumfrence of the triangle
     */
    @Override
    public double calculateCircumference() {
        double ab = Math.sqrt(Math.pow(this.getP1().getX() - this.getP2().getX(),2) + Math.pow(this.getP1().getY() - this.getP2().getY(), 2));
        double ac = Math.sqrt(Math.pow(this.getP1().getX() - this.getP3().getX(),2) + Math.pow(this.getP1().getY() - this.getP3().getY(), 2));
        double bc = Math.sqrt(Math.pow(this.getP2().getX() - this.getP3().getX(),2) + Math.pow(this.getP2().getY() - this.getP3().getY(), 2));

        return ab + ac + bc;
    }
}
