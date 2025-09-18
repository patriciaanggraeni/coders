package TugasKuliah.Semester3.Minggu7.Tugas.Nomor2;

public class KasirTamu extends Kasir {

    protected byte umur;
    protected String alamat;

    public KasirTamu(String nama, String id) {
        super(nama, id);
    }

    public byte getUmur() {
        return this.umur;
    }

    public void setUmur(byte umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void pembayaran() {
        System.out.println("\n============ Data Kasir Tamu ============\n");
        System.out.println("Id     : " + getId());
        System.out.println("Nama   : " + getNama());
        System.out.println("Umur   : " + getUmur());
        System.out.println("ALamat : " + getAlamat());
        System.out.println("\n=========================================");
    }
}
