public class Main {
    public static void main(String[] args) {
//        //objekt
//        Human Steve = new Human("Steve", 18);
//        Steve.getStatus();
//        Steve.run();
//        Steve.getStatus();
//        Steve.run();
//        Steve.run();
//        Steve.run();
//        Steve.getStatus();
//        Steve.sleep();
//        Steve.getStatus();
//        Steve.hadBirthday();
//        Steve.getStatus();
//
//        //object
//        Human Susi = new Human("Susi", 20);
//
//        Human.greetPerson(Steve, Susi);
//
//        //object
//        Human Jenny = Human.getChild(Steve, Susi, "Jenny");
//
//        Jenny.getStatus();

        German Gertrude = new German("Gertrude", 22);
        German Rudiger = new German("Rudiger", 21);
        Gertrude.cook();
        Gertrude.drink();

        German.greetPerson(Gertrude, Rudiger);

        Schwabe Thomas = new Schwabe("Thomas", 30);
        Schwabe Heidi = new Schwabe("Heidi", 28);

        Thomas.cook();
        Heidi.drink();

        Schwabe.greetPerson(Thomas, Heidi);

        Bayern.greetPerson(Thomas, Heidi);

        French.greetPerson(Thomas, Heidi);


    }
}