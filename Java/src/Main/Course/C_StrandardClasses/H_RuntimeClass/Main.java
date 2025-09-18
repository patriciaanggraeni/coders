package Course.C_StrandardClasses.H_RuntimeClass;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Runtime Class, saat program berjalan, kita bisa melihat informasi environtment tempat aplikasi
        * Java berjalan
        * informasi itou terdapat di class Runtime
        * Class Runtime sendiri tidak bisa dibuat, jadi sudah otomatis dibuat oleh Java, dan
        * Java kaan membuat single object. object tersebut bisa diakses menggunakan static method
        * yaitu getRuntime() milik Class Runtime
        *
        * sontoh beberapa mehtod runtime:
        * - int availableProcessors() : mendapatkan jumlah core CPU
        * - long freeMemory()  : mendapatkan jumlah memoty bebas di JVM
        * - long totalMemory() : mendapatkan jumlah memory di JVM
        * - long maxMemory()   : mendapatkan jumlah maksimum memory di JVM
        * - void gc() : menjalankan garbage collector
        *
        * */

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());

    }
}
