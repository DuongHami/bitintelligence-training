import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BMICalcTest {

    @Test
    void interpretBMIUnderweight() {
        assertEquals(BMICalc.interpretBMI(20.0), category.NORMALGEWICHT);
    }

    @Test
    void interpretBMIObese() {
        assertEquals(BMICalc.interpretBMI(40.0), category.SCHWERES_UBERGEWICHT);
    }

    @Test
    void interpretBMINormalweight() {
        assertEquals(BMICalc.interpretBMI(18.5), category.NORMALGEWICHT);
    }

    @Test
    void interpretBMIOverweight() {
        assertEquals(BMICalc.interpretBMI(25), category.UBERGEWICHT);
    }

    @Test
    void calculateBMI() {
        assertEquals(BMICalc.calculateBMI(160, 60), 23.4375, 0.001);
    }
}