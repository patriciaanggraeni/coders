package Course.C_StrandardClasses.L_RandomClass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Random Class, class yang bisa kita gunakan untuk men-generate random number
        *
        * */

        Random random = new Random();

        for (var i = 0; i < 1000; i++) {

            // mengenerate angka tidak lebih dari 1000
            var value = random.nextInt(1000);
            System.out.println(value);
        }

    }
}
