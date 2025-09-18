package Course.B_DataStructures.DataStructures.F_Heap;

public class Main {
    public static void main(String[] args) {

        Heap heap = new Heap(3);
        System.out.println("Ukuran heap: " + heap.getSize());
        System.out.println("Jumlah data: " + heap.isEmpty());

        heap.insertMax(12);
        heap.insertMax(14);
        heap.insertMax(30);
        heap.insertMax(323);
        heap.insertMax(31);
        heap.insertMax(400);
        heap.print();

        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        System.out.println(" ");
        heap.print();
    }
}