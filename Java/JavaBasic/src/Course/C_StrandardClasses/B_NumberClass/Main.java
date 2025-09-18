package Course.C_StrandardClasses.B_NumberClass;

public class Main {
    public static void main(String[] args) {
        
        /*
        * Strandart Class Java : Number Class
        *
        * method untuk mengkonversi tipe data number ke tipe data lainnya, menggunakan fungsi:
        * - intValue()     : untuk mengkonversi menjadi nilai integer
        * - floatValue()   : untuk mengkonversi menjadi nilai float
        * - doubleValue()  : untuk mengkonversi menjadi nilai double
        * - longValue()    : untuk mengkonversi menjadi nilai long
        * - dan masih banyak lagi (untuk tipe data primitive)
        * */

        // contoh mengkonversi nilai integer ke long dan long ke double
        // khusus objek
        Integer x = 1000;
        Long convertToLong = x.longValue();
        Double convertToDouble = convertToLong.doubleValue();

        /*
        *
        * di Java bisa mengkonversi String menjadi Bilangan, dengan cara
        *
        * - menggunakan fungsi parseXxx(string) dan valueOf(string)
        * - untuk fungsi parseXxx(string) : mengkonversi dari string ke tipe data primitive
        * - untuk fungsi valueOf(string)  : mengkonversi dari string ke tipe data non primitive
        * - jka gagal, program akan men-throw NumberFormatExeption (nggak masalah)
        *
        * */

        String num1 = "5000";
        String num2 = "2000";

        // casting ke tipe data primitive
        int convertNum1 = Integer.parseInt(num1);
        int convertNum2 = Integer.parseInt(num2);
        System.out.println("Hasil adalah " + (convertNum1 + convertNum2));


        // casting ke tipe data objek / non primitive
        Integer convertNum1Obj = Integer.valueOf(num1);
        Integer convertNum2Obj = Integer.valueOf(num2);
        System.out.println("Hasil adalah " + (convertNum1 + convertNum2));
    }
}
