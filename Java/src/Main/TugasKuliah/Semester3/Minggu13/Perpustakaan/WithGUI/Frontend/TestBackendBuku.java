package TugasKuliah.Semester3.Minggu13.Perpustakaan.WithGUI.Frontend;

import TugasKuliah.Semester3.Minggu13.Perpustakaan.WithGUI.Backend.*;

public class TestBackendBuku {
    
    public static void main(String[] args) {
        
        Kategori novel = new Kategori().getById(10);
        Kategori referensi = new Kategori().getById(11);

        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        buku1.save();
        buku2.save();

        buku2.setJudul("Aljabar Linier");
        buku2.save();

        buku3.delete();

        for(Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        
        for(Buku b : new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
