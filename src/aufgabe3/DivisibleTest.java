package aufgabe3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static aufgabe3.Divisible.checkDivisibility;
public class DivisibleTest {
    @Test
    public void testEven() {
        assertTrue(checkDivisibility(10));
    }

    @Test
    public void testOdd() {
        assertFalse(checkDivisibility(5));
    }
}
