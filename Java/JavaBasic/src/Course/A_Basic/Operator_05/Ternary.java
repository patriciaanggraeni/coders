package Course.A_Basic.Operator_05;

public class Ternary {
    public static void main(String[] args) {

        boolean val, sum;
        String hasil;
        int a = 15, b = 10;

        val = a > b;
        hasil = val == false ? "Salah, seharusnya 15 lebih besar dari 10" : "Benar, bahwa 10 lebih kecil dari 15";

        System.out.printf("\nApakah %d > %d?\n", a, b);
        System.out.println("Hasil ternary: " + hasil);

        sum = val != false ? false : true;

        if (sum) {
            System.out.println("Hasil ternary: Salah, seharusnya 15 lebih besar dari 10");
        } else {
            System.out.println("Hasil ternary: Benar, bahwa 10 lebih kecil dari 15");
        }
    }
}
