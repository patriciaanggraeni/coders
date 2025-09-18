package Program.Midle.DataMhs.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String nama, nim, status;
        byte konfirm;
        float ipk;

        Mahasiswa dataMhs = new Mahasiswa();

        do {
            System.out.println("Ingin input data? ");
            konfirm = sc1.nextByte();

            switch (konfirm) {
                case 1 -> {
                    System.out.println("Masukkan nama   : ");
                    nama = sc2.nextLine();
                    System.out.println("Masukkan NIM    : ");
                    nim = sc2.nextLine();
                    System.out.println("Masukkan IPK    : ");
                    ipk = sc3.nextFloat();
                    System.out.println("Masukkan Status : ");
                    status = sc2.nextLine();

                    Node newNode = new Node(nama, nim, ipk, status);
                    dataMhs.addFirst(newNode);

                    dataMhs.printData();
                }
                case 2 -> {
                    System.out.println("Masukkan nama   : ");
                    nama = sc2.nextLine();
                    System.out.println("Masukkan NIM    : ");
                    nim = sc2.nextLine();
                    System.out.println("Masukkan IPK    : ");
                    ipk = sc3.nextFloat();
                    System.out.println("Masukkan Status : ");
                    status = sc2.nextLine();

                    Node newNode = new Node(nama, nim, ipk, status);
                    dataMhs.addLast(newNode);

                    dataMhs.printData();
                }

                case 3 -> {
                    System.out.print("Masukkan index: ");
                    int index = sc3.nextInt();

                    System.out.println("Masukkan nama   : ");
                    nama = sc2.nextLine();
                    System.out.println("Masukkan NIM    : ");
                    nim = sc2.nextLine();
                    System.out.println("Masukkan IPK    : ");
                    ipk = sc3.nextFloat();
                    System.out.println("Masukkan Status : ");
                    status = sc2.nextLine();

                    Node newNode = new Node(nama, nim, ipk, status);
                    dataMhs.add(newNode, index);

                    dataMhs.printData();
                }

                case 4 -> {
                    dataMhs.removeFirst();
                }

            }

            System.out.println("\nJumlah data: " + dataMhs.length());
        } while(konfirm == 1 || konfirm == 2 || konfirm == 3 || konfirm == 4 || konfirm == 5);
    }
}