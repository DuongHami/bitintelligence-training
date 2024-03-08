import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BMICalcTest {

    @Test
    void interpretBMIUnderweight() {
        assertEquals(BMICalc.interpretBMI(20.0), category.NORMALGEWICHT);
    }

    @Test
    void interpretBMIObese() {
        assertEquals(BMICalc.interpretBMI(40.0), category.SCHWERES_ÜBERGEWICHT);
    }
}