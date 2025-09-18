package Program.Midle.BankingSystem;

import java.util.Scanner;

public class Bank {

    private String nomorAkun;
    private String nama;
    private String tipeAkun;
    private long saldo;
    Scanner sc = new Scanner(System.in);

    Bank() {}

    protected void bukaAkun() {
        System.out.print("Masukkan nomor akun: ");
        nomorAkun = sc.next();
        System.out.print("Masukkan tipe akun: ");
        tipeAkun = sc.next();
        System.out.print("Masukkan nama : ");
        nama = sc.next();
        System.out.print("Masukkan saldo: ");
        saldo = sc.nextLong();
    }

    protected void tampilkanDataAkun() {
        System.out.println("Nama Nasabah: " + this.nama);
        System.out.println("Nomor Akun: " + this.nomorAkun);
        System.out.println("Tipe Akun: " + this.tipeAkun);
        System.out.println("Jumlah Saldo: " + this.saldo);
    }

    protected void deposit() {
        long x;

        System.out.println("Masukkan jumlah deposit: ");
        x = sc.nextLong();
        this.saldo += x;
    }

    protected void tarikUang() {
        long x;
        System.out.println("Masukkan jumlah penarikan: ");
        x = sc.nextLong();

        if (saldo >= x) {
            saldo -= x;
            System.out.println("Sisa saldo: " + this.saldo);
        } else {
            System.out.println("Tidak dapat melakukan penarikan, jumlah saldo tidak mencukupi!");
        }
    }

    protected boolean search(String cariNomor) {
        if (nomorAkun.equals(cariNomor)) {
            tampilkanDataAkun();
            return true;
        }
        return false;
    }
}