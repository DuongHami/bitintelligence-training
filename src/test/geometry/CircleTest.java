package geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest extends GeometryTest{

    Circle circle = new Circle(
            new Point(3, 6),
            5.0
    );

    /**
     * Positive test for calculateCircumference
     */
    @Override
    @Test
    void calculateCircumference() {
        double circumference = circle.calculateCircumference();
        assertEquals(31.416,circumference, DELTA);
    }

    /**
     * Positive test for calculateArea
     */
    @Override
    @Test
    void calculateArea() {
        double area = circle.calculateArea();
        assertEquals(78.54, area, DELTA);
    }
}