package Project.Project3_Inventory.Template;

public abstract class Mainan {

    private String nama;
    private String warna;
    private String kondisi;

    private int stok;
    private int harga;

    public Mainan() {}

    public Mainan(String nama, String warna, String kondisi, int stok, int harga) {
        this.nama = nama;
        this.warna = warna;
        this.kondisi = kondisi;
        this.stok = stok;
        this.harga = harga;
    }

     // buat method abstract untuk menampilkan data barang
    public abstract void informasiBarang();

    // buat method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    // buat method getter
    public String getNama() {
        return this.nama;
    }

    public String getWarna() {
        return this.warna;
    }

    public int getStok() {
        return this.stok;
    }

    public int getHarga() {
        return this.harga;
    }

    public String getKondisi() {
        return this.kondisi;
    }

    public void tambahStok(int stokBaru) {
        this.stok += stokBaru;
    }

    public void kurangiStok(int stokLama) {
        this.stok = -stokLama;
    }
}