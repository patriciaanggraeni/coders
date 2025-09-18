package TugasKuliah.Semester3.Minggu4.Presentasi;

public class Dosen {
    private String Kddosen;
    private Mahasiswa[] listMahasiswa;
    private int JmlMahasiswa;


    public Dosen(String Kddosen, Mahasiswa[] listMahasiswa, int JmlMahasiswa) {
        this.Kddosen = Kddosen;
        this.listMahasiswa = listMahasiswa;
        this.JmlMahasiswa = JmlMahasiswa;
    }

    public String getKddosen() {
        return this.Kddosen;
    }

    public void setKddosen(String Kddosen) {
        this.Kddosen = Kddosen;
    }

    public Mahasiswa[] getListMahasiswa() {
        return this.listMahasiswa;
    }

    public void setListMahasiswa(Mahasiswa[] listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    public int getJmlMahasiswa() {
        return this.JmlMahasiswa;
    }

    public void setJmlMahasiswa(int JmlMahasiswa) {
        this.JmlMahasiswa = JmlMahasiswa;
    }

    public void tampilData() {
        System.out.println("Kode Dosen : " + Kddosen);
        System.out.println("Jumlah Mahasiswa : " + JmlMahasiswa);
        for (int i = 0; i < listMahasiswa.length; i++) {
            System.out.println("NIM Mahasiswa ke-" + (i + 1) + " : " + listMahasiswa[i].getNim());
            System.out.println("Nama Mahasiswa ke-" + (i + 1) + " : " + listMahasiswa[i].getNama());
        }
    }
}
