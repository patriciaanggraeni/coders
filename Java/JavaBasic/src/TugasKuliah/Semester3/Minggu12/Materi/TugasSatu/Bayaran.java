package TugasKuliah.Semester3.Minggu12.Materi.TugasSatu;

public class Bayaran {

    public int hitungBayaran(Pegawai pg) {
        int uang = pg.getGaji();

        if (pg instanceof Manajer) {
            uang += ((Manajer) pg).getTunjangan();
        } else if (pg instanceof Programmer) {
            uang += ((Programmer)pg).gerBonus();
        }

        return uang;
    }
}
