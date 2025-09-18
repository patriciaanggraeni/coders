package Course.F_FunctionalProgramming.A_JavaLambda.A_Concepts.Contoh5;

@FunctionalInterface
public interface SecondInterface extends FirstINterface{
    
    default void showName(Main main) {
        System.out.println("\nNama Saya adalah " + main.getNama());
        System.out.println("--------------------------");
    }
}
