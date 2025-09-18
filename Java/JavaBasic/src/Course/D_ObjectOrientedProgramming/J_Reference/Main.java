package Course.D_ObjectOrientedProgramming.J_Reference;

public class Main {
    public static void main(String[] args) {

        // instansiasi objek baru
        Mobil mobil = new Mobil("Toyota","Merah",20000000);
        mobil.print();


        // menampilkan alamat objek
        String alamat = Integer.toHexString(System.identityHashCode(mobil));
        System.out.println("Alamat: " + alamat);
        System.out.println(" ");

        // membuat objek baru
        Mobil mobil2 = mobil;
        mobil2.print();
        String alamat2 = Integer.toHexString(System.identityHashCode(mobil2));
        System.out.println("Alamat: " + alamat2);

        // output diatas akan mengshasilkan alamat yang sama
        // ini akan berpengaruh saat ingin memodifikasi data
        // karena satu yang diganti, semuanya akan tergantikan

        System.out.println(" ");
        address(mobil);
        address(mobil2);
        mobil.print();
        mobil2.print();
    }

     private static void address(Mobil data) {
        String alamat = Integer.toString(System.identityHashCode(data));
        System.out.println("Alamat: " + alamat);
        data.merk = "Kijang";
    }
}
