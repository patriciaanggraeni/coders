package Course.B_DataStructures.DataStructures.B_Stack.WithArray;

public class Stack {

    private final Data[] array;
    private final int size;
    private int top;

    Stack(int n) {
        this.top = -1; // -1 berarti stack kosong
        this.size = n; // set ukuran stack = n
        this.array = new Data[size]; // deklarasi array beserta ukurannya
    }

    private boolean isEmpty() {
        return top == -1;
    } // jika kosong, kembalikan nilai true

    private boolean isFull() {
        return top == size - 1;
    } // jika penuh, kembalikan nilai true

    protected void push(int data) { // buat fungsi push
        Data newData = new Data(data); // buat objek baru

        if (!isFull()) {
            top++; // tambahkan nilai top
            array[top] = newData; // taruh data di index top
        } else {
            if (isFull()) {
                System.out.println("-----------------");
                System.out.println("Stack sudah penuh");
                System.out.println("-----------------");
            }
        }
    }

    protected int pop() {

        if (isEmpty()) {
            System.out.println("------------------");
            System.out.println("Stack masih kosong");
            System.out.println("------------------");
        }

        Data temp = array[top]; // simpan data top ke variabel temp
        top--; // kurangi top
        return temp.getData(); // return temp
    }

    protected int peek() {
        if (isEmpty()) {
            System.out.println("------------------");
            System.out.println("Stack masih kosong");
            System.out.println("------------------");
        }

        return array[top].getData(); // ambil data yang ada di top stack
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("------------------");
            System.out.println("Stack masih kosong");
            System.out.println("------------------");
        } else {
            int i = top; // inisialisasi i sama dengan top
            do {
                System.out.println(array[i].getData()); // tampilkan data
                i--; // kurangi nilai i setiap iterasi
            } while (i >= 0); // buat kondisi
        }
    }
}