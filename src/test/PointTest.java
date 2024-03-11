import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point a;
    Point b;

    @BeforeEach
    public void generatePoints(){
        a = new Point(2.0, 3.0);
        b = new Point(1.0, 5.0);
    }

    @Test
    void addition() {
        a.addition(b);
        assertEquals(a.toString(), new Point(3.0, 8.0).toString());
    }

    @Test
    void substraction() {
        a.subtraction(b);
        assertEquals(a.toString(), new Point(1.0, -2.0).toString());
    }

    @Test
    void multiplikation() {
        a.multiplication(3);
        assertEquals(a.toString(), new Point(6.0, 9.0).toString());
    }

    @Test
    void division() {
        a.division(2);
        assertEquals(a.toString(), new Point(1.0, 1.5).toString());
    }

    @Test
    void checkValueChange(){
        a.addition(b);

        // a does change
        assertNotEquals(a.getX(), 2.0);
        assertNotEquals(a.getY(), 3.0);

        // b doesnt change
        assertEquals(b.getX(), 1.0);
        assertEquals(b.getY(), 5.0);
    }
}