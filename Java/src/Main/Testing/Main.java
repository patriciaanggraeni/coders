package src.Testing;

@FunctionalInterface
interface Pow {
    double pow(double x);
}

final class SumPow implements Pow {
    
    @Override
    public double pow(double x) {
        return Math.pow(x, x);
    }

}

public class Main {
    public static void main(String[] args) {
        
        Pow result = x -> Math.pow(x, x);
        System.out.printf("Hasilnya adalah: %f", result.pow(5));

    }
}