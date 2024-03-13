import java.util.Arrays;
import java.util.Objects;

public class Person {
    private Integer age;
    private String firstname;
    private String lastname;
    private Integer height;
    private Integer weight;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Person(Integer age, String firstname, String lastname, Integer height, Integer weight) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return  Objects.equals(age, person.age) &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(height, person.height) &&
                Objects.equals(weight, person.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstname, lastname, height, weight);
    }

}
