package Course.C_StrandardClasses.G_SystemClass;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * System Class, class yang berisikan banyak utility static method di Java
        * contoh System.out.println();
        *
        * beberapa method System Class
        *
        * - String getenv(key) : mendapatkan environment variabe os
        * - void exit(status) : menghentikan program java
        * - long currentTimeMilis() : mendapatkan waktu saat ini (dalam milisecond)
        * - long nanoTime() : mendapatkan waktu saat ini (dalam nano second)
        * - void gc() : menjalankan java garbage collection
        *
        * */

        // mengambil mili dan nano time saat ini
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        // mengambil environmen variabel
        System.out.println(System.getenv("User"));

        // menjalankan garbage collection
        System.gc();

        // mengehentikan program java
        System.exit(0);

    }
}
