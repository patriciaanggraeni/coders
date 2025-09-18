package TugasKuliah.Semester3.Minggu12.Materi.TugasSatu;

public class Programmer extends Pegawai {

    private int bonus;

    Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getGaji() {
        return this.gaji;
    }

    public int gerBonus() {
        return this.bonus;
    }
}
