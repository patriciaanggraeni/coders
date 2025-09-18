package TugasKuliah.Semester3.Minggu7.Tugas.Nomor1;

public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {}

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilDataPc() {
        System.out.println("\n============ Data Spesifikasi PC ============\n");
        super.tampilData();
        System.out.println("Ukuran Monitor     : " + this.ukuranMonitor + "inch");
        System.out.println("\n=============================================");
    }
}
