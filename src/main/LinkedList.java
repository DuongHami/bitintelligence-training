import java.util.Objects;

public class LinkedList<T>{

    Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    private static class Node<T> {
        public T data;
        public Node next;

        public Node(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void addNewHead(T data){
        Node newHead = new Node(data);
        newHead.setNext(this.getHead().getNext());
        this.setHead(newHead);
    }

    public T deleteHead(){
        Node result = this.getHead();
        Node newHead = this.getHead().getNext();
        this.setHead(newHead);
        return (T) result.getData();
    }

    public void addNode(T data){
        if(this.getHead() == null){
            this.setHead(new Node(data));
        } else {
            Node current = this.getHead();
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
    }

    public T getNodedata(int position){
        if(position == 0){
            System.out.println(getHead().getData());
            return (T) this.getHead().getData();
        }
        Node current = this.getHead();
        int counter = 0;
        while(current.getNext() != null && counter != position){
            current = current.getNext();
            counter++;
        }
        System.out.println(current.getData());
        return (T) current.getData();
    }

    public void iterateList(){
        Node current = this.getHead();
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedList<?> that)) return false;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }
}
