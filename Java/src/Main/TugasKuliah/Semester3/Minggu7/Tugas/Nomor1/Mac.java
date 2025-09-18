package TugasKuliah.Semester3.Minggu7.Tugas.Nomor1;

public class Mac extends Laptop {

    public String security;

    public Mac() {}

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilDataMac() {
        System.out.println("\n============ Data Spesifikasi Mac ============\n");
        super.tampilData();
        super.tampilDataLaptop();
        System.out.println("Security           : " + this.security);
        System.out.println("\n==============================================");
    }
}
