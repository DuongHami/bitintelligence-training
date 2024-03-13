import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest {
    Person p1 = new Person(20, "A", "B", 160, 60);
    Person p2 = new Person(20, "A", "B", 160, 60);
    Person p3 = new Person(25, "C", "D", 180, 100);

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

//    @Test
//    void shallowCopy(){
//        Person[] personlist = p1.shallowCopy(5);
//        assertEquals(p1.getAge(), personlist[0].getAge());
//
//        personlist[3].setAge(50);
//        assertEquals(p1.getAge(), personlist[4].getAge());
//    }
//
//    @Test
//    void shallowCopyStudent(){
//        Student susi = new Student(25, "C", "D", 180, 100);
//        Person[] personlist = susi.shallowCopy(3);
//        for(int i = 0; i < 3; i++){
//            System.out.println(personlist[i]);
//        }
//    }
}