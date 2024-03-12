import human.Bayern;
import human.French;
import human.German;
import human.Schwabe;

public class Main {
    public static void main(String[] args) {
//        //objekt
//        human.Human Steve = new human.Human("Steve", 18);
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
//        human.Human Susi = new human.Human("Susi", 20);
//
//        human.Human.greetPerson(Steve, Susi);
//
//        //object
//        human.Human Jenny = human.Human.getChild(Steve, Susi, "Jenny");
//
//        Jenny.getStatus();

        German Gertrude = new German("Gertrude", 22);
        German Rudiger = new German("Rudiger", 21);
//        Gertrude.cook();
//        Gertrude.drink();
//
//        German.greetPerson(Gertrude, Rudiger);

        Schwabe Thomas = new Schwabe("Thomas", 30);
        Schwabe Heidi = new Schwabe("Heidi", 28);

//        Thomas.cook();
//        Heidi.drink();
//
//        Schwabe.greetPerson(Thomas, Heidi);
//
//        Bayern.greetPerson(Thomas, Heidi);
//
//        French.greetPerson(Thomas, Heidi);

        German[] germanList = new German[]{Gertrude, Rudiger};
        Schwabe[] schawbList = new Schwabe[]{Thomas, Heidi};

        for(German german : germanList){
            System.out.println(german.getName());
        }

        for(int i = 0; i < schawbList.length; i++){
            System.out.println(schawbList[i].getName());
        }


    }
}