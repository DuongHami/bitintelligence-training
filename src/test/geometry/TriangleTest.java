package geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends GeometryTest{

    Triangle triangle = new Triangle(
            new Point(-1, 2),
            new Point(2, 3),
            new Point(4, -3)
    );

    /**
     * Positive test for calculateArea
     */
    @Override
    @Test
    void calculateArea() {
        double area = triangle.calculateArea();
        assertEquals(10.0, area);
    }

    /**
     * Positive test for calculateCircumference
     */
    @Override
    @Test
    void calculateCircumference() {
        double circumference = triangle.calculateCircumference();
        assertEquals(16.557, circumference, DELTA);
    }
}