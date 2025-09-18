package Course.A_Basic.DataType_04;

public class DataTypes {
    public static void main(String[] args) {

        /*
        Tipe data yang ada di bahasa pemrograman java

        1. int  : Tipe data bilangan bulat
        2. Long : Tipe data bilangan bulat (range lebih besar dari integer)
        3. Float  : Tipe data bilangan pecahan
        4. Double : Tipe data bilangan pecahan (range lebih besar dari float)
        5. char   : Tipe data karakter (hanya satu karakter)
        6. String : Tipe data karakter (lebih dari satu karakter)
        7. Boolean : Tipe data memuat true dan false (kondisi)

        */

        // Contoh tipe data int dan long
        int a = 15;
        long b = 100L;
        System.out.println("Tipe data integer : " + a);
        System.out.println("Tipe data Long    : " + b);

        // Contoh tipe data float dan double
        float c = 15.4F;
        double d = 12.4;
        System.out.println("Tipe data Float   : " + c);
        System.out.println("Tipe data Double  : " + d);

        // Contoh tipe data char dan String
        char e = 'A';
        String f = "Hello World";
        System.out.println("Tipe data Char    : " + e);
        System.out.println("Tipe data String  : " + f);

        // Contoh tipe data boolean
        boolean x = true;
        boolean y = false;
        System.out.println("Tipe data Boolean : " + x);
        System.out.println("Tipe data Boolean : " + y);

        // Nilai maks setiap tipe data
        System.out.println("\n----- Maksimum nilai dari setiap tipe data -----\n");
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE);

        System.out.println("\n----- Minimum nilai dari setiap tipe data -----\n");
        System.out.println("Byte: " + Byte.MIN_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE);

    }
}
