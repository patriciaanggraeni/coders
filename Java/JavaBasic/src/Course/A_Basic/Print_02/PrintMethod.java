package Course.A_Basic.Print_02;

public class PrintMethod {
    public static void main(String[] args) {

        // println : Tambahan baris baru setelah menampilkan data
        System.out.println("Hello World");

        // print : Tidak ada tambahan baris baru
        System.out.print("Hello World");

        /*
        printf : Menampilkan data dengan format / print format

        %d = menampilkan bilangan bulat
        %f = meampilkan bilangan pecahan
        %s = menampilkan sebuah string
        %b = menampilkan boolean

        tidak hanya bisa menampung variabel saja, tapi fungsi dengan return nilai
        */

        System.out.printf("\nData integer : %d", 10);
        System.out.printf("\nData Float   : %.1f", 10.4);
        System.out.printf("\nData String  : %s", "Hello World");
        System.out.printf("\nData Boolean : %b", true);
    }
}
