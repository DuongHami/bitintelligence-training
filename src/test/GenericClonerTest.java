import csv.entity.Vector;
import org.junit.jupiter.api.Test;
import person.Person;
import person.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericClonerTest {
    Person p1 = new Person(20, "A", "B", 160, 60);
    Student s1 = new Student(15, "C", "D", 110, 40);

    Vector v1 = new Vector(5.0, 5.0, 5.0);
    GenericCloner<Person> personCloner = new GenericCloner<>();

    @Test
    void shallowCopy() {
        List<Person> personList = personCloner.shallowCopy(p1,5);
        assertEquals(p1.getAge(), personList.get(0).getAge());

        personList.get(2).setAge(50);
        assertEquals(p1.getAge(), personList.get(4).getAge());

    }

    @Test
    void shallowCopyWithSubclass() {
        List<Person>  studentList = personCloner.shallowCopy(s1,5);
        assertEquals(s1.getAge(), studentList.get(0).getAge());

        studentList.get(2).setAge(50);
        assertEquals(s1.getAge(), studentList.get(4).getAge());

    }

}