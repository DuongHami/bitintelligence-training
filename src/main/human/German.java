package human;

public class German extends Human {
    public German(String name, int age) {
        super(name, age);
    }

    public static void greetPerson(German human1, German human2){
        System.out.println(human1.getName() + ": Guten Tag "+ human2.getName());
        System.out.println("---------------------------");
    }

    @Override
    public void cook() {
        System.out.println("I made some Bratwurst");
    }

    @Override
    public void drink() {
        System.out.println("I drank some beer");
    }
}
