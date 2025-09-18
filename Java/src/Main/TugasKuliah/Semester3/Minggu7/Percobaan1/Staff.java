package TugasKuliah.Semester3.Minggu7.Percobaan1;

public class Staff extends Karyawan {

    public int lembur, potongan;

    public Staff() {}

    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tmapilDataKaryawan();
        System.out.println("Lembur          =" + lembur);
        System.out.println("Potongan        =" + potongan);
        System.out.println("Total Gaji      =" + (gaji + lembur + potongan));
    }
}
