package TugasKuliah.Semester3.Minggu1.Praktikum;

import TugasKuliah.Semester3.Minggu1.Praktikum.Binatang.Anjing;
import TugasKuliah.Semester3.Minggu1.Praktikum.Binatang.Kucing;
import TugasKuliah.Semester3.Minggu1.Praktikum.Mobil.Lamborgini;
import TugasKuliah.Semester3.Minggu1.Praktikum.Mobil.Truck;

public class Demo {
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        Lamborgini lamborgini = new Lamborgini();
        Truck truck = new Truck();

        Laptop laptop = new Laptop();
        Orang orang = new Orang();

        // Class Object - Laptop (tanpa pewarisan)
        laptop.setMerk("Asus");
        laptop.setHarga(1200000);
        laptop.setSpesifikasi("Intel Core i5-6000H 8/512 SSD");

        System.out.println(" ");
        laptop.cetakInformasi();

        // Class Object - Orang (tanpa pewarisan)
        orang.setNama("Angga");
        orang.setUmur((byte) 19);

        System.out.println(" ");
        orang.cetakInformasi();


        // Class Object - Hewan Kucing (dengan pewarisan)
        System.out.println("\n===== Class Hewan Kucing");
        kucing.setNamaBinatang("Kitty");
        kucing.setJenisKucing("Kucing Persia");
        kucing.setUmurBinatang((byte) 3);
        kucing.setMakananKucing("Ikan");
        kucing.setSuaraBinatang("Meeooowww");
        kucing.cetakInformasi();

        // Class Object - Hewan Anjing (dengan pewarisan)
        System.out.println("\n===== Class Hewan Anjing");
        anjing.setNamaBinatang("Jester");
        anjing.setJenisAnjing("Anjing Pitbull");
        anjing.setUmurBinatang((byte) 7);
        anjing.setMakananAnjing("Daging");
        anjing.setSuaraBinatang("Guk Gukkk");
        anjing.cetakInformasi();

        // Class Object - Mobil Lamborgini (dengan pewarisan)
        System.out.println("\n===== Class Mobil - Lamborgini");
        lamborgini.setWarna("Gold");
        lamborgini.setJenisMobil("Mobil Sport");
        lamborgini.setStatusTurbo("Twin Turbo");
        lamborgini.setTipeBohlam("H2 9909");
        lamborgini.tambahKecepatan(2);
        lamborgini.cetakInformasi();

        // Class Object - Mobil Truck (dengan pewarisan)
        System.out.println("\n===== Class Mobil - Truck");
        truck.setWarna("Kuning");
        truck.setJenisMobil("Truck Muatan");
        truck.setTipeBohlam("H2 10991");
        truck.setKapasitasMuatan(100);
        truck.tambahKapasitasMuatan(50);
        truck.cetakInformasi();
    }
}
