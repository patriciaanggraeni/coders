package TugasKuliah.Semester3.Minggu6.Praktikum.Tugas;

public class DaftarGaji {
    
    Pegawai[] listPegawai;

    DaftarGaji(int n) {
        listPegawai = new Pegawai[n];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        System.out.println("\n----- Daftar Data Gaji Pegawai -----\n");

        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println("NIP Pegawai  : " + listPegawai[i].nip);
            System.out.println("Gaji Pegawai : " + listPegawai[i].nama);
            System.out.println("Nama Pegawai : " + listPegawai[i].alamat);
            System.out.println("Total Gaji   : " + listPegawai[i].getGaji());
            System.out.println(" ");
        }
        System.out.println("\n------------------------------------");

    }

}
