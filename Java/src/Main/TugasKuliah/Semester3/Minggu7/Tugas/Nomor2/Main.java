package TugasKuliah.Semester3.Minggu7.Tugas.Nomor2;

public class Main {
    public static void main(String[] args) {

        // buat objek dari Class Manager, KasirGudang dan KasirTamu
        Manager mg = new Manager("Hendra Kurniawan", "12345");
        KasirTamu kst = new KasirTamu("Nindi Putri Lestari", "10010");
        KasirGudang ksg = new KasirGudang("Patria Anggara", "20219");

        // set data untuk masing masing objek
        kst.setUmur((byte) 20);
        kst.setAlamat("Jalan Cendrawasih Selatan, Jember");

        ksg.setAlamat("Jalan Wahyu Hidayat II, Madiun");
        ksg.setNamaBarang("Laptop");
        ksg.setHarga(5500000);
        ksg.setStok(5);
        ksg.setJmlBeli(2);
        ksg.setMetodePembayaran("Debit");
        ksg.setJmlUang(20000000);

        // panggil method dari masing masing objek
        mg.cetakLaporan();
        kst.pembayaran();
        ksg.pembayaran();

    }
}
