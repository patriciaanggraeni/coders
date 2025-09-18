package Course.A_Basic.Conversion_06;

public class Conversion {
    public static void main(String[] args) {

        // Mengkonversi dari tipe data dengan ukuran kecil ke besar (Ascending)
        // byte => short => int => long
        // float => double
        byte num = 100;
        int num2 = 1000;
        long num3 = 10000;
        int konvert = (int) num3;
        byte konvert1 = (byte) num3;

        // Ascending konversion
        int x = 5;
        byte y = (byte) x;

        System.out.println((short) num);
        System.out.println((long) num2);
        System.out.println(konvert);
        System.out.println(konvert1);
        System.out.println(Byte.MAX_VALUE);

    }
}
