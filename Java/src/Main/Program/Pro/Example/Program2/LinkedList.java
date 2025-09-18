package Program.Pro.Example.Program2;

public class LinkedList {

    private int length;
    Node head;

    LinkedList() {
        this.length = 0;
    }

    private boolean isEmpty() {
        return head == null;
    }

    protected char getHead() {
        return head.getData();
    }

    protected void addFirst(char data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node node = new Node(data);

            node.next = head;
            head = node;
        }
        length++;
    }

    protected void addLast(char data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node node = new Node(data);
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
            node.next = null;
        }
        length++;
    }

    protected void add(char data, int index) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node node = new Node(data);

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
    }

    protected void insertBefore(char input, char before) {

        if (isEmpty()) {
            System.out.println("-------------------");
            System.out.println("Linked List kosong!");
            System.out.println("-------------------");
        } else {
            Node node = new Node(input);

            if (head.getData() == before) {
                node.next = head;
                head = node;
                length++;
            } else {
                Node prev = head;
                Node temp = prev.next;

                while (temp != null && prev.getData() != before) {
                    if (temp.getData() == before) {
                        prev.next = node;
                        node.next = temp;
                    }
                    temp = temp.next;
                    prev = prev.next;
                }

                length++;

                if (prev.next == null) {
                    System.out.println("---------------------------------");
                    System.out.println("Data yang anda masukkan tidak ada");
                    System.out.println("---------------------------------");
                }
            }
        }
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("-----------------------");
            System.out.println("Linked List masih kosong");
            System.out.println("-----------------------");
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
