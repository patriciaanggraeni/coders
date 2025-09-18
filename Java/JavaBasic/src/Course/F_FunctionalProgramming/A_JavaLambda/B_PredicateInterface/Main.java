package Course.F_FunctionalProgramming.A_JavaLambda.B_PredicateInterface;

import java.util.function.Predicate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------------");
        
        // 1. Membuat sebuah objek predikat baru
        Predicate<Integer> example = x -> (x < 10 || x > -5 && x == 10);
        boolean resultOne = example.test(10);
        System.out.println("Hasil test adalah " + resultOne);

        
        // 2. Membuat sebuah objek predikat baru 
        Predicate<String> password = x -> x.length() >= 8;

        boolean isStrong = password.test("788Anggasjdiw");
        if (isStrong) {
            System.out.println("Password Kuat!");
        } else {
            System.out.println("Password Lemah!");
        }


        // 3. Membuat sebuah objek predicate baru
        Predicate<String> nama = x -> x.length() >= 5;
        String[] daftarNama = {"Angga", "Gilang", "Ijat", "Mei", "Kiran"};

        // baca elemen array satu per satu
        System.out.print("Hasil: ");
        for (String temp : daftarNama) { // tampung element array di dalam vairabel temp
            if (nama.test(temp)) { // cek, apakah elemen lebih dari atau sama dengan 5
                System.out.print(temp + " "); // jika iya, maka tampilkan elemen tersebut
            }
        }

        System.out.println("\n----------------------------------------------------");
        

        // 4. Mengecek kondisi menggunakan objek
        Sim org1 = new Sim("Angga", (byte) 17);
        Predicate<Sim> cekSim = obj -> (obj.getUmur() >= 17);

        System.out.println("\nDaftar Nama yang boleh membuat SIM: ");
        if (cekSim.test(org1)) {
            System.out.println(org1.getNama() + " " + "boleh membuat SIM");
        }

        // 5. Menggunakan kombinasi ArrayList
        ArrayList<Sim> daftarSim = new ArrayList<Sim>();

        // tambahkan objek ke dalam ArrayList
        System.out.println("\n===== Daftar Yang Boleh Membuat SIM =====");
        daftarSim.add(new Sim("Putra", (byte) 20));
        daftarSim.add(new Sim("Andrayana", (byte) 16));
        daftarSim.add(new Sim("Halim", (byte) 18));
        daftarSim.add(new Sim("Dini", (byte) 17));
        daftarSim.add(new Sim("Putri", (byte) 15));
   
        // gunakan for each untuk menampilkan data yang dibutuhkan
        for (Sim temp : daftarSim) {
            if (cekSim.test(temp)) {
                System.out.println(temp.getNama() + " " + "sudah boleh membuat SIM");
            }
        }

        // 6. Predicate juga mendukung Multiple Predicate 
        int array[] = {10, 22, 43, 50, 90, 101, 32, 1260, 30};
        
        // buat Predicate untuk mengecek angka lebih dari 30
        Predicate<Integer> checksGtreater = input -> input > 30;

        // buat dua Predicate untuk mengecek angka genap
        Predicate<Integer> checkEven = input -> input % 2 == 0;

        // tangkap nilai array menggunakan for each
        // join menggunakan logika and dan or, bisa menggunakan negasi (tapi tidak di gabung (satu satu))
        System.out.println("\n----- Hasil Multiple Predicate: AND -----");
        for (int temp : array) {
            if (checksGtreater.and(checkEven).test(temp)) {
                System.out.println(temp + " " + "merupakan bilangan genap dan lebih dari 30");
            }
        }

        System.out.println("\n----- Hasil Multiple Predicate: OR -----");
        for (int temp : array) {
            if (checksGtreater.or(checkEven).test(temp)) {
                System.out.println(temp + " " + "merupakan bilangan genap atau lebih dari 30");
            }
        }

        System.out.println("\n----- Hasil Multiple Predicate: NEGATE -----");
        for (int temp : array) {
            if (checkEven.negate().test(temp)) {
                System.out.println(temp + " " + "merupakan bilangan ganjil");
            }
        }
    }
}