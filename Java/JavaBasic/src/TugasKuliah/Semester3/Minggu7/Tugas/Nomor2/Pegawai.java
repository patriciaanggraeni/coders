package TugasKuliah.Semester3.Minggu7.Tugas.Nomor2;

public class Pegawai {

    protected String id;
    protected String nama;

    public Pegawai() {}

    public Pegawai(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
