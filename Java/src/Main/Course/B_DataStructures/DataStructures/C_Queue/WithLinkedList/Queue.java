package Course.B_DataStructures.DataStructures.C_Queue.WithLinkedList;

public class Queue {

    private Node front, rear;
    private int length;

    Queue() {
        this.front = this.rear = null;
        this.length = 0;
    }

    protected int length() {
        return this.length;
    }

    protected boolean isEmpty() {
        return length == 0;
    }

    // enqueue
    protected void enqueue(int data) {
        Node newNode = new Node(data); // membuat objekbaru

        if (isEmpty()) { // cek apakah front masih kosong
            front = newNode; // jika iya, isi front
        } else { // kalau engga
            rear.next = newNode; // sambungkan rear.next ke objek baru
        }
        rear = newNode; // set data menjadi rear
        length++; // tambahkan panjang data
    }

    protected int dequeue() {
        int result = 0;

        if (isEmpty()) {
            System.out.println("Queues kosong");
        } else {
            if (front == null) {
                rear = null;
            } else {
                result = front.getData();
                front = front.next;
            }
        }

        length--;
        return result;
    }

    // print method
    protected void print() {
        Node temp = front;

        if (isEmpty()) {
            System.out.println("Queues kosong");
        } else {

            do {
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            } while (temp != null);
            System.out.print("null\n");
        }
    }
}