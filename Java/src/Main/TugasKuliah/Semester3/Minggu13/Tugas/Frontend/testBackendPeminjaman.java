package TugasKuliah.Semester3.Minggu13.Tugas.Frontend;

import TugasKuliah.Semester3.Minggu13.Tugas.Backend.*;

public class testBackendPeminjaman {
    
    public static void main(String[] args) {
        
        Buku buku = new Buku().getById(2);
        Anggota anggota = new Anggota().getById(13);

        Peminjaman pinjaman1 = new Peminjaman(anggota, buku, "2022/05/10", "2023/05/10");
        Peminjaman pinjaman2 = new Peminjaman(anggota, buku, "2022/07/15", "2023/07/15");
        Peminjaman pinjaman3 = new Peminjaman(anggota, buku, "2022/09/20", "2023/09/20");

        pinjaman1.save();
        pinjaman2.save();

        pinjaman2.setTglKembalian("2024/12/12");
        pinjaman2.save();

        pinjaman3.delete();

        for(Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("IdPeminjaman: " + p.getIdPeminjaman() + ", Id Anggota: " + p.getAnggota().getIdAnggota() + ", Id Buku: " + p.getBuku().getIdBuku() + "\n" + 
            "Tanggal Pinjam: " + p.getTglPeminjaman() + ", Tanggal Kembali: " + p.getTglKembalian());
        }
        
        for(Peminjaman p : new Peminjaman().search("2024/12/12")) {
            System.out.println("IdPeminjaman: " + p.getIdPeminjaman() + ", Id Anggota: " + p.getAnggota().getIdAnggota() + ", Id Buku: " + p.getBuku().getIdBuku() + "\n" + 
            "Tanggal Pinjam: " + p.getTglPeminjaman() + ", Tanggal Kembali: " + p.getTglKembalian());
        }
    }
    
}
