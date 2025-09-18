package TugasKuliah.Semester3.Minggu7.Tugas.Nomor2;

public class Manager extends Pegawai {

    Manager() {}

    Manager(String nama, String id) {
        super(nama, id);
    }

    public void cetakLaporan() {
        System.out.println("\n============ Data Pegawai ============\n");
        System.out.println("Nama Pegawai: "  + super.getNama());
        System.out.println("Id Pegawai  : "  + super.id);
        System.out.println("\n======================================");
    }
}
