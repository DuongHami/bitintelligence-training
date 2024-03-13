package person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public abstract class PersonAbstract {
    Person p1 = new Person(10, "A", "B", 160, 60);
    Person p2 = new Person(10, "A", "B", 160, 60);
    Person p3 = new Person(45, "C", "D", 180, 100);
    Person p4 = new Person(23, "E", "F", 145, 50);
    ArrayList<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
    @Test
    abstract void compareSame();
    @Test
    abstract void compareSmaller();
    @Test
    abstract void compareBigger();
    @Test
    abstract void sortList();
}
