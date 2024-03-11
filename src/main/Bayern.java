public class Bayern extends German{
    public Bayern(String name, int age) {
        super(name, age);
    }

    public static void greetPerson(Bayern human1, Bayern human2){
        System.out.println(human1.getName() + ": Servus "+ human2.getName());
        System.out.println("---------------------------");
    }

    @Override
    public void cook() {
        System.out.println("I made some Weißwurst");
    }

    @Override
    public void drink() {
        System.out.println("I drank some Maxlrainer Helles");
    }
}
