import java.util.ArrayList;
import java.util.List;

public class GenericCloner <T>{
    public List<T> shallowCopy(T object, int copyNums){
        List<T> personList = new ArrayList<>();
        for(int i = 0; i < copyNums; i++){
            personList.add(object);
        }
        return personList;
    }
}
