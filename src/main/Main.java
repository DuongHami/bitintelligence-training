public class Main {
    public static void main(String[] args) {

        IntArray test = new IntArray(3);
        test.print();
        test.add(3);
        test.print();
        test.add(6);
        test.print();
        test.add(5);
        test.print();

        test.add(1);
        test.print();

        System.out.println("Length of the current array: " + test.getArraySize());
        System.out.println("Element in index 2: " + test.get(2));
        System.out.println("Added numbers: " + test.getElementCount());


    }
}