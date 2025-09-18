package Course.A_Basic.Operator_05;

public class Assignment {
    public static void main(String[] args) {

        /*
            nilai yang dimanipulasi akan tersipan di variabel ini, biasanya
            digunakan untuk menhghitung total suatu operasi / mencari sum
         */

        int assign = 5;

        assign += 10; // ditambah sama dengan
        assign -= 5;  // dikurang sama dengan
        assign *= 2;  // dikali sama dengan
        assign /= 2;  // dibagi sama dengan
        assign %= 2;

        System.out.println("Total assign : " + assign);
    }
}
