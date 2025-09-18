package Program.Midle.DataMhs.Array;

public abstract class Struk {

    // membuat 8 data struk, dan kurangkan sebanyak 5 data (pop)
    private String noTransaksi;
    private String tanggalPembelian;
    private int jumlahBeli;
    private double hargaBarang;
    private double total;

    Struk() {}

    Struk(String noTran, String tglPem, int jumBel, double harga) {
        this.noTransaksi = noTran;
        this.tanggalPembelian = tglPem;
        this.jumlahBeli = jumBel;
        this.hargaBarang = harga;
    }

    // buat method abstrak
    public abstract void methodAbstrak();

    // buat method get data
    public String getNoTransaksi() {
        return this.noTransaksi;
    }

    public String getTanggalPembelian() {
        return this.tanggalPembelian;
    }

    public int getJumlahPembelian() {
        return this.jumlahBeli;
    }

    public double getHarga() {return this.hargaBarang;}

    public double getTotal() {
        this.total = jumlahBeli * hargaBarang;
        return this.total;
    }

}
