package Course.D_ObjectOrientedProgramming.J_Reference;

public class Mobil {

    // membuat atribut class
    String merk, warna;
    int harga;

    Mobil() {

    }

    Mobil(String merk, String warna, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    void print() {
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
    }
}
