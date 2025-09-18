package Course.B_DataStructures.DataStructures.F_Heap;

public class Heap {

    /*
       -----------------------------------
       1. Integer -> Objek -> Default null
       2. Int  -> Primitive -> Default 0
       -----------------------------------
     */

    private Integer[] heap; // membuat array dengan tipe data Integer
    private int n; // variabel n untuk ukuran heapnya

    Heap(int capacity) {
        heap = new Integer[capacity + 1]; //inisialisaikan array heap
        this.n = 0; // set n ke 0
    }

    protected boolean isEmpty() {
        return n == 0; // cek apakah n sam dengan 0
    }

    protected int getSize() {
        return this.n; // ambil ukuran heap dari variabel heap
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 1; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    // Isert max heap ----------------------
    protected void insertMax(int data) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }

        n++;
        heap[n] = data;
        swim(n);
    }

    private void swim(int k) {
        while (k > 1 && heap[k/2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }

    // Delete max heap ----------------------
    protected int deleteMax() {
        int max = heap[1];
        swap(1,n);
        n--;
        sink(1);
        heap[n+1] = null;

        if (n > 0 && (n == (heap.length - 1) / 4)) {
            resize(heap.length/2);
        }
        return max;
    }

    private void sink(int k) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && heap[j] < heap[j+1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k,j);
            k = j;
        }
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("Heap Kosong");
        } else {
            for (int i = 1; i < heap.length; i++) {
                System.out.print(heap[i] + " ");
            }
        }
    }
}