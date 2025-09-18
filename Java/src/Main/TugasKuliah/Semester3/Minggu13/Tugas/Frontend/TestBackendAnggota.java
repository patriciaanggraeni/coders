package TugasKuliah.Semester3.Minggu13.Tugas.Frontend;

import TugasKuliah.Semester3.Minggu13.Perpustakaan.WithGUI.Backend.*;

public class TestBackendAnggota {
    
    public static void main(String[] args) {
        
        Anggota angg1 = new Anggota("Patria Anggra", "Jalan Wahyu Hidayat II", "0895399091596");
        Anggota angg2 = new Anggota("Dodik Firmansyah", "Jalan Bambulawas No. 23", "0895757483");
        Anggota angg3 = new Anggota("Intan Hani Wijaya", "Jalan Slawesi Utara No. 11", "0881647364");

        angg1.save();
        angg2.save();
        angg3.save();

        angg2.setTelephone("08812347483");
        angg2.save();

        angg3.delete();

        for(Anggota g : new Anggota().getAll()) {
            System.out.println("Nama: " + g.getNama() + ", Alamat: " + g.getAlamat() + ", Telephone: " + g.getTelephone());
        }
        
        for(Anggota g : new Anggota().search("Patria Anggara")) {
            System.out.println("Nama: " + g.getNama() + ", Alamat: " + g.getAlamat() + ", Telephone: " + g.getTelephone());
        }
    }
}
