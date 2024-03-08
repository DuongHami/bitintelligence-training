public class Main {
    public static void main(String[] args) {
        //objekt
        Human Steve = new Human("Steve", 18);
        Steve.getStatus();
        Steve.run();
        Steve.getStatus();
        Steve.run();
        Steve.run();
        Steve.run();
        Steve.getStatus();
        Steve.sleep();
        Steve.getStatus();
        Steve.hadBirthday();
        Steve.getStatus();

        //object
        Human Susi = new Human("Susi", 20);

        Human.greetPerson(Steve, Susi);

        Human Jenny = Human.getChild(Steve, Susi, "Jenny");

        Jenny.getStatus();

    }
}