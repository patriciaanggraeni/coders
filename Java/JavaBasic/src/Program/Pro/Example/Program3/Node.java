package Program.Pro.Example.Program3;

public class Node {

    private final String data;
    Node next;

    Node(String data) {
        this.data = data;
    }

    protected String getData() {
        return this.data;
    }

}
