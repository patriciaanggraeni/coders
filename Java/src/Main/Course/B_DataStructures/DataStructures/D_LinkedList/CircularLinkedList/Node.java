package Course.B_DataStructures.DataStructures.D_LinkedList.CircularLinkedList;

public class Node {

    private final int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    protected int getData() {
        return this.data;
    }
}
