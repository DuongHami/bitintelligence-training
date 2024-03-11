import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void addition() {
        Point a = new Point(2.0, 3.0);
        Point b = new Point(1.0, 5.0);
        a.addition(b);
        assertEquals(a.toString(), new Point(3.0, 8.0).toString());
    }

    @Test
    void substraction() {
        Point a = new Point(2.0, 3.0);
        Point b = new Point(1.0, 5.0);
        a.subtraction(b);
        assertEquals(a.toString(), new Point(1.0, -2.0).toString());
    }

    @Test
    void multiplikation() {
        Point a = new Point(2.0, 3.0);
        a.multiplication(3);
        assertEquals(a.toString(), new Point(6.0, 9.0).toString());
    }

    @Test
    void division() {
        Point a = new Point(2.0, 3.0);
        a.division(2);
        assertEquals(a.toString(), new Point(1.0, 1.5).toString());
    }

    @Test
    void checkValueChange(){
        Point a = new Point(2.0, 3.0);
        Point b = new Point(1.0, 5.0);
        a.addition(b);

        // a does change
        assertNotEquals(a.getX(), 2.0);
        assertNotEquals(a.getY(), 3.0);

        // b doesnt change
        assertEquals(b.getX(), 1.0);
        assertEquals(b.getY(), 5.0);
    }
}