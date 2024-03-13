import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class PersonTest {
    Person p1 = new Person(20, "A", "B", 160, 60);
    Person p2 = new Person(20, "A", "B", 160, 60);
    Person p3 = new Person(25, "C", "D", 180, 100);

    /**
     * Checking if Person objects with identical values can be used for the same key
     */
    @Test
    void hashMapTest(){
        HashMap<Person, Integer> personMap = new HashMap<Person, Integer>();
        personMap.put(p1, p1.getAge());

        assertEquals(personMap.get(p1), 20);
        assertEquals(personMap.get(p2), 20);
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
     * Negative test by comparison different Person objects
     */
    @Test
    void differentPerson(){
        assertNotEquals(p1, p3);
    }

}