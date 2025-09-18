package Course.B_DataStructures.DataStructures.C_Queue.WithLinkedList;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(6);
        queue.enqueue(102);
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}
