import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ObjectArrayTest {

    ObjectArray<Integer> array = new ObjectArray<>(3);
    Integer[] test = new Integer[]{4, null, null};

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
    void getElementCountWithOverflow() {
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        assertEquals(array.getElementCount(), 4);
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