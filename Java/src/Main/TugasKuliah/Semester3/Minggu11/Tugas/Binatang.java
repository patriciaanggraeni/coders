package TugasKuliah.Semester3.Minggu11.Tugas;

public abstract class Binatang {
    
    protected String nama;
    protected int jmlKaki;

    Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJmlKaki() {
        return this.jmlKaki;
    }

    abstract void displayBinatang();
        
}