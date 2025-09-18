package Course.F_FunctionalProgramming.B_JavaStream.B_FilteringMethod;

import java.util.List;
import java.util.Iterator;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Mahasiswa {

    private String nama;
    private String nim;
    private float nilai;

    Mahasiswa(String nama, String nim, float nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public float getNilai() {
        return nilai;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Membuat Array List untuk angka yang akan difilter dan hasilnya
        List<Integer> listNumber = Arrays.asList(10, 15, 13, 21 , 30, 140, 11, 22);
        List<Integer> tempNumber = new ArrayList<Integer>();

        // 2. Memfilter data tanpa menggunakan Stream
        System.out.println("\n----- Tanpa Menggunakan Java Stream");
        for (int x : listNumber) {
            if (x % 2 == 0) {
                tempNumber.add(x);
            }
        }

        System.out.print("Data Genap: ");
        Iterator<Integer> temp = tempNumber.iterator();
        while (temp.hasNext()) {
            System.out.print(temp.next() + " ");
        }


        // 3. Memfilter data menggunakan Java Streams: Filter
        // Collection akan menjadi sumber dan data dari sumber tidak akan berubah
        // syntax: coolection = colletion.stream().filter(predicate).collect(Collectors.toList());
        System.out.println("\n\n----- Menggunakan Java Streams");

        List<Integer> result = new ArrayList<Integer>();
        result = listNumber.stream().filter( x -> x % 2 == 0 ).collect(Collectors.toList());
        System.out.print("Data Genap: " + result);

        // atau jika sudah memfilter, data bisa langsung ditampilkan (gunakan foreach)
        System.out.print("\nData Genap: ");
        listNumber.stream().filter( x -> x % 2 == 0 ).collect(Collectors.toList()).forEach( x -> System.out.print(x + " ") ); // bisa langsung System.out::print


        // 4. Menampilkan nama yang hanya memiliki panjang >= 5 karakter
        System.out.println("\n\n----- Memfilter Nama");

        System.out.print("Hasil: ");
        List<String> names = Arrays.asList("Angga", "Cantika", "Jiran", "Ema", "Ipul");
        names.stream().filter( x -> x.length() >= 5 ).forEach( x -> System.out.print(x + " ") );


        // 5. Bermain dengan objek
        System.out.println("\n\n----- Bermain dengan Objek");

        // pertama, buat list objeknya
        List<Mahasiswa> daftarMhs = Arrays.asList(
                new Mahasiswa("Patria Anggara", "2141720058", 89.7f),
                new Mahasiswa("Rizky Saputra", "2141628754", 90.1f),
                new Mahasiswa("Jojo Kurniawan", "2141536271", 85.6f)
        );

        // kedua, buat lambda expressions Predicate, Consumer dan Supplier
        Predicate<Mahasiswa> check = x -> x.getNilai() >= 90;
        Consumer<Mahasiswa> showData = x -> {

            Supplier<String> getNama = () -> x.getNama();
            Supplier<String> getNim = () -> x.getNim();
            Supplier<Float> getNilai = () -> x.getNilai();

            System.out.println("Nama  : " + getNama.get());
            System.out.println("NIM   : " + getNim.get());
            System.out.println("Nilai : " + getNilai.get());
        };

        // ketiga, buat collection baru untuk menampung data yang sudah difilter
        List<Mahasiswa> mhs = daftarMhs.stream().filter(check).collect(Collectors.toList());

        // keempat, tampilkan data tersebut menggunakan foreach
        mhs.forEach(showData);

    }
}