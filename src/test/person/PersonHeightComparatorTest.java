package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonHeightComparatorTest extends PersonAbstract{
    PersonHeightComparator comparator = new PersonHeightComparator();

    @Test
    void compareSame() {
        int result = comparator.compare(p1, p2);
        assertEquals(0, result);
    }

    @Test
    void compareSmaller() {
        int result = comparator.compare(p4, p3);
        assertEquals(-1, result);
    }

    @Test
    void compareBigger() {
        int result = comparator.compare(p3, p2);
        assertEquals(1, result);
    }

    @Test
    void sortList(){
        personList.sort(comparator);

        for(int i = 1; i < personList.size(); i++){
            assertTrue(personList.get(i-1).getHeight() <= personList.get(i).getHeight());
        }
    }
}