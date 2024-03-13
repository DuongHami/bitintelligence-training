package person;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class PersonTest extends PersonAbstract{
    @Test
    void compareSame() {
        int result = p1.compareTo(p2);
        assertEquals(0, result);
    }

    @Test
    void compareSmaller() {
        int result = p1.compareTo(p3);
        assertEquals(-1, result);
    }

    @Test
    void compareBigger() {
        int result = p3.compareTo(p1);
        assertEquals(1, result);
    }

    @Test
    void sortList(){
        Collections.sort(personList);

        for(int i = 1; i < personList.size(); i++){
            assertTrue(personList.get(i-1).getAge() <= personList.get(i).getAge());
        }
    }

    /**
     * Checking if person.Person objects with identical values can be used for the same key
     */
    @Test
    void hashMapTest(){
        HashMap<Person, Integer> personMap = new HashMap<>();
        personMap.put(p1, p1.getAge());

        assertEquals(personMap.get(p1), 10);
        assertEquals(personMap.get(p2), 10);
    }

    /**
     * Positiv test by comparison with assertEquals
     */
    @Test
    void samePersonWithAssert(){
        assertEquals(p1, p2);
    }

    /**
     * Positiv test by comparison with equals methode
     */
    @Test
    void samePersonWithEquals(){
        assertTrue(p1.equals(p2));
    }

    /**
     * Negativ test by comparison with == operator
     */
    @Test
    void samePersonWithOperator(){
        assertFalse(p1 == p2);
    }

    /**
     * Negative test by comparison with NotSame - comparable to !=
     */
    @Test
    void differentPersonAssertNotSame(){
        assertNotSame(p1, p2);
    }

    /**
     * Negative test by comparison different person.Person objects
     */
    @Test
    void differentPerson(){
        assertNotEquals(p1, p3);
    }

}