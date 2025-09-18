package Course.D_ObjectOrientedProgramming.A_ObjectClass;

// class sebagai blue print atau bisa sebagai wadah
public class Orang {
    // disarankan visibilitas dari property adalah private
    // Membuat atribut / property class (data)
    // inilah yang akan dimanipulasi
    String nama;
    byte umur;

    Orang() {} // sebuah konstaktor tanpa parameter

    // membuat sebuah method class
    void tambahNama(String nama) {
        this.nama = nama;
    }

    void tambahUmur(byte umur) {
        this.umur = umur;
    }

    void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}