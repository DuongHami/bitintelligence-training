import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    final private Vector v1 = new Vector(1, 4, 7);
    final private Vector v2 = new Vector(3, 6, 2);
    final private double delta = 0.01;

    /**
     * Positive case of addition
     */
    @Test
    void addition() {
        Vector v3 = v1.addition(v2);
        assertEquals(new Vector(4, 10, 9).toString(), v3.toString());
    }

    /**
     * Negative case of addition
     */
    @Test
    void additionNegative() {
        Vector v3 = v1.addition(v2);
        assertNotEquals(new Vector(7, 2, -3).toString(), v3.toString());
    }

    /**
     * Positive case of substraction
     */
    @Test
    void substraction() {
        Vector v3 = v1.substraction(v2);
        assertEquals(new Vector(-2, -2, 5).toString(), v3.toString());
    }

    /**
     * Positive case of kreuzprodukt
     */
    @Test
    void kreuzprodukt() {
        Vector v3 = v1.kreuzprodukt(v2);
        assertEquals(new Vector(-34, 19, -6).toString(), v3.toString());
    }

    /**
     * Positive case of skalarprodukt
     */
    @Test
    void skalarprodukt() {
        double result = v1.skalarprodukt(v2);
        assertEquals(41.0, result);
    }

    /**
     * Positive case of multiplikation
     */
    @Test
    void multiplikation() {
        Vector v3 = v1.multiplikation(2.0);
        assertEquals(new Vector(2, 8, 14).toString(), v3.toString());
    }

    /**
     * Positive case of division
     */
    @Test
    void division() {
        Vector v3 = v1.division(2.0);
        assertEquals(new Vector(0.5, 2, 3.5).toString(), v3.toString());
    }

    /**
     * Positive case of vectorLen
     */
    @Test
    void vectorLen() {
        double len = v1.vectorLen();
        assertEquals(8.124, len, delta);
    }
}