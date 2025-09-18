package Course.D_ObjectOrientedProgramming.G_Encapsulation;

public class Motor extends Transportasi {

    private String noKendaraan, status;
    private int pajak;

    public Motor() {}

    public Motor(String nama, String jenis, int harga, String noKendaraan, String status, int pajak) {
        super(nama, jenis, harga);
        this.noKendaraan = noKendaraan;
        this.status = status;
        this.pajak = pajak;
    }

    public void setNoKendaraan(String no) {
        this.noKendaraan = no;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }

    public String getNoKendaraan() {
        return this.noKendaraan;
    }

    public String getStatus() {
        return this.status;
    }

    public int getPajak() {
        return this.pajak;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Plat No: " + noKendaraan);
        System.out.println("Status: " + status);
        System.out.println("Pajak/tahun: " + pajak);
    }
}
