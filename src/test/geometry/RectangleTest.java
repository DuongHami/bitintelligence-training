package geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest extends GeometryTest {

    Rectangle rectangle = new Rectangle(
            new Point(1, 2),
            new Point(4, 6)
    );

    /**
     * Positive test for calculateCircumference
     */
    @Override
    @Test
    void calculateCircumference() {
        double circumference = rectangle.calculateCircumference();
        assertEquals(14.0,circumference);
    }

    /**
     * Positive test for calculateArea
     */
    @Override
    @Test
    void calculateArea() {
        double area = rectangle.calculateArea();
        assertEquals(12, area);
    }
}