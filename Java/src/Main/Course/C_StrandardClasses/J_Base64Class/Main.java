package Course.C_StrandardClasses.J_Base64Class;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * base64, berguna untuk melakukan sebuah encoding
        * berguna untuk mengubah binary data ke text yang aman
        * aman di sini bukan dari sisi security, tetapi dari kesalahan parsing
        *
        * */

        // cara mengencode sebuah string
        String name = "Patria Anggara Susilo Putra";

        // encode string
        String encode = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Hasil: " + encode);

        // decode string
        String decode = new String(Base64.getDecoder().decode(encode.getBytes()));
        System.out.println("Hasil: " + decode);
    }
}
