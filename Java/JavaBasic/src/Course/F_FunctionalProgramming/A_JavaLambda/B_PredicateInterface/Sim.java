package Course.F_FunctionalProgramming.A_JavaLambda.B_PredicateInterface;

public class Sim {
    
    private String nama;
    private byte umur;

    Sim(String nama, byte umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return this.nama;
    }

    public byte getUmur() {
        return this.umur;
    }

}
