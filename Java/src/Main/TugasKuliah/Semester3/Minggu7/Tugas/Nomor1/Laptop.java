package TugasKuliah.Semester3.Minggu7.Tugas.Nomor1;

public class Laptop extends Komputer {

    public String jnsBaterai;

    public Laptop() {}

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilDataLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai      : " + this.jnsBaterai);
    }
}
