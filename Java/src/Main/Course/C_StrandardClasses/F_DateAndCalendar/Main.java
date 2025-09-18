package Course.C_StrandardClasses.F_DateAndCalendar;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        /*
        *
        * Class Date, class yang mempresentasikan tanggal dengan peresisi milisecond
        * namun di Class Date ini sudah banyak method yang di deprecated (tidak direkomendasikan)
        * jadi jika ingin memanipulasi tanggal, harus menggunakan kombinasi class Date dan Calendar
        *
        * sederhananya, Date untuk merepresentasikan tanggal dan Calendar untuk memanipulasi tanggal
        *
        * */

        // contoh membuat tanggal
        Date tanggal = new Date(3425261727L);
        System.out.println(tanggal);

        // contoh penggunaan class calender
        Calendar myCalendar = Calendar.getInstance();

        // cara memanipulasi tanggal
        myCalendar.add(Calendar.YEAR, 10);
        myCalendar.set(Calendar.MONTH, Calendar.JANUARY);
        myCalendar.set(Calendar.HOUR_OF_DAY, 10);

        // menampilkan hasil manipulasi tanggal
        Date hasil = myCalendar.getTime();
        System.out.println(hasil);

    }
}
