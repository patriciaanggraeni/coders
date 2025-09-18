package Course.B_DataStructures.DataStructures.D_LinkedList.SinglyLinkedList;

public class Node {

    final private int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public int getData() {
        return data;
    }
}