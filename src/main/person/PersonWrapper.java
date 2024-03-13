package person;

import java.util.ArrayList;
import java.util.List;

public class PersonWrapper<T extends Person>{

    public List<T> shallowCopy(T person, int copyNums){
        List<T> personList = new ArrayList<>();
        for(int i = 0; i < copyNums; i++){
            personList.add(person);
        }
        return personList;
    }

    public Person deepCopy(T person){
        return new Person(
                person.getAge(),
                person.getFirstname(),
                person.getLastname(),
                person.getHeight(),
                person.getWeight()
        );
    }
}
