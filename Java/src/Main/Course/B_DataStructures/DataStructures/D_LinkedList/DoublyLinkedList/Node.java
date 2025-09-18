package Course.B_DataStructures.DataStructures.D_LinkedList.DoublyLinkedList;

public class Node {

    private int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    protected int getData() {
        return this.data;
    }
}