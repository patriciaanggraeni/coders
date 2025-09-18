package Course.B_DataStructures.DataStructures.B_Stack.WithLinkedList;

public class Node {

    private int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    protected int getData() {
        return this.data;
    }
}