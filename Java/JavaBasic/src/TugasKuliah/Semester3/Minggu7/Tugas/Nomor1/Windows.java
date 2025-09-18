package TugasKuliah.Semester3.Minggu7.Tugas.Nomor1;

public class Windows extends Laptop {

    public String fitur;

    public Windows() {}

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilDataWindows() {
        System.out.println("\n============ Data Spesifikasi Windows ============\n");
        super.tampilData();
        super.tampilDataLaptop();
        System.out.println("Fitur Windows      : " + this.fitur);
        System.out.println("\n==================================================");
    }
}
