public class Vector {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector addition ( Vector v2){
        return new Vector (
                this.getX() + v2.getX(),
                this.getY() + v2.getY(),
                this.getZ() + v2.getZ()
        );
    }

    public Vector substraction (Vector v2){
        return new Vector (
                this.getX() - v2.getX(),
                this.getY() - v2.getY(),
                this.getZ() - v2.getZ()
        );
    }

    public Vector kreuzprodukt (Vector v2){
        return new Vector (
                this.getY() * v2.getZ() - this.getZ() * v2.getY(),
                this.getZ() * v2.getX() - this.getX() * v2.getZ(),
                this.getX() * v2.getY() - this.getY() * v2.getX()
        );
    }

    public double skalarprodukt (Vector v2){
        return this.getX() * v2.getX() + this.getY() * v2.getY() + this.getZ() * v2.getZ();
    }

    public Vector multiplikation (double scalar){
        return new Vector (
                this.getX() * scalar,
                this.getY() * scalar,
                this.getZ() * scalar
        );
    }

    public Vector division (double scalar){
        return new Vector (
                this.getX() / scalar,
                this.getY() / scalar,
                this.getZ() / scalar
        );
    }

    public double vectorLen (){
        return Math.sqrt(
                Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2)
        );
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
