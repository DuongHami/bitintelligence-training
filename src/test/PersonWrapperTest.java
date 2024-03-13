import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonWrapperTest {

    Person p1 = new Person(20, "A", "B", 160, 60);
    Student s1 = new Student(15, "C", "D", 110, 40);

    Vector v1 = new Vector(5.0, 5.0, 5.0);
    PersonWrapper<Person> tester = new PersonWrapper<Person>();

    @Test
    void shallowCopy() {
        List<Person>  personList = tester.shallowCopy(p1,5);
        assertEquals(p1.getAge(), personList.get(0).getAge());

        personList.get(2).setAge(50);
        assertEquals(p1.getAge(), personList.get(4).getAge());

    }

    @Test
    void shallowCopyWithSubclass() {
        List<Person>  studentList = tester.shallowCopy(s1,5);
        assertEquals(s1.getAge(), studentList.get(0).getAge());

        studentList.get(2).setAge(50);
        assertEquals(s1.getAge(), studentList.get(4).getAge());

    }

//    @Test
//    void shallowCopyWithWrongSubclass() {
//        List<Person>  studentList = tester.shallowCopy(v1,5);
//        assertEquals(v1.getAge(), studentList.get(0).getAge());
//
//        studentList.get(2).setAge(50);
//        assertEquals(v1.getAge(), studentList.get(4).getAge());
//
//    }

    @Test
    void deepCopy() {
        Person p2 = tester.deepCopy(p1);
        p2.setAge(50);
        assertNotEquals(p2.getAge(), p1.getAge());
    }
}