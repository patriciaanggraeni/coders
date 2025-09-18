package Course.B_DataStructures.DataStructures.C_Queue.WithArray;

public class Main {
    public static void main(String[] args) {
        
        Queue queue = new Queue(5);

        queue.enqueque(12);
        queue.enqueque(13);
        queue.enqueque(14);
        queue.enqueque(15);
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();


    }
}
