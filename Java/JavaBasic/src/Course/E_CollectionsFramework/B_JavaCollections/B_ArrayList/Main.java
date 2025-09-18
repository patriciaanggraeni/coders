package Course.E_CollectionsFramework.B_JavaCollections.B_ArrayList;

// import module yang dibutuhkan dari java.util
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // mendeklarasikan ArrayList secara Heterogeneous (dapat menampung banyak tipe data)
        ArrayList container = new ArrayList();
        ArrayList<Integer> myList1 = new ArrayList<Integer>();
        ArrayList<String> myList2  = new ArrayList<String>();
        ArrayList<Object> myList3  = new ArrayList<Object>();

        // mendeklarasikan ArrayList secara Homogenenous (hanya satu tipe data saja)
        ArrayList<Integer> integerList = new ArrayList<>();

        // jika ArrayList mengimplementasikan Interface List, maka kode program di bawah berlaku
        List<String> list = new ArrayList<String>();
        

        // bekerja dengan method
        // 1. Menambahkan element baru ke dalam ArrayList menggunakan method add
        // syntax: add(object) atau add(index, object).
        myList1.add(4);
        myList1.add(10);
        myList1.add(32);
        myList1.add(1);
        myList1.add(1002);

        myList2.add("Ujang");
        myList2.add("Angga");
        myList2.add("Hirarki");
        myList2.add("Halim");
        myList2.add("Anton");

        myList3.add("Hello World");
        myList3.add(3.14);
        myList3.add(23.4f);
        myList3.add(90490943783785L);
        myList3.add(2, true);

        // 2. menggunakan method addAll, menambahkan entitas tunggal ke dalam array list
        container.addAll(myList1);
        container.addAll(myList2);
        container.addAll(myList3);

        // 3. menampilkan element ArrayList menggunakan Class Iterator (disarankan, jangan menggunakan for loop dan for each)
        System.out.println("\nMenampilkan Elemen ArrayList dengan Iterator -----");
        Iterator items = container.iterator();
        while (items.hasNext()) {
            System.out.print(items.next() + " ");
        }

        // 4. menghapus satu emelen di dalam ArrayList
        System.out.println("\n\nMenghapus Satu Elemen ArrayList -----");
        container.remove("Hello World");
        Iterator r1 = container.iterator();
        while (r1.hasNext()) {
            System.out.print(r1.next() + " ");
        }

        // 5. menghapus banyak elemen secara langsung
        System.out.println("\n\nMenghapus Banyak Elemen Sekaligus ArrayList -----");
        container.removeAll(myList1);
        Iterator a2 = container.iterator();
        while (a2.hasNext()) {
            System.out.print(a2.next() + " ");
        }

        // 6. mengambil elemen ArrayList
        System.out.println("\n\nMengambil Elemen dari ArrayList -----");
        var nama = container.get(1);
        System.out.println("Nama yang diambil: " + nama);

        // 7. Mengubah data elemen ArrayList dengan data baru
        System.out.println("\n\nMengubah Data Sebelumnya ArrayList -----");
        System.out.println("Sebelum dirubah: " + container.get(0));
        container.set(0, "Dodik");
        System.out.println("Sesudah dirubah: " + container.get(0));

        // 8. Mengecek suatu elemen ada di dalam ArrayList atau tidak (return boolean)
        System.out.println("\n\nMengecek ada tidaknya elemen ArrayList -----");
        if (container.contains("Dodik")) {
            System.out.println("Yeyyy.... Elemen ada :)");
        } else {
            System.out.println("Yahh... Elemen tidak ada :(");
        }

        // 9. Mengecek apakah ArrayList kosong atau tidak
        System.out.println("\n\nMengecek apakah ArrayList kosong atau tidak -----");
        if (container.isEmpty()) {
            System.out.println("ArrayList Kamu masih kosong");
        } else {
            System.out.println("ArrayList masih ada isinya");
        }

        // 10. Mengambil ukuran dari sebuah ArrayList
        System.out.println("\n\nMengambil Ukuran ArrayList -----");
        int size = container.size();
        System.out.println("Ukuran ArrayList: " + size);

        // 11. mengurutkan elemen ArrayList menggunakan Class Collections
        System.out.println("\n\nSorting elemen ArrayList (ASC) -----");
        Collections.sort(myList1);
        Iterator a3 = myList1.iterator();
        while (a3.hasNext()) {
            System.out.print(a3.next() + " ");
        }

        System.out.println("\n\nSorting elemen ArrayList (DESC) -----");
        Collections.sort(myList1, Collections.reverseOrder());
        Iterator a4 = myList1.iterator();
        while (a4.hasNext()) {
            System.out.print(a4.next() + " ");
        }

        // 12. Mengacak urutan elemen ArrayList
        System.out.println("\n\nMengacak Urutan Elemen ArrayList -----");
        Collections.shuffle(container);
        Iterator a5 = container.iterator();
        while (a5.hasNext()) {
            System.out.print(a5.next() + " ");
        }

        // 13. Convert Array ke ArrayList
        System.out.println("\n\nMenkovert Array ke ArrayList -----");
        String[] hewan = {"Kucing", "Anjing", "Burung", "Buaya"};

        ArrayList convert = new ArrayList(Arrays.asList(hewan));

        Iterator a6 = convert.iterator();
        while (a6.hasNext()) {
            System.out.print(a6.next() + " ");
        }


    }   
}