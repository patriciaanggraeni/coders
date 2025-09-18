package Course.D_ObjectOrientedProgramming.K_Interface.Multiple;

public interface Parent2 extends Parent1 {
    
    // inisialisasi variabel, secara default akan public, static dan final
    public static final byte umur = 17; // default atribute

    // mendeklarasikan method yang akan di kontrakan kepada class yang diimplementasikan
    // secara default akan public dan abstract
    public abstract byte getUmur(); // default method
}
