package Course.F_FunctionalProgramming.A_JavaLambda.C_FunctionInterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class Dosen {
    private String nama;
    private int gaji;

    Dosen(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return this.nama;
    }

    public int getGaji() {
        return this.gaji;
    }

}


public class Main {
    public static void main(String[] args) {

        // 1. mendeklarasikan Function
        // Syntax: Function<Param Type, Return Type> = lambda expressions;
        System.out.println("\n----- Deklarasi Lambda Expressions: Function");
        
        Function<Integer, Integer> test = number -> number + number;
        System.out.println("Hasil: " + test.apply(5));


        // 2. Menngambil panjang string
        System.out.println("\n----- Mengambil Panjang String");

        Function<String, Integer> getLength = str -> str.length();
        System.out.println("Length: " + getLength.apply("Hello World")); 


        // 3. menampilkan gaji dari objek dosen menggunakan ArrayList dan Function
        System.out.println("\n----- Menampilkan Nama dan Gaji Dosen");
        ArrayList<Dosen> dosen = new ArrayList<Dosen>();
        Function<Dosen, Integer> gaji = x -> x.getGaji();
       
        dosen.add(new Dosen("Angga", 3_000_000));
        dosen.add(new Dosen("Cantika", 1_750_000));
        dosen.add(new Dosen("Gigolo", 2_000_000));
        dosen.add(new Dosen("Casandra", 5_000_000));
        
        System.out.println("\nNama\t\tGaji");
        System.out.println("-----------------------");
        for (Dosen temp : dosen) {
            System.out.println(temp.getNama() + "\t\t" + gaji.apply(temp));
        }

        // 4. mengkombinasikan Function dan Predicate
        Predicate<Dosen> cekGaji = input -> input.getGaji() >= 2_000_000;
        Function<Dosen, Integer> cekBonus = x -> {
            int bonus = 0;

            if (x.getGaji() >= 1_000_000 && x.getGaji() <= 2_000_000) { 
                return bonus * 15 / 100;
            }  else if (x.getGaji() >= 2_000_000 && x.getGaji() <= 3_000_000) { 
                return bonus * 25 / 100;
            } else {
                return bonus * 35 / 100;
            }
        };

        System.out.println("\nNama\t\tGaji\t\tBonus\t\tTotal");
        System.out.println("-----------------------");
        for (Dosen temp : dosen) {
            Function<Dosen, Integer> totalGaji = x -> x.getGaji() + cekBonus.apply(temp);
            if (cekGaji.test(temp)) {
                System.out.println(temp.getNama() + "\t\t" + temp.getGaji() + "\t\t" + cekBonus.apply(temp) + "\t\t" + totalGaji.apply(temp));
            }
        }

        
        // 5. multiple Function
        Function<Integer, Integer> plus = x -> x + x;
        Function<Integer, Integer> times = x -> x * x;

        System.out.println("\n----- Multiple Function");

        // menggunakan method andThen()
        int hasilSatu = plus.andThen(times).apply(5);
        System.out.println("Hasil: " + hasilSatu); 

        Function<Double, Double> getPow = x -> Math.pow(x, 5);
        Function<Double, Double> getSqrt = x -> Math.sqrt(x);

        // menggunakan method compose
        double hasilDua = getPow.compose(getSqrt).apply(100.0);
        System.out.println("Hasil: " + hasilDua);

    }
}