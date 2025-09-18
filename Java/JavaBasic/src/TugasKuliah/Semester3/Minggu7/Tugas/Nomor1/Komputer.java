package TugasKuliah.Semester3.Minggu7.Tugas.Nomor1;

public class Komputer {
    
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer() {}

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk               : " + this.merk);
        System.out.println("Kecepatan Prosesor : " + this.kecProsesor + "GHz");
        System.out.println("Ukuran Memori      : " + this.sizeMemory + "GB");
        System.out.println("Jenis Prosesor     : " + jnsProsesor);
    }
}
