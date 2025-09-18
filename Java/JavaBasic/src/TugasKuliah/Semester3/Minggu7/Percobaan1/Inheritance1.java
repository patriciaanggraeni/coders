package TugasKuliah.Semester3.Minggu7.Percobaan1;

public class Inheritance1 {
    public static void main(String[] args) {
        
        Manager M = new Manager();

        M.nama = "Vivin";
        M.alamat = "Jl. Vilonia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();

        Staff S = new Staff();
        
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.potongan = 500000;
        S.tampilDataStaff();

    }
}
