package Course.E_CollectionsFramework.B_JavaCollections.C_LinkedList;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // 1a. membuat deklarasi LinkedList (Heterogenous / banyak tipe data)
        LinkedList heteroLinkedList = new LinkedList();
        LinkedList<Object> objList = new LinkedList<Object>();

        // 1b. membuat deklarasi LinkedList (homogenous / satu tipe data)
        LinkedList<Integer> numberList = new LinkedList<Integer>(); // hanya menampung tipe data angka 
        LinkedList<String> stringList = new LinkedList<String>();

        // 2. menambahkan sebuah elemen ke dalam LinkedList
        heteroLinkedList.addFirst("First Element");
        heteroLinkedList.add(3.14);
        heteroLinkedList.addLast("Last Element");
        heteroLinkedList.add(1, true);
        heteroLinkedList.add(2, false);

        System.out.println("\nLinkedList Pertama: " + heteroLinkedList);

        numberList.add(3);
        numberList.add(10);
        numberList.add(99);
        numberList.add(895);
        numberList.add(212);

        stringList.add("Hello World");
        stringList.add("Belajar Java");
        stringList.add("Cuma Nyoba");

        objList.addAll(stringList);
        objList.addAll(1, numberList);

        System.out.println("\nSetelah menambahkan List: " + objList);

        // 3. Menghapus elemen dari LinkedList 
        objList.removeFirst();
        objList.removeLast();
        objList.remove(0);
        System.out.println("\nSetelah menghapus elemen LinkedList: " + objList);
        
        objList.removeAll(numberList);
        System.out.println("\nSetelah menghapus Collection LinkedList: " + objList);

        // 4. Mengambil elemen dan ukuran elemen
        objList.addAll(numberList);
        objList.addAll(stringList);

        var getFirst = objList.getFirst();
        var getLast = objList.getLast();
        var get = objList.get(3);
        int size = objList.size();
        
        System.out.println("\nLinkedList: " + objList);
        System.out.println("Mengambil elemen pertama : " + getFirst);
        System.out.println("Mengambil elemen terakhir: " + getLast);
        System.out.println("Mengambil elemen dengan index: " + get);
        System.out.println("Mengambil ukuran LinkedList  : " + size);

        // 5. mengecek elemen apakah kosong atau memiliki suatu elemen tertentu 
        boolean empty = objList.isEmpty();
        boolean contains = objList.contains("Hello World");
        boolean containsObj = objList.containsAll(stringList);

        System.out.println("\nMengecek LinkedList kosong: " + empty);
        System.out.println("Mengecek LinkedList menampung suatu elemen: " + contains);
        System.out.println("Mengecek LinkedList menampung suatu collection: " + containsObj);

        // 6. Mengurutkan, Membalik dan Mengacak elemen LinkedList (import dari collection)
        Collections.sort(numberList); // mengurutkan elemen LinkedList
        Collections.sort(stringList); // mengurutkan elemen LinkedList

        System.out.println("\nSesudah diurutkan: ");
        System.out.println("String List: " + stringList);
        System.out.println("Number List: " + numberList);

        Collections.sort(numberList, Collections.reverseOrder()); // membalikan urutan elemen
        System.out.println("\nSetelah urutan dibalik: " + numberList);
        
        Collections.shuffle(objList); // mengacak elemen LinkedList
        System.out.println("\nSetelah elemen diacak: " + objList);

        // 7. membaca elemen LinkedList dengan looping, for each dan Iterator
        System.out.println("\nMenggunakan For Loop: ");
        for (int i = 0; i < objList.size(); i++) {
            System.out.print(objList.get(i) + " ");
        }

        System.out.println("\n\nMenggunakan For Each: ");
        for (Object e : objList) {
            System.out.print(e + " ");
        }

        System.out.println("\n\nMenggunakan Iterator: ");
        Iterator printElement = objList.iterator();
        while (printElement.hasNext()) {
            System.out.print(printElement.next() + " ");
        }

        // 8. mengkonvert LinkedList ke dalam bentuk Array
        Object array[] = objList.toArray();
        System.out.println("\n\nKonvert ke Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // 9. membersihkan semua elemen LinkedList
        objList.clear();
        System.out.println("\n\nSesudah melakukan pembersihan data: " + objList);
    }
}