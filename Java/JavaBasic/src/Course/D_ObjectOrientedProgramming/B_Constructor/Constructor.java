package Course.D_ObjectOrientedProgramming.B_Constructor;

public class Constructor {

    // membuat property atau atribut
    String nama, nim, jurusan;

    // constructor akan dijalankan pertama kali saat instansiasi objek
    // nama method yang sama dengan nama class
    // bisa memiliki parameter atau tidak
    // konstruktor dapat dioverload

    // konstruktor tanpa parameter dan
    Constructor() {};

    // konstuktor dengan parameter
    Constructor(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNim(String nim) {
        this.nim = nim;
    }

    void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    void print() {
        System.out.println("Nama:" + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}