package Program.Pro.Example.Program1;

public class LinkedList {

    Node head;
    private int length;

    LinkedList() {
        this.length = 0;
    }

    private boolean isEmpty() {
        return head == null;
    }

    protected int getLength() {
        return this.length;
    }

    protected void addFirst(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    protected void addLast(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        length++;
    }

    protected void add(int index, int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
        } else {
            if (index == 1) {
                node.next = head;
                head = node;
            } else {
                Node prev = head;
                int count = 1;

                while (count < index - 1) {
                    prev = prev.next;
                    count++;
                }

                Node current = prev.next;
                prev.next = node;
                node.next = current;
            }
        }
        length++;
    }

    protected void insertBefore(int data, int var) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node node = new Node(data);
            Node prev = head;
            Node temp = prev.next;

            if (head.getData() == var) {
                node.next = head;
                head = node;
            } else {
                while (temp != null && prev.getData() != var) {
                    if (temp.getData() == var) {
                        prev.next = node;
                        node.next = temp;
                    }
                    temp = temp.next;
                    prev = prev.next;
                }

                if (prev.next == null) {
                    System.out.println("\n-----------------------------");
                    System.out.println("Data tidak ada di linked list");
                    System.out.println("-----------------------------\n");
                }
            }
        }
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node temp = head;

            System.out.print("Linked List: ");
            while (temp != null) {
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
    }
}
