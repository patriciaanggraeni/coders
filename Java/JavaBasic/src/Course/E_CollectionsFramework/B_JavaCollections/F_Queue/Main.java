package Course.E_CollectionsFramework.B_JavaCollections.F_Queue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        // 1.membuat deklarasi PriorityQueue (Homogeneous Data)
        PriorityQueue<String> queue = new PriorityQueue<String>();

        // 2a. menambahkan elemen Queue menggunakan method add();
        // berhasil -> return true, gagal -> return exception
        queue.add("Angga");
        queue.add("Anggi");
        queue.add("Renaldi");
        System.out.println("\n----- Menggunakan method add():");
        System.out.println("Hasil: " + queue);

        // 2b. menambahkan elemen Queue menggunakan method offer();
        // berhasil -> return true, gagal -> return false
        queue.offer("Halim");
        queue.offer("Agus");
        queue.offer("Salim");
        queue.offer("Muhammad");
        queue.offer("Putra");
        System.out.println("\n----- Menggunakan method offer():");
        System.out.println("Hasil: " + queue);

        // 3a. mengambil elemen head menggunakan method elemen()
        // berhasil -> return true, gagal -> return exception 
        String element = queue.element();
        System.out.println("\n----- Menggunakan method element():");
        System.out.println("Elemen head: " + element);

        // 3b. mengambil elemen head menggunakan method peek()
        // berhasil -> return true, gagal -> return null
        String peek = queue.peek();
        System.out.println("\n----- Menggunakan method peek():");
        System.out.println("Hasil: " + peek);

        // 4a. mengambil dan mengahapus elemen menggunakan method remove()
        // berhasil -> return true, gagal -> return exception 
        String remove = queue.remove();
        System.out.println("\n----- Menggunakan method remove():");
        System.out.println("Hapus elemen: " + remove);
        System.out.println("Hasil: " + queue);

        // 4b. mengambil dan mengahapus elemen menggunakan method poll()
        // berhasil -> return true, gagal -> return null 
        String poll = queue.poll();
        System.out.println("\n----- Menggunakan method poll():");
        System.out.println("Hapus elemen: " + poll);
        System.out.println("Hasil: " + queue);

        // 5. mengambil ukuran / panjang dari Queue
        int sizeQueue = queue.size();
        System.out.println("\n----- Menggunakan method size():");
        System.out.println("Hasil: " + sizeQueue);

        // 6a. menampilkan semua elemen menggunakan For Each 
        System.out.println("\n----- Mneggunakan For Each:");
        System.out.print("Hasil: ");
        for (String e : queue) {
            System.out.print(e + " ");
        }

        // 6b. menampilkan semua elemen menggunakan method iterator()
        System.out.println("\n\n----- Menggunakan method iterator():");
        System.out.print("Hasil: ");
        Iterator printQueue = queue.iterator();
        while (printQueue.hasNext()) {
            System.out.print(printQueue.next() + " ");
        }

        // 7. membersihkan semua elemen di dalam Queue
        queue.clear();
        System.out.println("\n\n----- Mneggunakan method clear():");
        System.out.println("Hasil: " + queue);

    }
}