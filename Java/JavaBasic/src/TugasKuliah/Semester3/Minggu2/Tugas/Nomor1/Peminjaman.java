package TugasKuliah.Semester3.Minggu2.Tugas.Nomor1;

public class Peminjaman {

    Peminjaman head, next;

    public int idPeminjaman;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;

    Peminjaman() {}

    Peminjaman(int idPeminjaman, String namaMember, String namaGame, int lamaSewa, int harga) {
        this.idPeminjaman = idPeminjaman;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaSewa = lamaSewa;
        this.harga = harga;

        this.next = null;
        this.head = null;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }


    public String getNamaMember() {
        return namaMember;
    }

    public String getNamaGame() {
        return namaGame;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int hargaPembayaran() {
        return this.lamaSewa * this.harga;
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        if (head == null) {
            head = peminjaman;
        } else {
            peminjaman.next = head;
            head = peminjaman;
        }
        System.out.println("\nData berhasil di tambah!");
    }

    public void tampilDataPeminjaman() {
        Peminjaman temp = head;
        System.out.println("\n----- Data Peminjaman Game ------\n");
        while (temp != null) {
            System.out.println("ID Peminjaman : " + temp.getIdPeminjaman());
            System.out.println("Nama Member   : " + temp.getNamaGame());
            System.out.println("Nama Game     : " + temp.getNamaMember());
            System.out.println("Lama Sewa     : " + temp.getLamaSewa() + "hari");
            System.out.println("Harga         : Rp " + temp.getHarga());
            System.out.println("Harga Bayar   : " + temp.hargaPembayaran());
            System.out.println(" ");
            temp = temp.next;
        }
        System.out.println("---------------------------------");
    }

    public boolean cekGame(String namaGame) {
        Peminjaman temp = head;
        while (temp != null) {
            if (namaGame.equalsIgnoreCase(temp.getNamaGame())) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
