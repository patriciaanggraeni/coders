package Course.D_ObjectOrientedProgramming.G_Encapsulation;

public class Transportasi {

    // memubuat atribute class / propertynya
    // set visiblelitynya / keamanannya
    private String nama, jenis;
    private int harga;

    // membuat constructor
    protected Transportasi() {}

    protected Transportasi(String nama, String jenis, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected void setJenis(String jenis) {
        this.jenis = jenis;
    }

    protected void setHarga(int harga) {
        this.harga = harga;
    }

    protected String getNama() {
        return this.nama;
    }

    protected String getJenis() {
        return this.jenis;
    }

    protected int getHarga() {
        return this.harga;
    }

    protected void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
    }
}
