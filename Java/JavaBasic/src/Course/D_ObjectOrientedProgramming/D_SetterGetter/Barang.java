package Course.D_ObjectOrientedProgramming.D_SetterGetter;

public class Barang {

    short kode;
    int jumlah;
    String nama, exp;

    Barang() {}

    Barang(short kode, String nama, int jumlah, String exp) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.exp = exp;
    }

    void print() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Expired: " + exp);
    }

    // membuat method set (biasanya pakai void)
    // jika ada dua parameter di fungsi set, masih bisa dikatakan set walaupun sudah tidak asli lagi
    void setKode(short kode) {
        this.kode = kode;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    void setExpired(String exp) {
        this.exp = exp;
    }

    // membuat method get (biasanya pakai return)
    String getNama() {
        return this.nama;
    }

    short getKode() {
        return this.kode;
    }

    int getJumlah() {
        return this.jumlah;
    }

    String getExpired() {
        return this.exp;
    }
}
