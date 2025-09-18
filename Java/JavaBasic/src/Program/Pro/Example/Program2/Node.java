package Program.Pro.Example.Program2;

public class Node {

    private final char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
    protected char getData() {
        return this.data;
    }
}
