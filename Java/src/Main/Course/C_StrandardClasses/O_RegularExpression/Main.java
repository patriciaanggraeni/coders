package Course.C_StrandardClasses.O_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Regular Expression, disingkat regex cara untuk melakukan pada pencarian
        * biasanya dilakukan untuk pencarian data string
        * regex merupakan pencarian lebih advanced dibanding pencarian biasa, misal
        * ingin mencari semua kata yang menngandung awalan huruf a dan diakhiri huruf a juga
        * dan lain lain (pokman seng aneh aneh)
        *
        *
        * import dari java.util.regex
        * terdapat 2 class yang dapat digunakan, yaitu Pattern dan Matcher
        * Pattern Class: representasi hail kompilasi dari pola regular yang kita buat
        * Matcher Class: engine untuk melakukan pencarian dari pattern yang kita buat
        * 2 class harus dijalankan
        *
        * */

        String nama = "Patria Anggara Susilo Putra";

        // buat patternnya dulu
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        // lalu buat matchernya
        Matcher matcher = pattern.matcher(nama);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }

    }
}
