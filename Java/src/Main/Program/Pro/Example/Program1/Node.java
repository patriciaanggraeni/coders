package Program.Pro.Example.Program1;

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
