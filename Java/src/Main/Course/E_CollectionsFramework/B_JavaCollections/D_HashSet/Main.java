package Course.E_CollectionsFramework.B_JavaCollections.D_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        // 1a. mendeklarasikan HashSet tanpa menuliskan kapasitas dan load factor / fill ratio 
        HashSet hs = new HashSet(); // default memiliki kapasitas 16 dan load factor 0.75% atau 75%

        // 1b. mendeklarasikan HashSet dengan menuliskan kapasitas tanpa load factor
        HashSet hs2 = new HashSet(50); // memiliki kapasitas 50 dan load factor 75% 

        // 1c. mendeklarasikan HashSet dengan menuliskan kapasitas dan load factornya 
        HashSet hs3 = new HashSet(50, 0.85f); // spesifik, kapasitas 50 dan load factor 85%

        // 1d. mendeklarasikan HashSet dengan menuliskan tipe datanya 
        HashSet<Integer> integerHash = new HashSet<Integer>(30, .55f);

        // 2. menambahkan elemen dan collection di HashSet 
        System.out.println("\nMemasukkan elemen dan collection: ");
        hs.add(3);
        hs.add(2);
        hs.add(true);
        hs.add(false);
        hs.add("Hello World");
        hs.add(3);
        hs.add(null);
        System.out.println("Data HashMap: " + hs);

        hs2.addAll(hs);
        System.out.println("Data HashMap 2: " + hs2);

        // 3. menghapus elemen dan collection di HashSet
        System.out.println("\nMenghapus elemen dan collection: ");
        hs.remove(3.14);
        hs.remove(null);
        System.out.println("Menghapus elemen HashMap: " + hs);

        hs2.removeAll(hs);
        System.out.println("Mengahapus collection HashMap: " + hs2);

        // 4. mengecek apakah kosong atau terdapat elemen tertentu 
        System.out.println("\nApakah HashSet kosong? " + hs.isEmpty());
        System.out.println("Apakah HashMap memiliki elemen tertentu? " + hs.contains(false));
        System.out.println("Apakah HashMap mempunyai suatu collection? " + hs2.containsAll(hs));

        // 5. mengambil panjang dari HashSet
        System.out.println("\nPanjang HashSet adalah " + hs.size());

        // 6. membaca data HashSet dengan For Each dan Iterator
        System.out.println("\nMenggunakan For Each: ");
        for (Object e : hs) {
            System.out.print(e + " ");
        }

        System.out.println("\n\nMenggunakan Iterator: ");
        Iterator print = hs.iterator();
        while (print.hasNext()) {
            System.out.print(print.next() + " ");
        }

        // 7. Union, Intersection, difference
        HashSet<Integer> number1 = new HashSet<Integer>();
        HashSet<Integer> number2 = new HashSet<Integer>();

        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        
        number2.add(3);
        number2.add(4);
        number2.add(5);

        System.out.println("\n\nHashSet 1: " + number1);
        System.out.println("HashSet 2: " + number2);

        // menggunaka operasi union
        number1.addAll(number2);
        System.out.println("\nUnion: " + number1); 

        // menggunakan operasi intersection
        number1.retainAll(number2);
        System.out.println("Intersection: " + number1);

        // menggunakna operasi difference
        number1.removeAll(number2);
        System.out.println("Difference: " + number1);

        // menggunakan operasi subset
        number1.containsAll(number2);
        System.out.println("Subset: " + number1);

    }
}
