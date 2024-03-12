import java.util.Arrays;
import java.util.Objects;

public class IntArray {

    int[] array;
    int pointer;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    /**
     * Constructor
     * @param size of the int array
     */
    public IntArray(int size){
        this.array = new int[size];
        this.pointer = 0;
    }

    /**
     * Add a new int into the array
     * If the array if full the size it doubled and the numbers are transfered into the new array
     * @param elem int to be added to the array
     */
    public void add(int elem){
        if(this.getPointer() < this.getArraySize()){
            this.getArray()[this.getPointer()] = elem;
            this.setPointer(this.getPointer() + 1);
        } else {
            int[] newArray = new int[this.getArraySize()*2];
            for(int i = 0; i < this.getArraySize(); i++){
                newArray[i] = this.getArray()[i];
            }
            newArray[this.getPointer()] = elem;
            this.setPointer(this.getPointer() + 1);
            this.setArray(newArray);
        }
    }

    /**
     *
     * @return int how many elems were added to the array
     */
    public int getElementCount(){
//        int counter = 0;
//        for(int elem : this.getArray()){
//            if(elem == 0)counter++;
//        }
//        return counter;
        return this.getPointer();
    }

    /**
     *
     * @param position index to get the element in the array from
     * @return int from the array
     */
    public int get(int position){
        if(position < this.getArraySize())
            return this.getArray()[position];
        System.out.println("Out of bounds");
        return 0;
    }

    /**
     *
     * @return length of the array
     */
    public int getArraySize(){
        return this.getArray().length;
    }

    /**
     * Print the array with its current values
     */
    public void print(){
        for(int elem : this.getArray()){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

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
