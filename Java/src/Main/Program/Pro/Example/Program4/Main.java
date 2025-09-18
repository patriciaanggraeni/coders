package Program.Pro.Example.Program4;
import java.util.Scanner;

public class Main {

    private static void program() {
        System.out.println(
        """
        -----------------------------------------
        ----- Program Antrian KRS Mahasiswa -----
        ---------- Dengan Linked List -----------
        -----------------------------------------
        
        1. Tambah antrian
        2. Hapus antrian
        3. Tampilkan antrian
        4. Tampilkan antrian terdepan
        5. Tampilkan antrian terbelakang
        6. Cari antrian berdasarkan nim
        7. Cari data antrian berdasarkan index
        0. Exit
        -----------------------------------------
        """);
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        Queue antrian = new Queue();
        String nama, nim;
        int absen;
        double ipk;
        byte pilih;

        do {
            program();
            System.out.print("Masukkan pilihan >> ");
            pilih = sc2.nextByte();

            switch (pilih) {
                case 1 -> {
                    System.out.println(" ");
                    System.out.print("Masukkan nama  >> ");
                    nama = sc1.nextLine();
                    System.out.print("Masukkan NIM   >> ");
                    nim = sc1.nextLine();
                    System.out.print("Masukkan Absen >> ");
                    absen = sc2.nextInt();
                    System.out.print("Masukkan IPK   >> ");
                    ipk = sc3.nextDouble();

                    Node data = new Node(nama, nim, absen, ipk);
                    antrian.enqueue(data);
                }
                case 2 -> antrian.dequeue();
                case 3 -> antrian.print();
                case 4 -> antrian.getFront();
                case 5 -> antrian.getRear();
                case 6 -> {
                    System.out.print("\nMasukkan nim >> ");
                    String input = sc1.nextLine();

                    antrian.getPosition(input);
                }
                case 7 -> {
                    System.out.print("\nMasukkan index >> ");
                    int index = sc2.nextInt();

                    antrian.printMahasiswa(index);
                }
                case 0 -> { return; }
            }


        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6
                 || pilih == 7 || pilih == 0);
    }
}
