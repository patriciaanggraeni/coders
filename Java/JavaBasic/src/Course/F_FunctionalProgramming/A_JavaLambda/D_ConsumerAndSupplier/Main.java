package Course.F_FunctionalProgramming.A_JavaLambda.D_ConsumerAndSupplier;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

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
        
        // 1. Latihan dnegan materi sebelumnya
        ArrayList<Dosen> dosen = new ArrayList<Dosen>();
        Function<Dosen, Integer> hitungBonus = temp -> (temp.getGaji() * 10) / 100;
        Predicate<Integer> cekBonus = temp -> temp >= 100_000;

        Consumer<Dosen> tampilData = temp -> {
            
            // membuat method get dari Supplier
            Supplier<String> getNama = () -> temp.getNama();
            Supplier<Integer> getGaji = () -> temp.getGaji();

            System.out.print(getNama.get() + "\t\t" + getGaji.get());
        };

        dosen.add(new Dosen("Angga", 3_000_000));
        dosen.add(new Dosen("Cantika", 1_750_000));
        dosen.add(new Dosen("Gigolo", 2_000_000));

        System.out.println("Nama\t\tGaji\t\tBonus\t\tTotal Gaji");
        for (Dosen temp : dosen) {
            if (cekBonus.test(hitungBonus.apply(temp))) {
                int bonus = hitungBonus.apply(temp);
                int total = hitungBonus.apply(temp) + temp.getGaji();

                tampilData.accept(temp);
                System.out.print("\t\t" + bonus + "\t\t" + total);
            }
            System.out.println(" ");
        }
    }
}