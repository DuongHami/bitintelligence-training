import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisibleTest {
    @Test
    public void testEven() {
        assertTrue(Divisible.checkDivisibility(10));
    }

    @Test
    public void testOdd() {
        assertFalse(Divisible.checkDivisibility(5));
    }
}
