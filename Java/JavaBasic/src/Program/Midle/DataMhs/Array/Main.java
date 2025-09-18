package Program.Midle.DataMhs.Array;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        byte pilih, n;
        int jumlah;
        double harga;
        String no, tanggal;

        program();
        System.out.print("Masukkan jumlah struk: ");
        n = sc1.nextByte();
        System.out.println("--------------------------\n");
        Stack stack = new Stack(n);

        do {
            menu();
            System.out.print("\nMasukkan pilihan: ");
            pilih = sc1.nextByte();
            System.out.println(" ");

            switch (pilih) {
                case 1 -> {
                    System.out.println("---------------------------------");
                    System.out.print("Masukkan no transaksi: ");
                    no = sc2.nextLine();
                    System.out.print("Masukkan tanggal     : ");
                    tanggal = sc2.nextLine();
                    System.out.print("Masukkan jumlah      : ");
                    jumlah = sc1.nextInt();
                    System.out.print("Masukkan Harga       : ");
                    harga = sc3.nextDouble();

                    Stack struk = new Stack(no, tanggal, jumlah, harga);
                    stack.push(struk);
                    System.out.println("---------------------------------\n");
                }
                case 2 -> { stack.pop();}
                case 3 -> { stack.printPeek();}
                case 4 -> { stack.print();}
                case 5 -> { return; }
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    private static void program() {
        System.out.println("\n--------------------------");
        System.out.println("Program Struk dengan Stack");
        System.out.println("--------------------------");
    }

    private static void menu() {
        System.out.println("--------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Input data struk");
        System.out.println("2. Delete data struk");
        System.out.println("3. Tampilkan data peek");
        System.out.println("4. Tampilkan data struk");
        System.out.println("5. Exit");
        System.out.println("--------------------------");
    }
}
