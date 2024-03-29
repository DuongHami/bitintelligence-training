package human;

abstract class Human implements HumanActions {
    private String name;
    private int age;
    private int hunger;
    private int energy;

    //static variable
    private static String scientificName = "Homo sapiens";

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public static String getScientificName() {
        return scientificName;
    }

    public static void setScientificName(String scientificName) {
        Human.scientificName = scientificName;
    }

    //constructor
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.hunger = 0;
        this.energy = 100;
    }

    //methode
    public void run(){
        this.setEnergy(this.getEnergy() - 20);
        this.setHunger(this.getHunger() + 20);
    }

    //methode
    public void eat(){
        this.setEnergy(this.getEnergy() + 20);
        this.setHunger(this.getHunger() - 40);
    }

    //Methode
    public void sleep(){
        this.setEnergy(100);
    }

    //Methode
    public void getStatus(){
        System.out.println(this.getName()+ ", "+this.getAge());
        System.out.println("Hunger: "+ this.getHunger());
        System.out.println("Energy: "+ this.getEnergy());
        System.out.println("---------------------------");
    }

    public void hadBirthday(){
        int currentAge = this.getAge();
        this.setAge(++currentAge);
    }

    //static methode
    public static void greetPerson(Human human1, Human human2){
        System.out.println(human1.getName() + ": Hello "+ human2.getName());
        System.out.println("---------------------------");
    }

    //static methode
    /*public static human.Human getChild(human.Human human1, human.Human human2, String name){
        System.out.println(human1.getName() + " and " + human2.getName() + " just had a baby:" + name);
        System.out.println("---------------------------");
        return new human.Human(name, 0);
    }*/
    @Override
    public void cook() {
        System.out.println("I made something to eat");
    }

    @Override
    public void drink() {
        System.out.println("I drank some water");
    }

}
