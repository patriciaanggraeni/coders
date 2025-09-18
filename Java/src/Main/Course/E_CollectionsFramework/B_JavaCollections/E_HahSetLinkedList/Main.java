package Course.E_CollectionsFramework.B_JavaCollections.E_HahSetLinkedList;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        // 1. mendeklarasikan LinkedHashSet 
        LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();

        // 2. menambahkan elemen ke dalam LinkedHashSet (add(), addAll())
        lhs.add(19);
        lhs.add("Hello");
        lhs.add(3.4f);
        lhs.add(false);
        lhs.add(true);
        System.out.println("\nLinkedHashSet: " + lhs);

        // 3. menghapus elemen dari LinkedHashSet (remove(), removeAll())
        lhs.remove(19);
        lhs.remove(false);
        System.out.println("\nElemen dihapus: " + lhs);

        // 4. mengecek apakah kosong atau memuat elemen tertentu
        System.out.println("\nKosong: " + lhs.isEmpty());
        System.out.println("Memuat elemen: " + lhs.contains(3.4f));

        // 5. membaca data LinkedHashSet 
        System.out.println("\nMenggunakan For Each: ");
        for (Object e : lhs) {
            System.out.print(e + " ");
        }

        System.out.println("\n\nMenggunakan Iterator:  ");
        Iterator print = lhs.iterator();
        while (print.hasNext()) {
            System.out.println(print.next() + " ");
        }
    }
}