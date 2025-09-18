package TugasKuliah.Semester3.Minggu2.TokoRoti;

public class Penjual {

    private final String namaPenjual = "Pak Budi";
    private final int hargaRoti;
    private final int jumlahPesanan;

    Penjual(int harga, int pesanan) {
        this.hargaRoti = harga;
        this.jumlahPesanan = pesanan;
    }

    protected int totalBayar() {
        return this.hargaRoti * this.jumlahPesanan;
    }

    protected void tampilPembayaran() {
        System.out.printf("Jumlah yang harus di bayar jika membeli %d roti di Toko %s adalah Rp %d", this.jumlahPesanan, this.namaPenjual, totalBayar());
    }
}