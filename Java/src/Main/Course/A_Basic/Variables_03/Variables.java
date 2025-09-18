package Course.A_Basic.Variables_03;

public class Variables {
    public static void main(String[] args) {

        // mendeklarasikan sebuah variabel (memilih tipe data)
        // disarankan penulisan nama variabel menggunakan gaya camel case
        int a, b, c;

        // menginisialisasikan variabel (mengisi nilai)
        a = 15; // variabel a bernilai 15
        b = 20; // variabel b bernilai 20
        c = 35; // variabel c bernilai 35

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);

        System.out.println("----- Swipe variabel -----");
        int x, y, z;

        x = 5;
        y = 10;
        z = 15;

        System.out.println("\nSebelum swipe: ");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
        System.out.println("Nilai z: " + z);

        // lakukan proses swipe
        int temp1, temp2, temp3;
        temp1 = x;
        temp2 = y;
        temp3 = z;
        x = temp2;
        y = temp3;
        z = temp1;

        System.out.println("\nSesudah swipe: ");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
        System.out.println("Nilai z: " + z);
    }
}
