package Course.B_DataStructures.DataStructures.B_Stack.WithLinkedList;
import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int length;

    Stack() {
        top = null; // set top ke null
        length = 0; // set length ke null
    }

    // baut fungsi untuk cek length apakah nol atau tidak
    private boolean isEmpty() {
        return length == 0;
    }

    // buat fungsi untuk mengebalikan nilai length
    private int length() {
        return this.length;
    }

    // ------------------------
    // push method
    protected void push(int data) {
        Node node = new Node(data); // buat objek baru

        if (isEmpty()) { // cek jika masih kosong
            top = node; // taruh node ke top
            length++;   // tambahkan nilai length
        } else { // jika tidak kosong
            node.next = top; // sambungkan next node ke top
            top = node; // set node menjadi top
            length++; // tambahkan panjang stack
        }
    }

    // ------------------------
    // pop method
    protected int pop() {
        int hasil; // buat variabel penampung

        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            hasil = top.getData(); // taruh data top ke variabel penampung
            top = top.next; // pindah posisi top saat ini ke berikutnya
            length--; // kurangkan nilai length
        }
        return hasil; // kembalikan nilai variabel penampung
    }

    // ------------------------
    // peek method
    protected int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return top.getData();
        }
    }

    // ------------------------
    // print method
    protected void print() {
        if (isEmpty()) {
            System.out.println("--------------");
            System.out.println("Stack is Empty");
            System.out.println("--------------");
        } else {
            Node temp = top;

            System.out.println("Stack: ");
            while (temp != null && length != 0) {
                System.out.println(temp.getData());
                temp = temp.next;
            }

            System.out.println("\nLength: " + this.length());
        }
    }
}
