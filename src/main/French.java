public class French extends Human {
    public French(String name, int age) {
        super(name, age);
    }

    public static void greetPerson(French human1, French human2){
        System.out.println(human1.getName() + ": Bonjour "+ human2.getName());
        System.out.println("---------------------------");
    }

    @Override
    public void cook() {
        System.out.println("I made some Baguette");
    }

    @Override
    public void drink() {
        System.out.println("I drank some wine");
    }
}
