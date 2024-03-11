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

    public static void main(String[] args) {
        Point a = new Point(2.0, 3.0);
        Point b = new Point(1.0, 5.0);

        System.out.println("Point a : " + a.toString());
        System.out.println("Point b : " + b.toString());

        a.addition(b);
        System.out.println("a + b = " + a.toString());

        a.subtraction(b);
        System.out.println("- b = " + a.toString());

        a.multiplication(2);

        System.out.println("* 2 = " + a.toString());

        a.division(4);

        System.out.println("/ 4 = " + a.toString());
    }
}
