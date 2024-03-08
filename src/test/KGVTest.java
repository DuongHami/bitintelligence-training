import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KGVTest {

    @Test
    void sameNumber() {
        assertEquals(KGV.getBiggestCommonDivider(10,10), 10);
    }

    @Test
    void oneIsZero() {
        assertEquals(KGV.getBiggestCommonDivider(10,0), 10);
    }

    @Test
    void greaterThanOneGCD() {
        assertEquals(KGV.getBiggestCommonDivider(21,15), 3);
    }

    @Test
    void direktResult() {
        assertEquals(KGV.getBiggestCommonDivider(10,5), 5);
    }

    @Test
    void noGCD() {
        assertEquals(KGV.getBiggestCommonDivider(7,3), 1);
    }

    @Test
    void calculateKGVpositive() {
        assertEquals(KGV.getSmallestCommonProduct(12,6), 12);
    }

    @Test
    void calculateKGVnegative() {
        assertNotEquals(KGV.getSmallestCommonProduct(9,12), 24);
    }
}