package TugasKuliah.Semester3.Minggu3.Tugas.Nomor4;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner inputPinjaman = new Scanner(System.in);
        Scanner inputAngsuran = new Scanner(System.in);
        int pinjaman;
        float angsuran;

        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("No KTP: " + donny.getNoKTP());
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Peminjaman: S" + donny.getLimitPinjaman());
        System.out.println(" ");

        System.out.print("Masukkan jumlah pinjaman: ");
        pinjaman = inputPinjaman.nextInt();
        System.out.print("Masukkan jumlah angsuran: ");
        angsuran = inputAngsuran.nextFloat();
        System.out.println(" ");

        System.out.printf("\nMeminjam uang %d\n", pinjaman);
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.printf("\nMembayar angsuran %.1f\n", angsuran);
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.printf("\nMembayar angsuran %.1f\n", angsuran);
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        inputPinjaman.close();
        inputAngsuran.close();
    }
}
