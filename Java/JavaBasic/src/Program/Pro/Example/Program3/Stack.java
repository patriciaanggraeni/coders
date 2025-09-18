package Program.Pro.Example.Program3;

public class Stack {

    Node head;
    private int length;

    Stack() {
        this.length = 0;
    }

    private boolean isEmpty() {
        return head == null;
    }

    protected int getLength() {
        return this.length;
    }

    protected void push(String data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    protected String pop() {
        String result = " ";

        if (isEmpty()) {
            System.out.println("------------");
            System.out.println("Stack kosong");
            System.out.println("------------");
        } else {
            result = head.getData();
            head = head.next;
            length--;
        }

        return result;
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("------------");
            System.out.println("Stack kosong");
            System.out.println("------------");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
    }
}