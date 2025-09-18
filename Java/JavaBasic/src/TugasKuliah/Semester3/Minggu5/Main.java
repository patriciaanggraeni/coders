package TugasKuliah.Semester3.Minggu5;

public class Main {
    public static void main(String[] args) {

        Dokter angga = new Dokter("Angga191", "12345678", "13542", "Anggara Susilo", "Jalan Wahyu Hidayat II", "0895399091596");
        Pasien anggi = new Pasien("54321", "12/03/2022", "Tafftia Anggraeni", "089607810962", (byte)7);
        Obat obatBatuk = new Obat("1001", "Obat OBH Combi", 50000, 2);
        Pembayaran pembayaran = new Pembayaran("10002", obatBatuk, angga, anggi, 100000, 5000);

        pembayaran.cetakInfoPembayaran();
    }
}