import java.util.Objects;

public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     *
     * @return x of the object
     */
    public double getX() {
        return x;
    }

    /**
     *
     * @param x to change the to
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     *
     * @return y of the object
     */
    public double getY() {
        return y;
    }

    /**
     *
     * @param y to change the to
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @return z of the object
     */
    public double getZ() {
        return z;
    }

    /**
     *
     * @param z to change the to
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Constructor
     * @param x of the new object
     * @param y of the new object
     * @param z of the new object
     */
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Default constructor
     */
    public Vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     *
     * @param v2 vector to be added to the current object
     * @return new Vector object with Vector v1 + Vector v2
     */
    public Vector addition ( Vector v2){
        return new Vector (
                this.getX() + v2.getX(),
                this.getY() + v2.getY(),
                this.getZ() + v2.getZ()
        );
    }

    /**
     *
     * @param v2 vector to be substracted to the current object
     * @return new Vector object with Vector v1 - Vector v2
     */
    public Vector substraction (Vector v2){
        return new Vector (
                this.getX() - v2.getX(),
                this.getY() - v2.getY(),
                this.getZ() - v2.getZ()
        );
    }

    /**
     *
     * @param v2 vector to be calculated the cross product with
     * @return new Vector object with Vector v1 x Vector v2
     */
    public Vector kreuzprodukt (Vector v2){
        return new Vector (
                this.getY() * v2.getZ() - this.getZ() * v2.getY(),
                this.getZ() * v2.getX() - this.getX() * v2.getZ(),
                this.getX() * v2.getY() - this.getY() * v2.getX()
        );
    }

    /**
     *
     * @param v2 vector to be calculated the scalar product with
     * @return double that represents the scalar product
     */
    public double skalarprodukt (Vector v2){
        return this.getX() * v2.getX() + this.getY() * v2.getY() + this.getZ() * v2.getZ();
    }

    /**
     *
     * @param scalar double to multiply the vector with
     * @return new Vector object with Vector v1 * scalar
     */
    public Vector multiplikation (double scalar){
        return new Vector (
                this.getX() * scalar,
                this.getY() * scalar,
                this.getZ() * scalar
        );
    }

    /**
     *
     * @param scalar double to divide the vector with
     * @return new Vector object with Vector v1 / scalar
     */
    public Vector division (double scalar){
        return new Vector (
                this.getX() / scalar,
                this.getY() / scalar,
                this.getZ() / scalar
        );
    }

    /**
     *
     * @return length of the vector
     */
    public double vectorLen (){
        return Math.sqrt(
                Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2)
        );
    }

    /**
     *
     * @return stringified form of a Vector object
     */
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector vector)) return false;
        return Double.compare(x, vector.x) == 0 && Double.compare(y, vector.y) == 0 && Double.compare(z, vector.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
