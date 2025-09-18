package TugasKuliah.Semester3.Minggu7.Percobaan2;

public class Manager extends Karyawan {
    
    public int tunjangan;

    public Manager() {}

    public void tampilDataManager() {
        super.tmapilDataKaryawan();
        System.out.println("Tunjanagan      =" + tunjangan);
        System.out.println("Total Gaji      =" + (super.gaji+tunjangan));
    }
}
