package geometry;

public class Point {

    private double x;
    private double y;

    public double getX () {
        return x;
    }

    public void setX (double x) {
        this.x = x;
    }

    public double getY () {
        return y;
    }

    public void setY (double y) {
        this.y = y;
    }

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public void addition (Point p){
        double new_x = this.getX() + p.getX();
        double new_y = this.getY() + p.getY();
        this.setX(new_x);
        this.setY(new_y);
    }

    public void subtraction(Point p){
        double new_x = this.getX() - p.getX();
        double new_y = this.getY() - p.getY();
        this.setX(new_x);
        this.setY(new_y);
    }

    public void multiplication(double factor){
        double new_x = this.getX() * factor;
        double new_y = this.getY() * factor;
        this.setX(new_x);
        this.setY(new_y);
    }

    public void division(double factor){
        double new_x = this.getX() / factor;
        double new_y = this.getY() / factor;
        this.setX(new_x);
        this.setY(new_y);
    }

    public String toString(){
        return "x: " + this.getX() + ", y: " + this.getY();
    }
}
