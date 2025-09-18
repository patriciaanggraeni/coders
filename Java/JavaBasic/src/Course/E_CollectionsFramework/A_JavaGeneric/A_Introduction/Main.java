package Course.E_CollectionsFramework.A_JavaGeneric.A_Introduction;

public class Main {

    public static void main(String[] args) {

        /*
        * catatan :
        * - kemampuan menambahkan parameter type saat membuat class
        * - generic memungkinkan mengubah ubah tipe data dari sebuah variabel
        *
        * contoh code bukan generic :
        * - Object nama_var;
        * - nama_var = "Hello World"
        * - String val = (String) nama_var;
        *
        * Menggunakan parameter T (huruf besar). mendefinisikan type
        *   E : Element
        *   K : Key
        *   N : Number
        *   T : Type
        *   V : Value
        *   S, U, V : tipe lainnya
        *
        *   (namanya bisa terserah, jadi nggak wajib)
        *
        * syntax pembuatan objek generic :
        * NamaClass<tipe_data> nama_var = new NamaClass<tipe_data>();
        *
        * tipe data menggunakan objek bukan primitive
        * contoh : Integer, Boolean, String, etc
        *
        * bisa memberikan dua tipe data generic / multiple generic parameter type
        * syntax : NamaClass<String, integer>
        * saat membuat objekpun, harus menulis dua tipe data tersebut
        *
        * */

        // membuat objek generic baru
        Generic<String, Byte> genericData1 = new Generic<>("angga", (byte) 19);
        Generic<String, String> genericData2 = new Generic<>("Madiun", "Jawa Timur");

        // System.out.println("Hello Nama ku : " + genericData1.getGeneric1());
        // System.out.println("Saya tinggal di: " + genericData2.getGeneric2());

        genericData1.showBio();
        genericData2.showAdd();
    }
}
