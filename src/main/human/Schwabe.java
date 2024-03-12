package human;

public class Schwabe extends German {

    public Schwabe(String name, int age) {
        super(name, age);
    }

    public static void greetPerson(Schwabe human1, Schwabe human2){
        System.out.println(human1.getName() + ": Griaßgodd "+ human2.getName());
        System.out.println("---------------------------");
    }

    @Override
    public void cook() {
        System.out.println("I made some Maultaschen");
    }

    @Override
    public void drink() {
        System.out.println("I drank some Stuttgarter Hofbräu");
    }

}
