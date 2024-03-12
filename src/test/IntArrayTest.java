import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayTest {

    IntArray array = new IntArray(3);
    int[] test = new int[]{4, 0, 0};

    @Test
    void add() {
        array.add(4);
        assertArrayEquals(array.getArray(), test);
    }

    @Test
    void addNegative() {
        array.add(10);
        assertFalse(Arrays.equals(array.getArray(), test));
    }

    @Test
    void getElementCount() {
        array.add(1);
        array.add(2);
        assertEquals(array.getElementCount(), 2);
    }

    @Test
    void get() {
        array.add(2);
        assertEquals(array.get(0), 2);
    }

    @Test
    void getArraySize() {
        assertEquals(array.getArraySize(), 3);
    }
}