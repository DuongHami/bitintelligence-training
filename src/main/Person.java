import java.util.Objects;

public class Person {
    private int age;
    private String firstname;
    private String lastname;
    private int height;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person(int age, String firstname, String lastname, int height, int weight) {
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
        return this.getAge() == person.getAge() && this.getHeight() == person.getHeight() && this.getWeight() == person.getWeight() &&
                Objects.equals(this.getFirstname(), person.getFirstname()) && Objects.equals(this.getLastname(), person.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAge(), this.getFirstname(), this.getLastname(), this.getHeight(), this.getWeight());
    }
}
