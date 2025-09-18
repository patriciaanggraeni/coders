package Program.Midle.Queues.Program1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String nama, nim, posisi;
        double ipk;
        byte pilih;
        int absen, jumlah, index;

        program();
        System.out.print("Masukkan jumlah antrian: ");
        jumlah = sc2.nextInt();
        Queue antrian = new Queue(jumlah);

        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            pilih = sc2.nextByte();

            switch (pilih) {
                case 1 -> {
                    System.out.println("\n--------- Input data mahasiswa ---------");
                    System.out.print("Masukkan nama: ");
                    nama = sc1.nextLine();
                    System.out.print("Masukkan nim: ");
                    nim = sc1.nextLine();
                    System.out.print("Masukkan absen: ");
                    absen = sc2.nextInt();
                    System.out.print("Masukkan ipk: ");
                    ipk = sc3.nextDouble();

                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, absen, ipk);
                    antrian.enqueue(mahasiswa);
                    System.out.println("----------------------------------------");
                }
                case 2 -> { antrian.dequeue(); }
                case 3 -> { antrian.print(); }
                case 4 -> { antrian.getFront(); }
                case 5 -> { antrian.getRear(); }
                case 6 -> {

                    System.out.println("\n--- Posisi antrian mahasiswa ---");
                    System.out.print("Masukkan nim: ");
                    posisi = sc1.nextLine();

                    antrian.peekPosistion(posisi);
                    System.out.println("--------------------------------");
                }
                case 7 -> {

                    System.out.println("\n-- Index antrian mahasiswa --");
                    System.out.print("Masukkan index: ");
                    index = sc2.nextInt();

                    antrian.printMahasiswa(index);
                    System.out.println("-----------------------------");

                }
                case 8 -> {
                    System.out.println(" ");
                    System.out.println("Exit program..... done!");
                    return;
                }
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6
        || pilih == 7 || pilih == 8);
    }

    private static void program() {
        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println("Program Antrian KRS Mahasiswa");
        System.out.println("-----------------------------\n");
    }

    private static void menu() {
        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println("1. Tambah antrian mahasiswa");
        System.out.println("2. Hapus antrian mahasiswa");
        System.out.println("3. Tampilkan antrian mahasiswa");
        System.out.println("4. Peek mahasiswa");
        System.out.println("5. Peek rear mahasiswa");
        System.out.println("6. Peek posisi mahasiswa");
        System.out.println("7. Tampilkan data mahasiswa");
        System.out.println("8. Exit");
        System.out.println("------------------------------");
        System.out.println(" ");
    }
}
