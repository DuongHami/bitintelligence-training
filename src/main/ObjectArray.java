public class ObjectArray<T>{

    T[] array;
    int pointer;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
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
    public ObjectArray(int size){
        this.array = (T[]) new Object[size];
        this.pointer = 0;
    }

    /**
     * Add a new int into the array
     * If the array if full: the size is doubled and the numbers are transfered into the new array
     * @param elem int to be added to the array
     */
    public void add(T elem){
        if(this.getPointer() < this.getArraySize()){
            this.getArray()[this.getPointer()] = elem;
            this.setPointer(this.getPointer() + 1);
        } else {
            T[] newArray = (T[]) new Object[this.getArraySize()*2];
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
        return this.getPointer();
    }

    /**
     *
     * @param position index to get the element in the array from
     * @return int from the array
     */
    public T get(int position){
        return this.getArray()[position];
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
        for(T elem : this.getArray()){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

}
