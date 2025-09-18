package Course.B_DataStructures.DataStructures.C_Queue.WithArray;

public class Queue {
    
    private final Input[] queue;
    private int front, rear;
    private int size, length;

    Queue(int n) {
        this.size = 0;
        this.front = this.rear = 0;
        this.length = n;
        queue = new Input[length];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == length;
    }

    protected int getSize() {
        return this.size;
    }

    protected int getFront() {
        return queue[front].getData();
    }

    protected int getRear() {
        return queue[rear].getData();
    }

    // enqueue
    protected void enqueque(int data) {
        Input newData = new Input(data);

        if (isFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == length - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            queue[rear] = newData;
            size++;
        }
    }

    protected void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int result = queue[front].getData();
            size--;

            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == size - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }

            System.out.printf("\nData %d behasil dihapus!\n", result);
        }
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("Qeueue Kosong");
        } else {

            int i = front;
            do {
                System.out.print(queue[i].getData() + " --> ");
                i++;

            } while (i != rear);
        }
        System.out.println("\nPanjang queue: " + getSize());
    }
}