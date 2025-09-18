package Course.D_ObjectOrientedProgramming.G_Encapsulation;

public class Sepeda extends Transportasi {

    private String tahunKeluaran, merk;
    private byte pemakaian;

    public Sepeda() {}

    public Sepeda(String nama, String jenis, int harga, String tahunKeluaran, String merk, byte pemakaian) {
        super(nama, jenis, harga);
        this.tahunKeluaran = tahunKeluaran;
        this.merk = merk;
        this.pemakaian = pemakaian;
    }

    public void setTahunKeluaran(String tahun) {
        this.tahunKeluaran = tahun;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPemakaian(byte harga) {
        this.pemakaian = pemakaian;
    }

    public String getTahunKeluaran() {
        return this.tahunKeluaran;
    }

    public String getMerk() {
        return this.merk;
    }

    public byte getPemakaian() {
        return this.pemakaian;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tahun merk: " + merk);
        System.out.println("Tahun keluaran: " + tahunKeluaran);
        System.out.println("Tahun pemakaian: " + pemakaian + " bulan");
    }
}
