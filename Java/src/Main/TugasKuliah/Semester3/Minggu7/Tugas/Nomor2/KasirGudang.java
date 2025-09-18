package TugasKuliah.Semester3.Minggu7.Tugas.Nomor2;

public class KasirGudang extends Kasir {

    protected int stok;
    protected int harga;
    protected int jmlBeli;
    protected int jmlUang;

    protected String alamat;
    protected String namaBarang;
    protected String metodePembayaran;

    public KasirGudang() {}

    public KasirGudang(String nama, String id) {
        super(nama, id);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getUpdateStok() {
        return this.getStok() - this.getJmlBeli();
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJmlBeli() {
        return jmlBeli;
    }

    public void setJmlBeli(int jmlBeli) {
        this.jmlBeli = jmlBeli;
    }

    public int getJmlUang() {
        return jmlUang;
    }

    public void setJmlUang(int jmlUang) {
        this.jmlUang = jmlUang;
    }

    public int getJmlKembalian() {
        return this.getJmlUang() - this.getTotalBayar();
    }

    public int getTotalBayar() {
        return this.getJmlBeli() * this.getHarga();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    @Override
    public void pembayaran() {
        System.out.println("\n============ Data Kasir Gudang ============\n");
        System.out.println("Nama          : " + this.getNama());
        System.out.println("Id            : " + this.getId());
        System.out.println("Alamat        : " + this.getAlamat());
        System.out.println("Nama Barang   : " + this.getNamaBarang());
        System.out.println("Harga Barang  : Rp " + this.getHarga());
        System.out.println("Jumlah Beli   : " + this.getJmlBeli());
        System.out.println("Stok          : " + this.getStok());
        System.out.println("Stok Terkini  : " + this.getUpdateStok());
        System.out.println("Total Bayar   : Rp " + this.getTotalBayar());
        System.out.println("Pembayaran    : Rp " + this.getMetodePembayaran());

        System.out.println(" ");
        System.out.println("Total Uang      : Rp " + this.getJmlUang());
        System.out.println("Total Kembalian : Rp " + this.getJmlKembalian());
        System.out.println("\n===========================================");
    }


}
