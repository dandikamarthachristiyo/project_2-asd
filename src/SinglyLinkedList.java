public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addlast(Object data) {
        Node baru = new Node(data);
        if (isEmpty()) {
            head = baru;
            tail = baru;
        } else {
            tail.pointer = baru;
            tail = baru;
        }
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index diluar batas : " + index);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.pointer;
        }
        return current.data;
    }

    public boolean contains(Object data) {
        Node current = head;
        
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.pointer;
        }
        return false;
    }
}
