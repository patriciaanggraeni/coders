package Program.Midle.Queues.Program1;

public class Mahasiswa {

    private String nama, nim;
    private int absen;
    private double ipk;

    Mahasiswa() {}

    Mahasiswa(String nama, String nim, int absen, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.absen = absen;
        this.ipk = ipk;
    }

    protected String getNama() {
        return this.nama;
    }
    protected String getNim() {
        return this.nim;
    }
    protected int getAbsen() {
        return this.absen;
    }
    protected double getIpk() {
        return this.ipk;
    }
}
