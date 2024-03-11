package geometry;

import org.junit.jupiter.api.Test;

public abstract class GeometryTest {
    final double DELTA = 0.001;
    @Test
    abstract void calculateArea();

    @Test
    abstract void calculateCircumference();
}
